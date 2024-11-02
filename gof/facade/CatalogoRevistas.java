import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class CatalogoRevistas {
    private List<Revista> revistas = new ArrayList<>();

    public void registrarRevista(Revista revista) {
        revistas.add(revista);
        System.out.println("Revista registrada no catálogo: " + revista.getTitulo());
    }

    public List<Revista> listarRevistas() {
        return revistas;
    }
}