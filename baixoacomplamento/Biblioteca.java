import java.util.*;
import java.time.*;
public class Biblioteca {
    private LivroService servicoDeLivros;
    private EmprestimoService servicoDeEmprestimos;
    private MultaService servicoDeMultas;

    public Biblioteca(LivroService servicoDeLivros, EmprestimoService servicoDeEmprestimos, MultaService servicoDeMultas) {
        this.servicoDeLivros = servicoDeLivros;
        this.servicoDeEmprestimos = servicoDeEmprestimos;
        this.servicoDeMultas = servicoDeMultas;
    }

    public void adicionarLivro(String titulo) {
        servicoDeLivros.adicionarLivro(titulo);
    }

    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = servicoDeLivros.encontrarLivro(tituloDoLivro);
        if (livro != null) {
            servicoDeEmprestimos.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        } else {
            System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado.");
        }
    }

    public void devolverLivro(String tituloDoLivro) {
        servicoDeEmprestimos.devolverLivro(tituloDoLivro);
    }

    public void calcularMultas() {
        servicoDeMultas.calcularMultas(servicoDeEmprestimos.listarEmprestimos());
    }
}
