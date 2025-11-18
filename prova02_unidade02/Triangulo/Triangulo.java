package prova02_unidade02.Triangulo;

abstract class Triangulo {
  private double lado;

  public Triangulo(double lado) {
    this.lado = lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return this.lado;
  }

  public double altura() {
    return lado * Math.sqrt(3) / 2;
  }

  public double area() {
    return lado * altura()/2;
  }

  public double perimetro() {
    return lado * 3;
  }

  public void mostrarDados() {
    System.out.println("lado: " + this.lado + "\naltura: " + altura() + "\nárea: " + area() + "\nperimetro: " + perimetro());
  }
}
