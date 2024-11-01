import java.util.*;
import java.time.*;
public class Biblioteca {
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
