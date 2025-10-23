
public class MovimentoEstoque {
  public static void main(String[] args) {
    ProdutoCustoAtual pca = new ProdutoCustoAtual(1, "Feijão", 60, (float) 1.50);
    ProdutoCustoMedio pcm = new ProdutoCustoMedio(2, "Tomate", 120, (float) 2.50);
    pca.mostrarDados();
    pcm.mostrarDados();

    System.out.println("--------------------------------------------------");

    pca.repor((float)1.60, 100);
    pcm.repor(100, (float)2.60) ;
    pca.mostrarDados();
    pcm.mostrarDados();

    System.out.println("--------------------------------------------------");

    pca.baixar(30);
    pcm.baixar(50);
    pca.mostrarDados();
    pcm.mostrarDados();

    System.out.println("--------------------------------------------------");

    pcm.baixar(300);
    pcm.mostrarDados();

  }
}
