import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class ServicoEmprestimo {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void fazerEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo feito para: " + emprestimo.getNomeDoUsuario());
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }
}