import java.util.*;
import java.time.*;
public class Biblioteca {
    private LivroService livroService = new LivroService();
    private EmprestimoService emprestimoService = new EmprestimoService();

    public LivroService getLivroService() {
        return livroService;
    }

    public EmprestimoService getEmprestimoService() {
        return emprestimoService;
    }
}
