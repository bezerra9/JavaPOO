package calculo_retangulo;
import java.util.Scanner;
public class LerRetangulo {
  
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo();
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a base do retângulo: ");
    retangulo.base = sc.nextInt();

    while (retangulo.base != 0 ) {
      System.out.print("Digite a altura do retangulo: ");
      retangulo.altura = sc.nextInt();
      retangulo.mostrarDados();
      System.out.print("Digite a base do retângulo: ");
      retangulo.base = sc.nextInt();
    }
    sc.close();
  }
}
