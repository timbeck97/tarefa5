import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        biblioteca.registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        biblioteca.registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(20), LocalDate.now().minusDays(15));
        
        System.out.println("Multas registradas:");
        biblioteca.exibirMultas();

	}

}
