import java.time.LocalDate;
public class Main{
 public static void main(String[] args) {
       EmprestimoService gerenciador = new EmprestimoService();
        
        
        Observador emailObservador = new ObservadorImplementacao();
        gerenciador.adicionarObservador(emailObservador);

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", "joao@email.com");
        Emprestimo emprestimo = new Emprestimo(livro, usuario, LocalDate.now().plusDays(3));

       
        gerenciador.registrarEmprestimo(emprestimo);

       
        System.out.println("\nVerificando notificações:");
        gerenciador.verificarEmprestimos();
    }
}