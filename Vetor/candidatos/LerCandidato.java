package Vetor.candidatos;
import java.util.Scanner;

public class LerCandidato {
  
  public static void main (String[] args) {
    int votosMinimos;
    int somaVotos = 0;
    float media = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de candidatos: ");
    Candidato candidato[] = new Candidato[sc.nextInt()];
    Candidato maisVotado = new Candidato();

    System.out.print("Digite a quantidade de votos minimos: ");
    votosMinimos = sc.nextInt();

    for(int i=0; i<candidato.length; i++) {
      candidato[i] = new Candidato();
      System.out.print("Numero: ");
      candidato[i].numero = sc.nextInt();

      System.out.print("Nome: ");
      candidato[i].nome = sc.next();

      System.out.print("Votos: ");
      candidato[i].votos = sc.nextInt();

      somaVotos += candidato[i].votos;

      if(i==0){
        maisVotado = candidato[i];
      }

      if (candidato[i].votos > maisVotado.votos) {
        maisVotado = candidato[i];
      }
    }
    media = somaVotos / candidato.length;

    for(int i=0; i<candidato.length; i++) {
      System.out.println("Numero: " + candidato[i].numero);
      System.out.println("Nome: " + candidato[i].nome);
      System.out.println("Votos: " + candidato[i].votos);
      System.out.println("Classificado: " + candidato[i].classificado(votosMinimos));
    }

    System.out.println("Soma dos votos: " + somaVotos);
    System.out.println("Média dos votos: " + media);
    System.out.println("Mais votado foi " + maisVotado.nome + " com " + maisVotado.votos + " votos");


    sc.close();
  }
}
