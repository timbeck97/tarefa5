import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
      
        LivroService servicoDeLivros = new LivroService();
        EmprestimoService servicoDeEmprestimos = new EmprestimoService();
        MultaService servicoDeMultas = new MultaService();

   
        Biblioteca biblioteca = new Biblioteca(servicoDeLivros, servicoDeEmprestimos, servicoDeMultas);

      
        biblioteca.adicionarLivro("Dom Quixote");
        biblioteca.adicionarLivro("1984");

    
        biblioteca.registrarEmprestimo("Dom Quixote", "Alice", LocalDate.now().plusDays(7));
        biblioteca.registrarEmprestimo("1984", "Bob", LocalDate.now().plusDays(5));

       
        biblioteca.devolverLivro("Dom Quixote");

       
        biblioteca.calcularMultas();
        }

}
