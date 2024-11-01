import java.util.*;
import java.time.*;
class RepositorioEmprestimoImplementacao implements RepositorioEmprestimo {
    private final List<Emprestimo> emprestimos = new ArrayList<>();

    @Override
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: " + emprestimo);
    }

    @Override
    public List<Emprestimo> buscarEmprestimosPendentes() {
        List<Emprestimo> pendentes = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                pendentes.add(emprestimo);
            }
        }
        return pendentes;
    }

    @Override
    public void atualizarEmprestimo(Emprestimo emprestimo) {
        System.out.println("Empréstimo atualizado: " + emprestimo);
    }
}
