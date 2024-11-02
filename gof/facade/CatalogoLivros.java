import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class CatalogoLivros {
    private List<Livro> livros = new ArrayList<>();

    public void registrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro registrado no catálogo: " + livro.getTitulo());
    }

    public List<Livro> listarLivros() {
        return livros;
    }
}