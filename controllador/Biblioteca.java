import java.util.*;
import java.time.*;
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro não encontrado ou já devolvido.");
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
