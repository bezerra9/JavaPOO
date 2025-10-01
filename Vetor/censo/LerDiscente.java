package Vetor.censo;
import java.util.Scanner;

public class LerDiscente {
  public static void main (String[] args) {
    int cargaHorCumpridaD = 0;
    Scanner sc = new Scanner(System.in);
    Discente melhorDiscente = new Discente();
    float media = 0;

    System.out.print("Digite a quantidade de alunos: ");
    Discente discente[] = new Discente[sc.nextInt()];

    System.out.print("Digite uma carga horaria a ser cumprida pelo aluno");
    cargaHorCumpridaD = sc.nextInt();

    for(int i=0; i<discente.length; i++) {
      discente[i] = new Discente();

      System.out.print("CPF: ");
      discente[i].cpf = sc.nextInt();

      System.out.print("Nome: ");
      discente[i].nome = sc.next();

      System.out.print("Id instituição: ");
      discente[i].idInstituição = sc.nextInt();

      System.out.print("Id curso: ");
      discente[i].idCurso = sc.nextInt();

      System.out.print("Data de nascimento: ");
      discente[i].dataNasc = sc.next();

      System.out.print("Carga horária cumprida: ");
      discente[i].cargaHorCumprida = sc.nextInt();

      System.out.print("Carga horária total: ");
      discente[i].cargaHorTotal = sc.nextInt();

      if(i==0) {
        melhorDiscente = discente[i];
      }

      if (discente[i].percentual() > melhorDiscente.percentual()) {
        melhorDiscente = discente[i];
      }

      media += discente[i].percentual();
    }

    media = media / discente.length;

    for(int i=0; i<discente.length; i++) {
      int item = i + 1;
      System.out.println("Item: " + item);
      System.out.println("CPF: " + discente[i].cpf);
      System.out.println("Nome: " + discente[i].nome);
      System.out.println("Curso: " + discente[i].idCurso);
      System.out.println("Carga horária aluno: " + discente[i].cargaHorCumprida);
      System.out.println("Carga horária total: " + discente[i].cargaHorTotal);
      System.out.println("Percentual: " + discente[i].percentual());
      System.out.println("Percentual 2: " + discente[i].percentual(cargaHorCumpridaD));
      System.out.println("---------------------------------------");
    }

    System.out.println("Percentual médio de cumprimento foi: " + media);
    System.out.println("Maior percentual cumprido foi do Aluno: " + melhorDiscente.nome + " com " + melhorDiscente.percentual());
    sc.close();
  }
}
