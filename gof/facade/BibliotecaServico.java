import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class BibliotecaServico {
    private CatalogoLivros catalogoLivros = new CatalogoLivros();
    private CatalogoRevistas catalogoRevistas = new CatalogoRevistas();
    private ServicoEmprestimo servicoEmprestimo = new ServicoEmprestimo();
    private GestorMultas gestorMultas = new GestorMultas();

    public void adicionarLivro(Livro livro) {
        catalogoLivros.registrarLivro(livro);
    }

    public void adicionarRevista(Revista revista) {
        catalogoRevistas.registrarRevista(revista);
    }

    public void realizarEmprestimo(Emprestimo emprestimo) {
        servicoEmprestimo.fazerEmprestimo(emprestimo);
    }

    public double consultarMulta(Emprestimo emprestimo) {
        return gestorMultas.verificarMulta(emprestimo);
    }
}