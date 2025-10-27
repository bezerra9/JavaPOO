package prova01_unidade02.CirculoPolimorfico;

public class Esfera extends Circulo {
  
  public Esfera() {
    super(0);
  }

  public Esfera(double raio) {
    super(raio);
  }

  public double diametro(){
    return 0;
  }

  public double comprimento() {
    return 0;
  }

  public double area() {
    return 4 * super.area();
  }

  public double volume() {
    return (4.0/3.0) * Math.PI * Math.pow(super.getRaio(), 3);
  }

  public void mostrarDados () {
    System.out.println("Raio: " + super.getRaio());
    System.out.println("Área: " + this.area());
    System.out.println("Volume: " + volume());
  }
}
