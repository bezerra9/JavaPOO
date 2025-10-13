package Construtores.produto;

public class Produto {
  int codigo;
  String nome;
  int quantidade;
  String unidade;
  float valor;

  public Produto(int codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
  }

  public Produto(int codigo, String nome, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
  }

  public Produto(int codigo, String nome, int quantidade, String unidade, float valor) {
    this.codigo = codigo;
    this.nome = nome;
    this.quantidade = quantidade;
    this.unidade = unidade;
    this.valor = valor;
  }
}
