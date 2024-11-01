import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
   private List<Emprestimo> emprestimos;
    private InterfaceNotificacao notificador; // Composição com a interface Notificador

    public Biblioteca(InterfaceNotificacao notificador) {
        this.emprestimos = new ArrayList<>();
        this.notificador = notificador; // Injeção de dependência
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario,
                                    String emailDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, emailDoUsuario, dataDeDevolucao);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    public void notificarUsuariosComAtraso() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = emprestimo.calcularDiasAtraso();
                if (diasAtraso > 0) {
                    notificador.notificar(emprestimo.getEmailDoUsuario(),
                            "Multa", "Você tem uma multa de R$ " + (diasAtraso * 2.0) +
                            " pelo livro \"" + emprestimo.getLivro().getTitulo() + "\".");
                }
            }
        }
    }
}
