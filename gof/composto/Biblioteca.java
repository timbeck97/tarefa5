import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Biblioteca {
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void exibirBiblioteca() {
        System.out.println("Biblioteca:");
        for (Midia midia : midias) {
            midia.exibir(); 
        }
    }
}