package calculo_cubo;
public class Cubo {
  int aresta;

  public void mostrarDados(){
    System.out.println("área: " + this.area());
    System.out.println("área: " + this.volume());
  }


  public int area(){
    return (int) (6 * Math.pow(this.aresta, 2));
  }

  public int volume() {
    return (int) (Math.pow(this.aresta, 3));
  }
}
