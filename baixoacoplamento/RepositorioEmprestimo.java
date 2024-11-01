import java.util.*;
import java.time.*;
interface RepositorioEmprestimo {
    void registrarEmprestimo(Emprestimo emprestimo);
    List<Emprestimo> buscarEmprestimosPendentes();
    void atualizarEmprestimo(Emprestimo emprestimo);
}
