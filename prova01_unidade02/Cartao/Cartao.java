package prova01_unidade02.Cartao;

abstract class Cartao {
  private int numeroCartao;
  private String nomeTitular;
  private double limiteCredito;
  private double saldoDevedor;

  public int getNumeroCartao(){
    return this.numeroCartao;
  }

  public void setNumeroCartao(int numeroCartao){
    this.numeroCartao = numeroCartao;
  }

  public String getnomeTitular() {
    return this.nomeTitular;
  }

  public void setnomeTitular(String nomeTitular){
    this.nomeTitular = nomeTitular;
  }

  public double getlimiteCredito(){
    return this.limiteCredito;
  }

  public void setlimiteCredito(double limiteCredito){
    this.limiteCredito = limiteCredito;
  }

  public double getsaldoDevedor() {
    return this.saldoDevedor;
  }

  public Cartao(int numeroCartao, String nomeTitular, double limiteCredito) {
    this.numeroCartao = numeroCartao;
    this.nomeTitular = nomeTitular;
    this.limiteCredito = limiteCredito;
    this.saldoDevedor = 0;
  }

  public boolean autorizar(double valor){
    return valor + this.saldoDevedor <= limiteCredito;
  }

  public void compra(double valor) {
    if(autorizar(valor)) {
      System.out.println("Compra aprovada");
      saldoDevedor += valor;
    } else {
      System.out.println("ERRO: (Compra não autorizada)");
    }
  }

  public void pagar(double valorPag) {
    this.saldoDevedor = saldoDevedor - valorPag;
  }

  public void mostrarDados() {
    System.out.println("Número: " + numeroCartao);
    System.out.println("Nome: " + nomeTitular);
    System.out.println("Limite: " + limiteCredito);
    System.out.println("Saldo: " + saldoDevedor);
  }
}
