package prova01_unidade02.ClinicaMedica;

abstract class Paciente {
  private int codigo;
  private String nome;
  private double debito;

  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() { 
    return this.nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getDebito() {
    return this.debito;
  }

  public Paciente(int codigo, String nome, double debito) {
    this.codigo = codigo;
    this.nome = nome; 
    this.debito = debito;
  }

  public double usarServico(double valor) {
    return this.debito += valor;
  }

  public double pagarServico(double valorServico) {
    if (valorServico <= this.debito) {
      this.debito = this.debito - valorServico; 
    } else {
      System.out.println("ERRO: o valor pago é maior que o débito atual!");
    }
    return this.debito;
  }

  public void mostrarDados() {
    System.out.println("-------------------------------");
    System.out.println("Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Débito: R$" + this.debito);
  }
}
