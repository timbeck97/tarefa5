import java.util.*;
import java.time.*;
public class Controlador {
    private Biblioteca biblioteca;

    public Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void registrarEmprestimo(String titulo, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = new Livro(titulo);
        biblioteca.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
    }

    public void devolverLivro(String titulo) {
        Livro livro = new Livro(titulo); // Criar um novo livro só para a busca
        biblioteca.devolverLivro(livro);
    }

    public void exibirMultas() {
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    public void consultarLivrosAtrasados() {
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.calcularMulta() > 0) {
                System.out.println(emprestimo);
            }
        }
    }
}
