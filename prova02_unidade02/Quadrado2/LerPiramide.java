package prova02_unidade02.Quadrado2;
import java.util.Scanner;

public class LerPiramide {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Piramide p = new Piramide(5, 2);

    while (p.getLado() != 0) {
      p.mostrarDados();

      System.out.print("Digite a altura ");
      p.setAltura(sc.nextDouble());

      System.out.print("Digite o lado ");
      p.setlado(sc.nextDouble());
    }
    sc.close();
  }
}
