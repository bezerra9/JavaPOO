package metodo;
import java.util.Scanner;

public class Exemplo01 {

  public static void calculo (int numero) {
    if (numero % 2 == 0) {
      mostrarln("é par");
    } else {
      mostrarln("é ímpar");
    }
  }
  public static void mostrar(String frase) {
    System.out.print(frase);
  }
  public static void mostrarln(String frase) {
    System.out.println(frase);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    mostrar("Digite um número: ");
    numero = sc.nextInt();
    calculo(numero);

    while (numero != 0) {
      mostrar("Digite um número: ");
      numero = sc.nextInt();
      calculo(numero);
    }


    sc.close();
  }
}
