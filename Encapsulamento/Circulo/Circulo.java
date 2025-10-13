package Encapsulamento.Circulo;

public class Circulo {
  private int raio;
  private float pi = 3.14f;

  private float areaCirculo() {
    return pi * (float) Math.pow(raio, 2);
  }

  public float calcularArea() {
    return areaCirculo();
  }

  public void setRaio(int raio){
    this.raio = raio;
  }

  public int getRaio() {
    return this.raio;
  }
}
