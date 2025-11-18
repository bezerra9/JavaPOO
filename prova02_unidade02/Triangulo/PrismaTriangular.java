package prova02_unidade02.Triangulo;

public class PrismaTriangular extends Triangulo {
  private double altura;

  public PrismaTriangular(double lado, double altura) {
    super(lado);
    this.altura = altura;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double areaLateral() {
    return super.perimetro() * altura;
  }

  public double area() {
    return (2 * super.area()) + areaLateral();
  }

  public double perimetro() {
    return 0; 
  }

  public double volume() {
    return super.area() * altura;
  }

  public void mostrarDados() {
    System.out.println("lado: " + super.getLado() + "\naltura: " + this.altura + "\nperimetro base: " + super.perimetro() + "\narea da base: " + super.area() + "\narea lateral: " + areaLateral() + "\narea: " + area() + "\nvolume: " + volume());
  }
}
