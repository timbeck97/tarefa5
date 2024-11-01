import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
      
        RepositorioLivro repositorioLivro = new RepositorioLivroImplementacao();
        RepositorioEmprestimo repositorioEmprestimo = new RepositorioEmprestimoImplementacao();
        Biblioteca biblioteca = new Biblioteca(repositorioLivro, repositorioEmprestimo);

       
        biblioteca.adicionarLivro("Livro A");
        biblioteca.adicionarLivro("Livro B");

        
        biblioteca.registrarEmprestimo("Livro A", "João", LocalDate.now().plusDays(7));
        biblioteca.registrarEmprestimo("Livro B", "Maria", LocalDate.now().plusDays(7));

        
        biblioteca.devolverLivro("Livro A");

        
        biblioteca.calcularMultas();

       
        biblioteca.registrarEmprestimo("Livro A", "Pedro", LocalDate.now().minusDays(3));
        
        
        biblioteca.calcularMultas();
	}

}
