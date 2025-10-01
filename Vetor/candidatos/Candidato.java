package Vetor.candidatos;

public class Candidato {
  int numero;
  String nome;
  int votos;

  public String classificado(int votosMinimos) {
    String resultado;
    if (this.votos >= votosMinimos) {
      resultado = "Sim, Excedeu " + (votos - votosMinimos) + " voto(s)"; 
    } else {
      resultado = "Não, Faltou " + (votosMinimos - votos) + " voto(s)";
    }
    return resultado;

  }
  public String classificado() {
    String resultado;
    if (this.votos >= 10) {
      resultado = "Sim, Excedeu " + (votos - 10) + " voto(s)"; 
    } else {
      resultado = "Não, Faltou " + (votos - 10) + " voto(s)";
    }
    return resultado;
  }

  public void mostrarDados() {
    System.out.println("Numero: " + this.numero);
    System.out.println("Nome: " + this.nome);
    System.out.println("Votos: " + this.votos);
  }
}
