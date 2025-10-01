package partidos;
import java.util.Scanner;

public class LerPartido {
  public static void main(String[] args) {
    int numeroAssinaturasMinimas, somaAprovados = 0;
    Partido menorPartido = new Partido();
    Partido maiorPartido = new Partido();
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a quantidade de partidos");
    Partido partido[] = new Partido[sc.nextInt()];
    menorPartido.filiados = 0;
    maiorPartido.filiados = 0;
    System.out.print("Digite o numero de assinaturas minimas: ");
    numeroAssinaturasMinimas = sc.nextInt();

    for (int i=0; i < partido.length; i++) {
      partido[i] = new Partido();
      System.out.print("Código partido: ");
      partido[i].codigo = sc.nextInt();
      System.out.print("Descrição: ");
      partido[i].descricao = sc.next();
      System.out.print("Presidente: ");
      partido[i].presidente = sc.next();
      System.out.print("Filiados: ");
      partido[i].filiados = sc.nextInt();
      System.out.print("Assinaturas: ");
      partido[i].assinaturas = sc.nextInt();
      if (i == 0) {
        menorPartido = partido[i];
        maiorPartido = partido[i];
      }

      if (partido[i].aprovado(numeroAssinaturasMinimas).equals("Sim")) {
        somaAprovados += partido[i].filiados;
      }
      if (maiorPartido.filiados < partido[i].filiados) {
        maiorPartido = partido[i];
      }
      if (partido[i].aprovado(numeroAssinaturasMinimas).equals("Sim") && partido[i].filiados < menorPartido.filiados) {
        menorPartido = partido[i];
      }
    }
    for (int i=0; i<partido.length; i++) {
      partido[i].mostrarDados();
      System.out.println("Aprovado: " + partido[i].aprovado(numeroAssinaturasMinimas));
      System.out.println("Classificação: " + partido[i].classificacao(numeroAssinaturasMinimas));
    }

    System.out.println("Soma dos filiados: " + somaAprovados);
    System.out.println("Maior partido: " + maiorPartido.descricao + " " +  maiorPartido.filiados);
    System.out.println("Menor partido: " + menorPartido.descricao + " " +  menorPartido.filiados);
    

    sc.close();
  }
}
