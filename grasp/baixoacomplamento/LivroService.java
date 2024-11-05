import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class LivroService{

    //classe service utilizada para implementar as regras de emprestimo

	 private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo) {
        livros.add(new Livro(titulo));
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    public Livro encontrarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
