package prova02_unidade02.Quadrado2;

public class Piramide extends Quadrado {
  private double altura; 

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return this.altura;
  }

  public Piramide() {
    super();
    this.altura = 0;
  }

  public Piramide(double lado, double altura) {
    super(lado);
    this.altura = altura;
  }

  public double perimetro() {
    return 0;
  }

  public double alturaDoLado() {
    return Math.sqrt((Math.pow(super.getLado()/2, 2) + Math.pow(altura, 2)));
  }

  public double areaLateral() {
    return (4 * ((super.getLado() * this.alturaDoLado())/2));
  }

  public double area() {
    return super.area() + this.areaLateral();
  }

  public double volume() {
    return (super.area() * this.altura) / 3;
  }

  public void mostrarDados() {
    System.out.println("lado: " + getLado());
    System.out.println("altura: " + this.altura);
    System.out.println("área da base: " + super.area());
    System.out.println("perimetro da base: " + super.perimetro());
    System.out.println("altura do lado: " + this.alturaDoLado());
    System.out.println("área lateral: " + this.areaLateral());
    System.out.println("área: " + this.area());
    System.out.println("volume: " + this.volume());
  }
}
