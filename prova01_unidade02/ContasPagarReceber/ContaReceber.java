package prova01_unidade02.ContasPagarReceber;

public class ContaReceber extends Conta {
  public ContaReceber(int codigo, String nome, double saldo) {
    super(codigo, nome, saldo);
  }

  public void receber(double valor) {
    if (super.getSaldo() > valor) {
      super.ajustarSaldo(valor * (-1));
    } else {
      System.out.println("Erro (1)");
    }
  }

  public void vender(double valor) {
    super.ajustarSaldo(valor);
  }

  public void mostarDados() {
    System.out.println("Código: " + super.getCodigo());
    System.out.println("Nome: " + super.getNome());
    System.out.println("Saldo: " + super.getSaldo());
    System.out.println("Conta a Receber");
  }
}
