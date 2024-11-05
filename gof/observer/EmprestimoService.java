import java.util.ArrayList;
import java.util.List;

public class EmprestimoService {
    private List<Emprestimo> emprestimos;
    private List<Observador> observadores;

    public EmprestimoService() {
        this.emprestimos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado para: " + emprestimo.getUsuario().getNome());
        notificarObservadores(emprestimo); 
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores(Emprestimo emprestimo) {
        for (Observador observador : observadores) {
            observador.atualizar(emprestimo);
        }
    }

    //aqui onde "a magica acontece" pois essa classe depende de uma abstração, dessa forma ela não depende de uma implementação concreta
    // e sim de uma interface, o que facilita a manutenção e a evolução do código.
    public void verificarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido() && emprestimo.diasParaDevolucao() > 0) {
                notificarObservadores(emprestimo);
            }
        }
    }
}
