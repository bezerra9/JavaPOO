package Heranca.RetanguloParalelepipedo;

class Paralelepipedo extends Retangulo {
  private float ladoc;

  public Paralelepipedo() {
    super(0,0); // referencia ao construtor da classe pai passando 0 e 0 como parametros
    this.ladoc = 0;
  }

  public Paralelepipedo(float ladoa, float ladob, float ladoc) {
    super(ladoa, ladob);
    this.ladoc = ladoc;
  }

  public float getLadoc() {
    return this.ladoc;
  }

  public void setLadoc(float ladoc) {
    this.ladoc = ladoc;
  }

  public double area() {
    return 2 * (this.ladoa * super.getLadob() + this.ladoa * this.ladoc + super.getLadob() * this.ladoc);
  }

  public double perimetro() {
    return (0);
  }

  double volume() {
    return super.area() * this.ladoc;
  }

  public void mostrarDados() {
    System.out.println("Paralelepipedo com base: " + super.ladoa + ", Largura: " + super.getLadob() + "e altura: " + this.ladoc);
    System.out.println("Área: " + this.area());
    System.out.println("Volume: " + this.volume());
  }
 }

