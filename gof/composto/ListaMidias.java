import java.util.List;
import java.util.ArrayList;
public class ListaMidias implements Midia{
    private String nome;
    private List<Midia> midias; // Lista de mídias (Livros e Revistas)

    public ListaMidias(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public void exibir() {
        System.out.println("Coleção: " + nome);
        for (Midia midia : midias) {
            midia.exibir(); // Chama o método exibir de cada mídia
        }
    }
}