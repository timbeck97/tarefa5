import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

 
    public void registrarEmprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        CalculoMulta estrategiaCalculo;
        if (midia instanceof Livro) {
            estrategiaCalculo = new CalculoMultaLivro();
        } else if (midia instanceof Revista) {
            estrategiaCalculo = new CalculoMultaRevista();
        } else {
            throw new IllegalArgumentException("Tipo de mídia não suportado");
        }
        Emprestimo emprestimo = new Emprestimo(midia, nomeDoUsuario, dataDeDevolucao, estrategiaCalculo);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + nomeDoUsuario);
    }

   
    public void calcularMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                if (multa > 0) {
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                }
            }
        }
    }
}