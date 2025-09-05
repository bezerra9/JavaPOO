package metodo;
import java.util.Scanner;

public class SomaPares {

  public static String calculaPar (int numero){
    String resultado = "";
    int digitoN, somaPar = 0;
    digitoN = numero;

    while (numero != 0) {
      digitoN = numero % 10;
      if(digitoN % 2 == 0) {
        somaPar += digitoN;
        if (resultado.length() == 0) {
          resultado = digitoN + "";
        } else {
          resultado = digitoN + " + " + resultado;
        }
      }
      numero = numero / 10;
    }



    return resultado + " = " + somaPar;
  }
  
  public static void main() {
    Scanner sc = new Scanner(System.in);
    int numero = 1;

    while (numero != 0) {
      System.out.print("Digite um numero: ");
      numero = sc.nextInt();
      System.out.println(calculaPar(numero));
    }

    sc.close();
  }
}
