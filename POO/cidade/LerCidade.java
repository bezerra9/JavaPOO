package cidade;
import java.util.Scanner;

public class LerCidade {
  
  public static void main(){
    int numero = 0; 
    float ideal;
    int somaPopulacao = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a quantidade de cidades: ");
    Cidade maiorDensidadeCidade = new Cidade();
    Cidade cidade[] = new Cidade[sc.nextInt()];
    System.out.print("Digite a densidade demografica ideal: ");
    ideal = sc.nextFloat();

    for(int i=0; i<cidade.length; i++) {
      cidade[i] = new Cidade();
      System.out.print("Código: ");
      cidade[i].codigo = sc.nextInt();

      System.out.print("Descrição: ");
      cidade[i].descricao = sc.next();

      System.out.print("População: ");
      cidade[i].populacao = sc.nextInt();

      System.out.print("Área: ");
      cidade[i].area = sc.nextFloat();

      somaPopulacao += cidade[i].populacao;

      if(i==0) {
        numero = i + 1;
        maiorDensidadeCidade = cidade[i];
      }

      if (maiorDensidadeCidade.densidadeDemografica() < cidade[i].densidadeDemografica()) {
        numero = i + 1;
        maiorDensidadeCidade = cidade[i];
      }

    }

    for(int i=0; i<cidade.length; i++) {
      cidade[i].mostrarDados();
      if(cidade[i].densidadeDemografica() < ideal) {
        System.out.println("Ideal: Não");
      } else {
        System.out.println("Ideal: Sim");
      }
    }

    System.out.println("Soma das populações: " + somaPopulacao);
    System.out.println("A cidade com maior densidade demografica = " + maiorDensidadeCidade.densidadeDemografica() + " habitantes/km² da cidade " + numero + " " + maiorDensidadeCidade.descricao);

    sc.close();
  }
}
