import java.util.*;
import java.time.*;
public class Biblioteca {
    private RepositorioLivro repositorioLivro;
    private RepositorioEmprestimo repositorioEmprestimo;

    public Biblioteca(RepositorioLivro repositorioLivro, RepositorioEmprestimo repositorioEmprestimo) {
        this.repositorioLivro = repositorioLivro;
        this.repositorioEmprestimo = repositorioEmprestimo;
    }

    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        repositorioLivro.adicionarLivro(livro);
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = repositorioLivro.buscarLivro(tituloDoLivro);
        if (livro != null) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
            repositorioEmprestimo.registrarEmprestimo(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" + tituloDoLivro + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo emprestimo : repositorioEmprestimo.buscarEmprestimosPendentes()) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                repositorioEmprestimo.atualizarEmprestimo(emprestimo);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    public void calcularMultas() {
        for (Emprestimo emprestimo : repositorioEmprestimo.buscarEmprestimosPendentes()) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
                double multa = diasAtraso > 0 ? diasAtraso * 2 : 0;
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}
