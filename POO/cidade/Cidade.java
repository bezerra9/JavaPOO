package cidade;

public class Cidade {
  int codigo;
  String descricao;
  int populacao;
  float area;


  public float densidadeDemografica(){
    return this.populacao/this.area;
  }

  public float densidadeDemografica(float area) {
    return this.populacao/area;
  }

  public void mostrarDados(){
    System.out.println("codigo: " + this.codigo);
    System.out.println("descricao: "+ this.descricao);
    System.out.println("populacao: " + this.populacao);
    System.out.println("area: " + this.area);
    System.out.println("densidade demografica: " + this.densidadeDemografica(this.area));
  }
}
