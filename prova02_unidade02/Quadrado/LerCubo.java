package prova02_unidade02.Quadrado;

import java.util.Scanner;

public class LerCubo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cubo c = new Cubo(5);


    while(c.getLado() != 0) {
      c.mostrarDados();

      System.out.print("Digite o lado: ");
      c.setLado(sc.nextDouble());
    }
    sc.close();
  }
}
