package prova01_unidade02.ContasPagarReceber;

public abstract class Conta {
  private int codigo;
  private String nome;
  private double saldo;

  public int getCodigo() {
    return this.codigo;
  }

  public String getNome(){
    return this.nome;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Conta(int codigo, String nome, double saldo) {
    this.codigo = codigo;
    this.nome = nome;
    this.saldo = saldo;
  }

  public double ajustarSaldo(double valor) { // pode ser void tbm, mas não retorna nada
    return this.saldo += valor;
  }

  public void mostarDados() {
    System.out.println("Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Saldo: " + this.saldo);
  }
}
