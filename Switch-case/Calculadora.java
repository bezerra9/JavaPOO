import java.util.Scanner;
public class Calculadora {
  
  public static void main(String[]args) {
    float resultado, v1, v2;
    int valor;
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculadora!");
    System.out.println("Digite um numero para fazer uma operação: ");
    System.out.println("1 - Somar: ");
    System.out.println("2 - Subtrair: ");
    System.out.println("3 - Multiplicar: ");
    System.out.println("4 - Divisão: ");
    valor = sc.nextInt();

    System.out.print("Digite um valor: ");
    v1 = sc.nextInt(); 
    System.out.print("Digite outro valor: ");
    v2 = sc.nextInt(); 

    switch(valor) {
      case 1:
        resultado = v1 + v2;
        break;
      case 2: 
        resultado = v1 - v2;
        break;
      case 3:
        resultado = v1 * v2;
        break;
      case 4: 
        if (v2 != 0) {
          resultado = v1 / v2;
        } else { 
          System.out.print("Corrija a divisão!");
          sc.close();
          return;
        }
        break;
      default: 
        resultado = 0;
    }

    System.out.println("O resultado da sua conta é: " + resultado);
    
    sc.close();
  }
}
