package prova01_unidade02.ContasPagarReceber;

public class MovimentoConta {


  public static void main (String [] args) {
    ContaReceber cr = new ContaReceber(1, "Supermercado Total", 500);
    ContaPagar cp = new ContaPagar(2, "Distribuidor Ideal", 400);

    cr.mostarDados();
    cp.mostarDados();

    cr.vender(600);
    cp.comprar(400);

    cr.mostarDados();
    cp.mostarDados();

    cr.receber(100);
    cp.pagar(300);

    cr.mostarDados();
    cp.mostarDados();

    cr.receber(1500);
    cp.pagar(600);

    cr.mostarDados();
    cp.mostarDados();


  }
}
