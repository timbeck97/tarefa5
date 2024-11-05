import java.util.*;
import java.time.*;
public class Biblioteca {

    //classe biblioteca agora é responsável por instanciar os serviços
    // e agora ela nao fica responsavel por toda a logica, aumentando a coesao

    private LivroService livroService = new LivroService();
    private EmprestimoService emprestimoService = new EmprestimoService();

    public LivroService getLivroService() {
        return livroService;
    }

    public EmprestimoService getEmprestimoService() {
        return emprestimoService;
    }
}
