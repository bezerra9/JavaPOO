package Polimorfismo.figuraPlana;
import java.util.Scanner;

public class LerFiguraPlana {
  public static char lerTipo(Scanner sc) {
    System.out.println("Informe se é 'R' para retângulo, 'C' para circulo, 'F' para sair");
    char tipo = sc.next().charAt(0);
    
    while(tipo != 'R' && tipo != 'C' && tipo != 'F') {
      System.out.println("Informe se é 'R' para retângulo, 'C' para circulo, 'F' para sair");
      tipo = sc.next().charAt(0);
    }

    return tipo;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    figuraPlana fp = new figuraPlana();
    char tipo;
    tipo = lerTipo(sc);

    while (tipo != 'F') {
      switch (tipo) {
        case 'R':
          fp = new Retangulo(0,0);
          System.out.println("Informe a base ");
          ((Retangulo) fp).setLadoa(sc.nextFloat());
          System.out.println("Informe a altura");
          ((Retangulo) fp).setLadob(sc.nextFloat());
          break;
        case 'C':
          fp = new Circulo(0);
          System.out.println("Informe o raio");
          ((Circulo) fp).setRaio(sc.nextFloat());
          break;
      }
      fp.mostrarDados();
      if(fp instanceof Circulo) {
        System.out.println("Área em PI do " + "circulo com comprimento 20 PI" + ((Circulo) fp).area(20));
      }
      tipo = lerTipo(sc);
    }
  }
} 
