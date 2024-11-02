import java.time.LocalDate;
public class Main{
 public static void main(String[] args) {
        BibliotecaServico bibliotecaServico = new BibliotecaServico();

        // Adicionando livros e revistas
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        bibliotecaServico.adicionarLivro(livro1);
        
        Revista revista1 = new Revista("Science Monthly", 103);
        bibliotecaServico.adicionarRevista(revista1);

        // Realizando um empréstimo
        Emprestimo emprestimo1 = new Emprestimo(livro1, "Carlos", LocalDate.now().minusDays(3));
        bibliotecaServico.realizarEmprestimo(emprestimo1);

        // Consultando multa
        double multa = bibliotecaServico.consultarMulta(emprestimo1);
        System.out.println("Multa para Carlos: R$ " + multa);
    }
}