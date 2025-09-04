package metodo;
import java.util.Scanner;

public class SomaNumeros {

  public static String desmembre (int numero){
    int resultadoSoma = 0;
    String resultado = "";
    int numeroTemp = numero;

    while (numero != 0) {
      numeroTemp = numero % 10;
      resultadoSoma = resultadoSoma + numeroTemp;
      if(resultado.length() == 0) {
        resultado =  numeroTemp + ""; 
      } else {
        resultado = resultado + " + " + numeroTemp;
      }

      numero = numero / 10;
    }

    return resultado + " = " + resultadoSoma;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 1;

    System.out.println("Soma de numeros");
/*     System.out.print("Digite um numero: ");
    numero = sc.nextInt();
    System.out.println(desmembre(numero)); */

    while (numero != 0) {
      System.out.print("Digite um numero: ");
      numero = sc.nextInt();
      System.out.println(desmembre(numero));
    }


    sc.close();
  }
}
