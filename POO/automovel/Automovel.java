package automovel;

public class Automovel {
  int chassi;
  String marca;
  String modelo;
  int capacidadeTanque;
  int qntdAtual;
  float consumo;

  public float calcConsumo(int kmAndado) {
    return this.qntdAtual - kmAndado/this.consumo;
  }
}
