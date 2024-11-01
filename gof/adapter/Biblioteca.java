import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {
    private List<Emprestimo> emprestimos;
    private ServicoPagamento servicoPagamento; 

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
        this.servicoPagamento = new ServicoPagamentoAdapter(); 
    }

    // Registra um empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

 
    public void processarPagamentosDeMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.calcularDiasAtraso() > 0) {
                double multa = emprestimo.calcularMulta();
                servicoPagamento.pagar(emprestimo.getNomeDoUsuario(), multa);
            }
        }
    }
}