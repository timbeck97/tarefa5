import java.util.*;
import java.time.*;
public interface RepositorioInterface  {
    //interface criada para definir o metodo de adicionar midia
   void adicionarMidia(Midia midia);
    List<Midia> obterTodasMidias();
}
