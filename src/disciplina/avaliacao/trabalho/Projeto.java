package disciplina.avaliacao.trabalho;

public class Projeto extends Trabalho {
  private double notaImplementacao;
  private double notaRelatorio;
  private double notaApresentacao;

  public Projeto(double notaImplementacao, double notaRelatorio, double notaApresentacao, int peso) {
    super("projeto", peso);

    this.notaImplementacao = notaImplementacao;
    this.notaRelatorio = notaRelatorio;
    this.notaApresentacao = notaApresentacao;
  }

  @Override
  public double calcNota() {
    return (notaImplementacao + notaRelatorio + notaApresentacao) / 3;
  }

  @Override
  public String mostra() {
    return "Projeto - Peso: " + getPeso() + " - Implementação: " + this.notaImplementacao
        + " - Relatório: " + this.notaRelatorio + " - Apresentação: " + this.notaApresentacao + " - Nota: "
        + this.calcNota();

  }

}
