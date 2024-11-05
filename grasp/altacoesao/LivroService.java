import java.util.*;
import java.time.*;
public class LivroService{

 private List<Emprestimo> emprestimos = new ArrayList<>();

    //classe de servico criada para separar a logica de emprestimo da classe Livro

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        livros.add(livro);
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
