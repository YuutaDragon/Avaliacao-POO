package disciplina.avaliacao;

public class Prova extends Avaliacao {
  private double notaExercicio1;
  private double notaExercicio2;
  private double notaExercicio3;
  private double notaExercicio4;
  private double notaExercicio5;

  public Prova(double notaExercicio1, double notaExercicio2, double notaExercicio3, double notaExercicio4,
      double notaExercicio5, int peso) {
    super("prova", peso);

    this.notaExercicio1 = notaExercicio1;
    this.notaExercicio2 = notaExercicio2;
    this.notaExercicio3 = notaExercicio3;
    this.notaExercicio4 = notaExercicio4;
    this.notaExercicio5 = notaExercicio5;
  }

  @Override
  public double calcNota() {
    return (notaExercicio1 + notaExercicio2 + notaExercicio3 + notaExercicio4 + notaExercicio5) / 5;
  }

  @Override
  public String mostra() {
    return "Prova - Peso: " + getPeso() + " - ex1: " + this.notaExercicio1 + " - ex2: " + this.notaExercicio2
        + " - ex3: " + this.notaExercicio3 + " - ex4: " + this.notaExercicio4 + " - ex5: " + this.notaExercicio5
        + " - Nota: " + this.calcNota();
  }

}
