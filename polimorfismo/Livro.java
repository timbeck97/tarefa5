import java.util.*;
import java.time.*;

public class Livro extends Midia {
    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + ", Autor: " + autor;
    }
}
