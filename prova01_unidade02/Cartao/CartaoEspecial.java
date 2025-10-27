package prova01_unidade02.Cartao;

public class CartaoEspecial extends Cartao {
  private double valorMinCompra;
  
  public CartaoEspecial(int numeroCartao, String nomeTitular, double limiteCredito, double valorMinCompra){
    super(numeroCartao, nomeTitular, limiteCredito);
    this.valorMinCompra = valorMinCompra;
  }

  public void setvalorMinCompra(double valorMinCompra) {
    this.valorMinCompra = valorMinCompra;
  }

  public double setvalorMinCompra() {
    return this.valorMinCompra;
  }

  public void comprar(double valor) {
    if (valor >= valorMinCompra) {
      super.compra(valor);
    } else {
      System.out.println("Erro, precisa fazer uma compra de: " + valorMinCompra);
    }
  }

  public void pagarTudo() {
    pagar(super.getsaldoDevedor());
  }

  public void mostrarDados() {
    super.mostrarDados();
    System.out.println("Valor minimo de compra: " + valorMinCompra);
  }
}
