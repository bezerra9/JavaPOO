package controle_automoveis;

public class Automovel {
  int codigo;
  String descricao;
  int capacidadeTanque;
  float litrosAbastecidos;
  float kmRodado;

  public float consumo() {
    return this.kmRodado/this.litrosAbastecidos;
  }

  public float consumo(float litrosAbastecidos) {
    return this.kmRodado/litrosAbastecidos;
  }

  public String classificacao(){
    String resultado = "";
    float consumo = consumo();
    if(consumo<10) {
      resultado = "Ruim";
    } else if (consumo >= 10 && consumo <=13) {
      resultado = "Normal";
    } else {
      resultado = "Ótimo";
    }
    return resultado;
  }

  public void mostrarDados() {
    System.out.println("Código: " + this.codigo);
    System.out.println("Descrição: " + this.descricao);
    System.out.println("Capacidade do tanque: " + this.capacidadeTanque);
    System.out.println("Litros abastecidos: " + this.litrosAbastecidos);
    System.out.println("Kilometragem rodada: " + this.kmRodado);
    System.out.println("Consumo: " + this.consumo());
    System.out.println("Classificação: " + this.classificacao());
  }
}
