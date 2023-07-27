package disciplina;

import disciplina.avaliacao.Avaliacao;
import disciplina.avaliacao.Prova;
import disciplina.avaliacao.trabalho.Projeto;
import disciplina.avaliacao.trabalho.Seminario;

public class Disciplina {
  private String nomeDisciplina;
  private int numAvaliacoes;
  private static final int MAX_AVALIACOES = 10;
  private Avaliacao[] avaliacoes = new Avaliacao[MAX_AVALIACOES];

  public Disciplina(String nomeDisciplina) {
    this.nomeDisciplina = nomeDisciplina;
    this.numAvaliacoes = 0;
  }

  public String getNomeDisciplina() {
    return this.nomeDisciplina;
  }

  public int getNumAvaliacoes() {
    return this.numAvaliacoes;
  }

  public void adicionarProva(double ex1, double ex2, double ex3, double ex4, double ex5, int peso) {
    if (!(this.numAvaliacoes < 10)) {
      System.out.println("Número de avalições excedido");
      return;
    }

    Prova p = new Prova(ex1, ex2, ex3, ex4, ex5, peso);
    this.avaliacoes[this.numAvaliacoes] = p;
    this.numAvaliacoes++;
  }

  public void adicionarSeminario(double notaArtigo, double notaApresentacao, int peso) {
    if (!(this.numAvaliacoes < 10)) {
      System.out.println("Número de avalições excedido");
      return;
    }

    Seminario s = new Seminario(notaArtigo, notaApresentacao, peso);
    this.avaliacoes[this.numAvaliacoes] = s;
    this.numAvaliacoes++;
  }

  public void adicionarProjeto(double notaImplementacao, double notaRelatorio, double notaApresentacao, int peso) {
    if (!(this.numAvaliacoes < 10)) {
      System.out.println("Número de avalições excedido");
      return;
    }

    Projeto p = new Projeto(notaImplementacao, notaRelatorio, notaApresentacao, peso);
    this.avaliacoes[this.numAvaliacoes] = p;
    this.numAvaliacoes++;
  }

  public double notaFinal() {
    double nota = 0;
    int pesoTotal = 0;

    if (this.numAvaliacoes == 0) {
      return 0;
    }

    for (int i = 0; i < this.numAvaliacoes; i++) {
      Avaliacao a = this.avaliacoes[i];
      nota += a.getPeso() * a.calcNota();

      pesoTotal += a.getPeso();
    }
    return nota / pesoTotal;
  }

  public void listarAvaliacoes() {
    System.out.println("Disciplina: " + nomeDisciplina + " - Nota Final: " + notaFinal());
    System.out.println();

    if (this.numAvaliacoes == 0) {
      System.out.println("Não há avaliacoes");
      return;
    }

    for (int i = 0; i < numAvaliacoes; i++) {
      System.out.println(this.avaliacoes[i].mostra());
    }
  }
}