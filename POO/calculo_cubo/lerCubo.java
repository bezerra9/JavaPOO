package calculo_cubo;
import java.util.Scanner;

public class lerCubo {
  
  public static void main () {
    Cubo cubo = new Cubo();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a Aresta: ");
    cubo.aresta = sc.nextInt();

    while ( cubo.aresta != 0) {
      cubo.mostrarDados();
      System.out.print("Digite a Aresta: ");
      cubo.aresta = sc.nextInt();
    }
    sc.close();
  }
}
