import disciplina.Disciplina;
import disciplina.avaliacao.Avaliacao;
import disciplina.avaliacao.Prova;
import disciplina.avaliacao.trabalho.Projeto;
import disciplina.avaliacao.trabalho.Seminario;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testes Seminário:");
        Seminario s = new Seminario(5, 3, 4);
        System.out.println("Nota calculada: " + s.calcNota());
        System.out.println("Informações do seminário: " + s.mostra());

        System.out.println();

        System.out.println("Testes Projeto:");
        Projeto projeto1 = new Projeto(3, 5, 3, 8);
        System.out.println("Nota calculada: " + projeto1.calcNota());
        System.out.println("Informações do projeto: " + projeto1.mostra());

        System.out.println();

        System.out.println("Testes Prova:");
        Prova prova1 = new Prova(7, 2, 5, 9, 8, 3);
        System.out.println("Nota calculada: " + prova1.calcNota());
        System.out.println("Informações da prova: " + prova1.mostra());

        System.out.println();

        System.out.println("Testes Avaliacao:");
        Avaliacao aSeminario = new Seminario(8, 2, 7);
        System.out.println("Tipo: " + aSeminario.getTipo());
        System.out.println("Peso: " + aSeminario.getPeso());
        System.out.println("Nota calculada: " + aSeminario.calcNota());
        System.out.println("Informações da avaliação: " + aSeminario.mostra());

        System.out.println();

        Avaliacao aProjeto = new Projeto(6, 3, 5, 1);
        System.out.println("Tipo: " + aProjeto.getTipo());
        System.out.println("Peso: " + aProjeto.getPeso());
        System.out.println("Nota calculada: " + aProjeto.calcNota());
        System.out.println("Informações do avaliação: " + aProjeto.mostra());

        System.out.println();

        Avaliacao aProva = new Prova(4, 7, 2, 8, 9, 10);
        System.out.println("Tipo: " + aProva.getTipo());
        System.out.println("Peso: " + aProva.getPeso());
        System.out.println("Nota calculada: " + aProva.calcNota());
        System.out.println("Informações da avaliação: " + aProva.mostra());

        System.out.println();

        System.out.println("Testes Disciplina:");
        Disciplina d = new Disciplina("Programação Orientada a Objetos");
        System.out.println("Nome da disciplina: " + d.getNomeDisciplina());
        System.out.println("Número de avaliações: " + d.getNumAvaliacoes());

        d.listarAvaliacoes();

        d.adicionarProjeto(5, 8, 5, 8);
        d.adicionarSeminario(2, 4, 9);
        d.adicionarProva(1, 3, 7, 10, 3, 8);

        System.out.println();

        System.out.println("Número de avaliações: " + d.getNumAvaliacoes());
        d.listarAvaliacoes();
    }
}
