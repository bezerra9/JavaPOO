package Vetor.aluno;
import java.util.Scanner;

public class LerAluno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float mediaGeral = 0;
    System.out.print("Digite a quantidade de alunos: ");
    Aluno aluno[] = new Aluno[sc.nextInt()];
    Aluno menor = new Aluno();
    Aluno maior = new Aluno();

    for(int i=0;i<aluno.length; i++) {
      aluno[i] = new Aluno();

      System.out.print("Codigo: ");
      aluno[i].codigo = sc.nextInt();

      System.out.print("Nome: ");
      aluno[i].nome = sc.next();

      System.out.print("Nota 1: ");
      aluno[i].nota1 = sc.nextFloat();

      System.out.print("Nota 2: ");
      aluno[i].nota2 = sc.nextFloat();

      System.out.print("Nota 3: ");
      aluno[i].nota3 = sc.nextFloat();

      mediaGeral += aluno[i].media();
      
      if(i==0) {
        menor = aluno[i];
        maior = aluno[i];
      }

      if(menor.media() > aluno[i].media()) {
        menor = aluno[i];
      }

      if (aluno[i].media() > maior.media()) {
        maior = aluno[i];
      }
    }
    mediaGeral = mediaGeral / aluno.length;

    System.out.println("A soma das médias: " + mediaGeral);
    System.out.println("A maior média entre alunos: " + maior.media());
    System.out.println("A menor média entre alunos: " + menor.media());
    


    sc.close();
  }
}
