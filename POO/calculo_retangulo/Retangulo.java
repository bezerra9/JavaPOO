package calculo_retangulo;
public class Retangulo {
  int base;
  int altura;

  public void mostrarDados(){
    System.out.println("Área = " + this.area());
    System.out.println("Diametro = " + this.diametro());
  }

  public int area(){
    return (this.base * this.altura);
  }

    public int diametro(){
      return (2 * (base + altura));
    }
}
