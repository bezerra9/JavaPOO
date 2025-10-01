package Vetor.censo;

public class Discente {
  int cpf;
  String nome;
  int idInstituição;
  int idCurso;
  String dataNasc;
  int cargaHorCumprida;
  int cargaHorTotal;

  public float percentual() {
    return (((float)this.cargaHorCumprida / this.cargaHorTotal) * 100);
  }

  public float percentual(int cargaHorCumprida) {
    return (((float)cargaHorCumprida / this.cargaHorTotal) * 100);
  }

  public void mostrarDados(){
    System.out.println("CPF: " + this.cpf);
    System.out.println("Nome: " + this.nome);
    System.out.println("Id Instituição: " + this.idInstituição);
    System.out.println("Id Curso: " + this.idCurso);
    System.out.println("Data nascimento: " + this.dataNasc);
    System.out.println("Carga horária aluno: " + this.cargaHorCumprida);
    System.out.println("Carga horária total: " + this.cargaHorTotal);
  }
}
