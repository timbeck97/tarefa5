import java.util.*;
import java.time.*;
public class Biblioteca {

    //possui uma lista de interfaces (abastracao)
    //agora a classe biblioteca nao sabe qual é a implementacao do repositorio
    //se em algum momento alterar a regra de persistencia, nao será necessário alterar a classe Biblioteca

     private RepositorioInterface repositorio;

    public Biblioteca(RepositorioInterface repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionarMidia(Midia midia) {
        repositorio.adicionarMidia(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    public void exibirMidias() {
        for (Midia midia : repositorio.obterTodasMidias()) {
            midia.exibirDetalhes();
        }
    }
}
