package metodo;
import java.util.Scanner;

public class Meses {

  public static String calculaAno(int meses) {
    String resultado;
    int resultadoAno, resultadoMeses;
    resultadoAno = meses / 12;
    resultadoMeses = meses % 12;

    /* System.out.println("anos: " + resultadoAno + " meses: " + resultadoMeses); */
    return resultado = "Equivale a " + resultadoAno + " ano(s) e " + resultadoMeses + " mese(s)";
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int meses = 1; 
    while (meses != 0) {
      System.out.print("Digite a quantidade de meses: ");
      meses = sc.nextInt();
      System.out.println(calculaAno(meses));
    }

    sc.close();
  }
}
