public class ProdutoCustoMedio extends Produto {
  public ProdutoCustoMedio(int codigo, String nome, int quantidade, float custo){
    super(codigo, nome, quantidade, custo);
  }

  public void repor(int quantidade, float custo) {
    super.setCusto(((super.getQuantidade() * super.getCusto()) + (quantidade * custo)) / (quantidade + super.getQuantidade()));
    super.repor(quantidade, custo);
  }
}
