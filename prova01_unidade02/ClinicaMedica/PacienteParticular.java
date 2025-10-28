package prova01_unidade02.ClinicaMedica;

public class PacienteParticular extends Paciente {
  private double desconto;

  public void setDesconto(double desconto) {
    this.desconto = desconto;
  }

  public double getDesconto() {
    return this.desconto;
  }

  public PacienteParticular(int codigo, String nome, double debito, double desconto) {
    super(codigo, nome, debito);
    this.desconto = desconto;
  }

@Override
  public double usarServico(double valor) {
    return super.usarServico(valor * (1 - (desconto / 100)));
  }

@Override
  public void mostrarDados() {
    super.mostrarDados();
    System.out.println("Desconto: " + this.desconto);
  }
}
