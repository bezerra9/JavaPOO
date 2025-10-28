package prova01_unidade02.CirculoPolimorfico;

abstract class Circulo {
  private double raio;

  public void setRaio(double raio) {
    this.raio = raio;
  }

  public double getRaio() {
    return this.raio;
  }

  public Circulo() {
    this.raio = 0;
  }

  public Circulo(double raio) {
    this.raio = raio;
  }
 
  public double diametro() {
    return 2 * this.raio;
  }

  public double area() {
    return Math.PI * Math.pow(this.raio, 2);
  }

  public double comprimento() {
    return 2 * Math.PI * this.raio;
  }

  public void mostrarDados() {
    System.out.println("-------------------------------");
    System.out.println("Raio: " +  this.raio);
    System.out.println("Área: " +this.area());
    System.out.println("Perímetro: " + this.comprimento());
    System.out.println("Diâmetro: " + this.diametro());
  }
}
