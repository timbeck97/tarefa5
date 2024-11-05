import java.util.List;
import java.util.ArrayList;

//classe lista de mídias que implementa a interface Midia que é utilizada para exibir os itens, tanto de forma unica do item
//como de forma composta, ou seja, uma lista de itens
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

    //implementa a interface Midia que é utilizada para exibir os itens, tanto de forma unica do item
    @Override
    public void exibir() {
        System.out.println("Coleção: " + nome);
        for (Midia midia : midias) {
            midia.exibir(); // Chama o método exibir de cada mídia
        }
    }
}