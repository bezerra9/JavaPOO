package controle_automoveis;
import java.util.Scanner;

public class LerAutomovel {
  

  public static void main(String[] args) {
    float somaTotalAb = 0;
    Scanner sc = new Scanner(System.in);  
    System.out.print("Digite a quantidade de carros: ");
    Automovel automovel[] = new Automovel[sc.nextInt()];
    Automovel melhorConsumo = new Automovel();
    int numero = 0;

    for (int i=0; i<automovel.length; i++) {
      automovel[i] = new Automovel();
      System.out.print("Código: ");
      automovel[i].codigo = sc.nextInt();

      System.out.print("Descrição: ");
      automovel[i].descricao = sc.next();

      System.out.print("Capacidade Tanque: ");
      automovel[i].capacidadeTanque = sc.nextInt();

      System.out.print("Litros Abastecidos: ");
      automovel[i].litrosAbastecidos = sc.nextFloat();

      System.out.print("Kilometragem rodada: ");
      automovel[i].kmRodado = sc.nextFloat();

      somaTotalAb += automovel[i].litrosAbastecidos;

      if (i==0) {
        melhorConsumo = automovel[i];
        numero = i + 1;
      }

      if(melhorConsumo.consumo() < automovel[i].consumo()) {
        melhorConsumo = automovel[i];
        numero = i + 1;
      }
    }

    for (int i=0; i<automovel.length; i++) {
      System.out.println("Mostrando carro " + (i + 1) + ": ");
      System.out.println("Código: " + automovel[i].codigo);
      System.out.println("Descrição: " + automovel[i].descricao);
      System.out.println("Litros abastecidos: " + automovel[i].litrosAbastecidos);
      System.out.println("Kilometragem rodada: " + automovel[i].kmRodado);
      System.out.println("Consumo: " + automovel[i].consumo());
      System.out.println("Classificação: " + automovel[i].classificacao());
    }

    System.out.println("Total litros abastecidos: " + somaTotalAb);
    System.out.println("O melhor consumo foi: " + melhorConsumo.consumo() + ", do automovel " + numero + " - " + melhorConsumo.descricao);

    sc.close();
  }
}
