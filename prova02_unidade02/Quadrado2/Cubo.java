package prova02_unidade02.Quadrado2;

public class Cubo extends Quadrado {
  public Cubo() {
    super();
  }

  public Cubo(double lado) {
    super(lado);
  }

  public double area() {
    return (6 * super.area());
  }

  public double volume() {
    return (super.area() * getLado());
  }

  public void mostrarDados() {
    System.out.println("lado: " + getLado() + "\n área: " + area() + "\n volume: " + volume());
  }
}
