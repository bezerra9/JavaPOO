package produto;
import java.util.Scanner;


public class lerProduto {
  public static void main(String[] args) {
    int i;
    int total = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("digite a quantidade de produtos: ");
    Produto produtos[] = new Produto[sc.nextInt()];
    Produto produtoMaisValioso = new Produto();

    produtoMaisValioso.quantidade = 0;
    produtoMaisValioso.valorUnitario = 0;

/*     System.out.print("codigo: ");
    produtoMaisValioso.codigo = sc.nextInt();

    System.out.print("nome: ");
    produtoMaisValioso.nome = sc.next();

    System.out.print("quantidade: ");
    produtoMaisValioso.quantidade = sc.nextInt();

    System.out.print("unidade: ");
    produtoMaisValioso.unidade = sc.next();

    System.out.print("valor unitario: ");
    produtoMaisValioso.valorUnitario = sc.nextInt(); */




    for (i=0; i<produtos.length; i++) {
      produtos[i] = new Produto();

      System.out.print("codigo: ");
      produtos[i].codigo = sc.nextInt();

      System.out.print("nome: ");
      produtos[i].nome = sc.next();

      System.out.print("quantidade: ");
      produtos[i].quantidade = sc.nextInt();

      System.out.print("unidade: ");
      produtos[i].unidade = sc.next();

      System.out.print("valor unitario: ");
      produtos[i].valorUnitario = sc.nextInt();

      if (produtoMaisValioso.valorTotal() < produtos[i].valorTotal()){
        produtoMaisValioso = produtos[i];
      }

      total += produtos[i].valorTotal();
    }

  System.out.println("o produto mais valioso: " + produtoMaisValioso.nome);
  System.out.println("valor do produto mais valioso: " + produtoMaisValioso.valorTotal());
    
    System.out.println("o valor total de produtos: " + total);

    sc.close();
  }
}
