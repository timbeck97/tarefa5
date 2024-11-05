import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class BibliotecaServico {
    //classe principal que irá orquestrar as ações do sistema
    //possui todas dependencias necessárias para realizar as ações
    //de forma simples e direta, dessa forma desacopla a classe main com as regras de negocio do sistema
    
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