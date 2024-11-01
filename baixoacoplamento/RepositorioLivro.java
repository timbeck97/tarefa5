import java.util.*;
import java.time.*;
interface RepositorioLivro {
    void adicionarLivro(Livro livro);
    Livro buscarLivro(String titulo);
}
