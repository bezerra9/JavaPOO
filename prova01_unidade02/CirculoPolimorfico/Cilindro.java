package prova01_unidade02.CirculoPolimorfico;

public class Cilindro extends Circulo {
  private double altura;

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public Cilindro() {
    super(0);
    this.altura = 0;
  }

  public Cilindro(double raio, double altura) {
    super(raio);
    this.altura = altura;
  }

  public double diametro() {
    return 0;
  }

  public double comprimento () {
    return 0;
  }

  public double areaLateral() {
    return super.comprimento() * this.altura;
  }
  
  public double area() {
    return 2 * super.area() + this.areaLateral();
  }

  public double volume() {
    return super.area() * this.altura;
  }

  public void mostrarDados() {
    System.out.println("Raio: " + super.getRaio());
    System.out.println("Altura: " + this.altura);
    System.out.println("Área da base: " + this.area()) ;
    System.out.println("Perímetro da base: " + super.comprimento());
    System.out.println("Diametro da base: " + super.diametro());
    System.out.println("Área lateral: " + this.areaLateral());
    System.out.println("Área cilindro: " + area());
    System.out.println("Volume Cilindro: " + volume());
  }
}
