import java.util.*;
import java.time.*;
public class Biblioteca {

    //possui uma lista de interfaces (abastracao)
    //se em algum momento for adicionado um novo tipo de livro ou midia, nao será necessário alterar a classe Biblioteca
    
    private List<Midia> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia);
        }
    }
}
