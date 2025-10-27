package Polimorfismo.figuraPlana;

public class Circulo extends figuraPlana {
  private float raio;

  public Circulo(float raio) {
    this.raio = raio;
  }

  public void setRaio(float raio) {
    this.raio = raio;
  }

  public float getRaio() {
    return this.raio;
  }

  public float diametro() {
    return this.raio * 2f;
  }

  public double area() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double perimetro() {
    return this.comprimento();
  }

  public float comprimento() {
    return (float) (2 * this.raio * Math.PI);
  }

  public double area(float comprimento) {
    float raio; 
    raio = comprimento / 2;
    return Math.PI * Math.pow(raio, 2);
  }

  public void mostrarDados() {
    System.out.println("Circulo de raio: " + this.raio);
    super.mostrarDados();
    System.out.println("Diametro: " + this.diametro());
  }
}
