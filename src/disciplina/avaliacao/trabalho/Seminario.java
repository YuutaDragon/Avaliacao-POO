package disciplina.avaliacao.trabalho;


public class Seminario extends Trabalho {
  private double notaArtigo;
  private double notaApresentacao;

  public Seminario(double notaArtigo, double notaApresentacao, int peso) {
    super("seminario", peso);
    this.notaArtigo = notaArtigo;
    this.notaApresentacao = notaApresentacao;
  }

  @Override
  public double calcNota() {
    return (this.notaArtigo + this.notaApresentacao) / 2;
  }

  @Override
  public String mostra() {
    return ("Seminario - Peso: " + getPeso() + " - Artigo: " + this.notaArtigo + " - Apresentação: "
        + this.notaApresentacao + " - Nota: " + this.calcNota());
  }

}
