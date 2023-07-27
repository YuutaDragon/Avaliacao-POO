package disciplina.avaliacao.trabalho;

import disciplina.avaliacao.Avaliacao;

public abstract class Trabalho extends Avaliacao {

  public Trabalho(String tipo, int peso) {
    super(tipo, peso);
  }

  public abstract double calcNota();

  public abstract String mostra();
}
