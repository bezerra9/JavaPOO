import java.util.Scanner;

public class Switch01 {
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String estacao = "Digite um valor valido!";
    short valor;
    System.out.println("Digite um numero: ");
    valor = sc.nextShort();
    switch(valor) {
      case 12:
      case 1: 
      case 2: 
        estacao = "Verão";
        break;

      case 3: 
      case 4: 
      case 5:
        estacao = "Outono";
        break;
      
      case 6:
      case 7: 
      case 8:
        estacao = "Inverno";
        break;

      case 9: 
      case 10:
      case 11:
        estacao = "Primavera";
        break;
    }

    System.out.print("A estação é: " + estacao);

    sc.close();
  }
}
