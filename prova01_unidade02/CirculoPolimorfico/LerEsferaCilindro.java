package prova01_unidade02.CirculoPolimorfico;
import java.util.Scanner;

public class LerEsferaCilindro {
  public static char lerTipo(Scanner sc) {
    char tipo;
    do {
      System.out.println("Informe 'E' para Esfera, 'C' para Cilindro ou 'F' para Fim->");
      tipo = sc.next().charAt(0);
    } while ((tipo != 'E') && (tipo != 'C') && (tipo != 'F'));


    return tipo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Circulo c1 = null;
    char tipo;

    tipo = lerTipo(sc);

    while (tipo != 'F') {
      switch(tipo) {
        case 'C':
          c1 = new Cilindro(0, 0);
          break;
        case 'E':
          c1 = new Esfera(0);
          break;
        default:
          break;
      }

      System.out.print("Digite o raio: ");
      c1.setRaio(sc.nextDouble());

      if(c1 instanceof Cilindro) {
        System.out.print("Digite a altura: ");
        ((Cilindro)c1).setAltura(sc.nextDouble());
      }

      c1.mostrarDados();
      tipo = lerTipo(sc);
    }
    sc.close();
  }
}
