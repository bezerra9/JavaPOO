package prova02_unidade02.Quadrado2;

public abstract class Quadrado {
  private double lado;

  public void setlado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return this.lado;
  }

  public Quadrado() {
    this.lado = 0;
  }

  public Quadrado(double lado) {
    this.lado = lado;
  }

  public double area() {
    return Math.pow(lado, 2);
  }

  public double perimetro() {
    return (4 * lado);
  }

  public void mostrarDados() {
    System.out.println("Lado: " + this.lado);
    System.out.println("área: " + this.area());
    System.out.println("perimetro: " + this.perimetro());
  }
}
