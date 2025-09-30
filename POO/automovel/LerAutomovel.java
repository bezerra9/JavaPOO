package automovel;
import java.util.Scanner;

public class LerAutomovel {
  public static void main(String[] args) {
    int kmAndado = 0;
    Automovel automovelConsome = new Automovel();
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de automoveis");
    Automovel automovel[] = new Automovel[sc.nextInt()];

    

    for (int i=0; i < automovel.length; i++) {
      automovel[i] = new Automovel();

      System.out.print("Chassi: ");
      automovel[i].chassi = sc.nextInt();

      System.out.print("Marca: ");
      automovel[i].marca = sc.next();

      System.out.print("Modelo: ");
      automovel[i].modelo = sc.next();

      System.out.print("Capacidade de tanque: ");
      automovel[i].capacidadeTanque = sc.nextInt();

      System.out.print("Quantidade atual: ");
      automovel[i].qntdAtual = sc.nextInt();

      System.out.print("Consumo: ");
      automovel[i].consumo = sc.nextFloat();

      System.out.print("digite a quantidade de KM's andados: ");
      kmAndado = sc.nextInt();
      

      if (i==0) {
        automovelConsome = automovel[i];
      }

      if (automovelConsome.calcConsumo(kmAndado) < automovel[i].calcConsumo(kmAndado)) {
        automovelConsome = automovel[i];
      }
    }

    System.out.println("Mostrando dados: ");

    for(int i=0; i < automovel.length; i++) {
      System.out.println("Chassi: " + automovel[i].chassi);
      System.out.println("Marca: " + automovel[i].marca);
      System.out.println("Modelo: " + automovel[i].modelo);
      System.out.println("Capacidade de tanque: " + automovel[i].capacidadeTanque);
      System.out.println("Quantidade atual: " + automovel[i].qntdAtual);
      System.out.println("Consumo: " + automovel[i].consumo);
      System.out.println("Calculo do Consumo: " + automovel[i].calcConsumo(kmAndado));
    }
    
    System.out.println("automovel que mais consumiu: ");
    System.out.println("Chassi: " + automovelConsome.chassi);
    System.out.println("Marca: " + automovelConsome.marca);
    System.out.println("Modelo: " + automovelConsome.modelo);
    System.out.println("Capacidade de tanque: " + automovelConsome.capacidadeTanque);
    System.out.println("Quantidade atual: " + automovelConsome.qntdAtual);
    System.out.println("Consumo: " + automovelConsome.consumo);
    System.out.println("Calculo do Consumo: " + automovelConsome.calcConsumo(kmAndado));


    sc.close();
  }
}
