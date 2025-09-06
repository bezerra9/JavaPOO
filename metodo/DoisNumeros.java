package metodo;
import java.util.Scanner;

public class DoisNumeros {
  

  public static String divisao(int n1, int n2) {
    String resultado = "";
    int resultadoConta;
    int d1, d2;
    while (n1 != 0) {
      d1 = n1 % 10;
      d2 = n2 % 10; 
      resultadoConta = d1 % d2;
      resultado = resultadoConta + resultado + "";
      n1 = n1 / 10;
      n2 = n2 / 10; 
    }
    return resultado;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero1, numero2;

    System.out.print("digite o numero 1: ");
    numero1 = sc.nextInt();

    while (numero1 != 0) {
      System.out.print("digite o numero 2: ");
      numero2 = sc.nextInt();
      System.out.println(divisao(numero1, numero2));
      System.out.print("digite o numero 1: ");
      numero1 = sc.nextInt();
    }
    sc.close();
  }
}

            
