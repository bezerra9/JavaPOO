package Construtores.produto;

public class LerProduto {
  public static void main (String[] args) {
    Produto produto1 = new Produto(1, "Feijão");
    Produto produto2 = new Produto(2, "Arroz", 30);
    Produto produto3 = new Produto(3, "Farinha", 30, "Kilograma", 2);

    System.out.println(produto1.codigo + ", " + produto1.nome);
    System.out.println(produto2.codigo + ", " + produto2.nome + ", " + produto2.quantidade);
    System.out.println(produto3.codigo + ", " + produto3.nome + ", " + produto3.quantidade + ", " + produto3.unidade + ", " + produto3. valor);
  }
}
