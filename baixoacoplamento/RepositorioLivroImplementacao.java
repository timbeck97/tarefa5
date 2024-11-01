import java.util.*;
import java.time.*;
class RepositorioLivroImplementacao implements RepositorioLivro {
    private final List<Livro> livros = new ArrayList<>();

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado ao repositório.");
    }

    @Override
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
