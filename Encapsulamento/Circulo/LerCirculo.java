package Encapsulamento.Circulo;
import java.util.Scanner;

public class LerCirculo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Circulo circulo = new Circulo();
    circulo.setRaio(sc.nextInt());
    while(circulo.getRaio() != 0) {
      System.out.println(circulo.getRaio() + " = " + circulo.calcularArea());
      System.out.println("Digite o raio: ");
      circulo.setRaio(sc.nextInt());
    }
    sc.close();
  }
}
