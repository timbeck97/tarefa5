import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.getLivroService().adicionarLivro("O Senhor dos Anéis");
        biblioteca.getLivroService().adicionarLivro("1984");

        Livro livro1 = biblioteca.getLivroService().encontrarLivro("O Senhor dos Anéis");
        Livro livro2 = biblioteca.getLivroService().encontrarLivro("1984");

        biblioteca.getEmprestimoService().registrarEmprestimo(livro1, "João", LocalDate.now().minusDays(5));
        biblioteca.getEmprestimoService().registrarEmprestimo(livro2, "Maria", LocalDate.now().minusDays(10));

        System.out.println("\nMultas:");
        biblioteca.getEmprestimoService().calcularMultas();

        System.out.println("\nDevolvendo livro 1984...");
        biblioteca.getEmprestimoService().devolverLivro("1984");

        System.out.println("\nMultas após devolução:");
        biblioteca.getEmprestimoService().calcularMultas();
	}

}
