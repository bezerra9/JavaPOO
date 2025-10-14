package Heranca.RetanguloParalelepipedo;
import java.util.Scanner;

public class LerParalelepipedo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Paralelepipedo p1 = new Paralelepipedo();
    Paralelepipedo p2 = new Paralelepipedo(5, 8, 12);
    p2.mostrarDados();
    System.out.println("Dados do paralelepipedo");
    System.out.print("Informe a base -> ");
    p1.setLadoa(sc.nextFloat());
    while (p1.getLadoa() != 0) {
      System.out.print("Informe a largura -> ");
      p1.setLadob(sc.nextFloat());
      System.out.print("Informe a altura -> ");
      p1.setLadoc(sc.nextFloat());
      p1.mostrarDados();
      System.out.print("Informe a base -> ");
      p1.setLadoa(sc.nextFloat());
    }

    sc.close();
  }
}
