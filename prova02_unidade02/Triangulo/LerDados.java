package prova02_unidade02.Triangulo;
import java.util.Scanner;

public class LerDados {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PiramideTriangular pt = new PiramideTriangular(5, 10, 5);

    while (pt.getLado() != 0) {

      pt.mostrarDados();
      
      System.out.print("Digite o lado ");
      pt.setLado(sc.nextDouble());

      System.out.print("Digite a altura ");
      pt.setAltura(sc.nextDouble());

      System.out.print("Digite a apotema ");
      pt.setApotema(sc.nextDouble());
    }
    sc.close();
  }
}
