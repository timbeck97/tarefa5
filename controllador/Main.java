import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
        Controlador controlador = new Controlador(biblioteca);

        controlador.registrarEmprestimo("O Senhor dos Anéis", "João", LocalDate.now().minusDays(5));
        controlador.registrarEmprestimo("1984", "Maria", LocalDate.now().minusDays(10));

        controlador.exibirMultas();
        System.out.println("\nDevolvendo livro 1984...");
        controlador.devolverLivro("1984");
        controlador.exibirMultas();
        controlador.consultarLivrosAtrasados();
	}

}
