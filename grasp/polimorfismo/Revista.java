import java.util.*;
import java.time.*;
public class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return "Revista: " + getTitulo() + ", Edição: " + edicao;
    }
}
