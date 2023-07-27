package disciplina.avaliacao;

public abstract class Avaliacao {
  protected String tipo;
  protected int peso;

  public Avaliacao(String tipo, int peso) {
    this.tipo = tipo;
    this.peso = peso;
  }

  public int getPeso() {
    return this.peso;
  }

  public String getTipo() {
    return this.tipo;
  }

  public abstract double calcNota();

  public abstract String mostra();
}
