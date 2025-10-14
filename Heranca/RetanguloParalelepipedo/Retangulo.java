package Heranca.RetanguloParalelepipedo;

public class Retangulo {
  protected float ladoa;
  private float ladob;

  public Retangulo (float ladoa, float ladob) {
    this.ladoa = ladoa;
    this.ladob = ladob;
  }
  
  public float getLadoa() {
    return this.ladoa;
  }

  public void setLadoa(float ladoa) {
    this.ladoa = ladoa;
  }

  public float getLadob(){
    return this.ladob;
  }

  public void setLadob(float ladob) {
    this.ladob = ladob;
  }

  public double area() {
    return this.ladoa * this.ladob;
  }

  public double perimetro() {
    return 2 * (this.ladoa + this.ladob);
  }

  public void mostrarDados() {
    System.out.println("Retangulo com lados: " + this.ladoa + "e " + this.ladob);
    System.out.println("Área: " + this.area() + "Perimetro: " + this.perimetro());
  }
}
