package prova01_unidade02.ContasPagarReceber;

public class ContaPagar extends Conta {
  public ContaPagar(int codigo, String nome, double saldo) {
    super(codigo, nome, saldo * (-1));
  }

  public void pagar(double valor) {
    if ((super.getSaldo() * (-1)) > valor) {
      super.ajustarSaldo(valor);
    } else {
      System.out.println("ERRO: saldo devedor menor");
    }
  }
/* -400 - 400 = -800 + 400 = 400 */
  public void comprar(double valor) {
    super.ajustarSaldo(valor * (-1));
  }

  public void mostarDados() {
    System.out.println("Código: " + super.getCodigo());
    System.out.println("Nome: " + super.getNome());
    System.out.println("Saldo: " + super.getSaldo());
    System.out.println("Conta a Pagar");

  }
}
