package prova01_unidade02.Cartao;

public class MovimentoCartao {
  public static void main(String[]args) {

    CartaoEspecial cartao = new CartaoEspecial(1, "João", 500, 50);
  
    cartao.comprar(50);
    cartao.comprar(49);
    cartao.comprar(450);
    cartao.comprar(50);
    cartao.pagar(50);
    cartao.comprar(50);
    cartao.pagarTudo();
    cartao.mostrarDados();

  }
}
