import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

   
    public void adicionarMidia(TipoMidia tipo, String titulo, String autorOuEdicao) {
        Midia midia = MidiaFactory.criarMidia(tipo, titulo, autorOuEdicao);
        midias.add(midia);
        System.out.println(midia.toString() + " adicionado.");
    }

   
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.toString());
        }
    }
}