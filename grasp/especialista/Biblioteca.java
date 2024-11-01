import java.util.*;
import java.time.*;
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
    }

    public void exibirMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            double multa = emprestimo.calcularMulta(); // Agora o cálculo é feito no próprio Emprestimo
            System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
        }
    }
}
