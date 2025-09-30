package produto;

public class Produto {
  int codigo; 
  String nome;
  int quantidade;
  String unidade;
  int valorUnitario;

  public int valorTotal(){
    return this.valorUnitario * this.quantidade;
  }

  public void mostrarDados(){
    System.out.println("código: " + this.codigo);
    System.out.println("nome: " + this.nome);
    System.out.println("quantidade: " + this.quantidade);
    System.out.println("unidade: " + this.unidade);
    System.out.println("valor unitário: " + this.valorUnitario);
    System.out.println("valor total: " + this.valorTotal());
  }
}
