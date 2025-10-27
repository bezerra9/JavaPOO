package prova01_unidade02.ClinicaMedica;

public class PacienteConvenio extends Paciente {
  private String convenio;
  private double limite;

  public PacienteConvenio(int codigo, String nome, double debito, String convenio, double limite) {
    super(codigo, nome, debito);
    this.convenio = convenio;
    this.limite = limite;
  }

  public String getConvenio() {
    return this.convenio;
  }

  public double getLimite() {
    return this.limite;
  }

  public void setConvenio(String convenio) {
    this.convenio = convenio;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public boolean checarLimite(double valor) {
    return super.usarServico(valor) <= this.limite;
  }

  @Override
  public double usarServico(double valor) {
    double result = 0;
    if(checarLimite(valor)) {
      result = super.usarServico(valor);
    } else {
      System.out.println("Erro ao usar o serviço de convenio");
    }
    return result;
  }

  public void mostrarDados() {
    super.mostrarDados();
    System.out.println("Convênio: " + this.convenio);
    System.out.println("Limite: " + this.limite);
  }
}
