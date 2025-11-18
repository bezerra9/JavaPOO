package prova02_unidade02.Triangulo;

public class PiramideTriangular extends Triangulo {
  private double altura;
  private double apotema;

  public PiramideTriangular(double lado, double altura, double apotema) {
    super(lado);
    this.altura = altura;
    this.apotema = apotema;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setApotema(double apotema) {
    this.apotema = apotema;
  }

  public double getApotema() { 
    return apotema;
  }
   
  public double areaLateral() {
    return (super.perimetro() / 2) * apotema;
  }

  public double area() {
    return super.area() + areaLateral();
  }

  public double perimetro() {
    return 0;
  }

  public double volume() {
    return ((0.33) * super.area() * this.altura); 
  }

  public void mostrarDados() {
      System.out.println("lado: " + super.getLado() + "\naltura: " + this.altura + "\nperimetro base: " + super.perimetro() + "\narea da base: " + super.area() + "\narea lateral: " + areaLateral() + "\narea: " + area() + "\nvolume: " + volume() + "\napotema: " + this.apotema);
  }
}
