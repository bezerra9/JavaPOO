package partidos;

public class Partido {
  int codigo;
  String descricao;
  String presidente;
  int filiados;
  int assinaturas;

  public String aprovado(int numeroAssinaturasMinimas){
    String resultado = "";
    if (this.assinaturas >= numeroAssinaturasMinimas) {
      resultado = "Sim";
    } else {
      resultado = "Não";
    }
    return resultado;
  }

  public String classificacao(int numeroAssinaturasMinimas) {
    String resultado = "";
    float indice = (this.assinaturas / (float) numeroAssinaturasMinimas) * 100.0f;
    if (aprovado(numeroAssinaturasMinimas).equals("Sim")) {
      resultado = "Satisfatório";
    } else if (indice >= 75) {
      resultado = "Insatisfatório";
    } else if (indice >= 50) {
      resultado = "Ruim";
    } else if (indice >= 25) {
      resultado = "Muito ruim";
    } else {
      resultado = "Péssimo";
    }
    return resultado;
  }

  public void mostrarDados() {
    System.out.println("Código: " + this.codigo);
    System.out.println("Descrição: " + this.descricao);
    System.out.println("Presidente: " + this.presidente);
    System.out.println("Filiados: " + this.filiados);
    System.out.println("Assinaturas: " + this.assinaturas);
  }
}
