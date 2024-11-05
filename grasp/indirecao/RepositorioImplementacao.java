import java.util.*;
import java.time.*;
public class RepositorioImplementacao implements RepositorioInterface {

    //implementacao da interface

    private List<Midia> midias = new ArrayList<>();

    @Override
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public List<Midia> obterTodasMidias() {
        return midias;
    }
}
