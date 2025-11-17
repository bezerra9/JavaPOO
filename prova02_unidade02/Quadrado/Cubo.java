package prova02_unidade02.Quadrado;


public class Cubo extends Quadrado {
    public Cubo() {
      super();
    }

    public Cubo(double lado) {
      super(lado);
    }

    public double perimetro() {
      return 0;
    }

    public double area() {
      return 6 * super.area();
    }

    public double volume() {
      return super.area() * this.getLado();
    }

    public void mostrarDados() {
      System.out.println("área: " + this.area());
      System.out.println("lado: " + getLado());
      System.out.println("volume: " + this.volume());
    }
}
