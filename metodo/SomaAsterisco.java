package metodo;
import java.util.Scanner;

public class SomaAsterisco {
  public static String somaNumeros(int n1, int n2) {
    String resultado = "";
    int soma = 0, digito1;
    while(n1 != 0) {
      digito1 = n1 % 10;
      soma = digito1 + n2;
      if (soma < 10) {
        resultado = soma + resultado;
      } else {
        resultado = resultado + "*";
      }
      n1 /= 10;
    }
    return resultado;
  }

  
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero1, numero2;

    System.out.print("Digite um numero: ");
    numero1 = sc.nextInt();

    while (numero1 != 0) {
      System.out.print("Digite outro numero: ");
      numero2 = sc.nextInt();
      System.out.println(somaNumeros(numero1, numero2));
      System.out.print("Digite um numero: ");
      numero1 = sc.nextInt();
    }
  }
}
