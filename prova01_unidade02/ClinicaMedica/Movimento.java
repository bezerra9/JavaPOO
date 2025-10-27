package prova01_unidade02.ClinicaMedica;

public class Movimento {

  public static void main(String [] args) {
    PacienteParticular joao = new PacienteParticular(1, "João", 0, 10);
    PacienteConvenio maria = new PacienteConvenio(2, "Maria", 0, "FACAPE", 500);

    joao.mostrarDados();
    maria.mostrarDados();

    joao.usarServico(100);
    maria.usarServico(200);

    joao.usarServico(200);
    maria.usarServico(301);

    joao.pagarServico(300);
    maria.pagarServico(150);

    joao.mostrarDados();
    maria.mostrarDados();
  }

  
}
