import java.util.*;
public class Biblioteca {
    private List < Emprestimo > emprestimos;
    public Biblioteca() {
        this.emprestimos = new ArrayList < > ();
    }
  
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario) {
        Emprestimo emprestimo = livro.criarEmprestimo(nomeDoUsuario);
        emprestimos.add(emprestimo);
    }
    public void exibirEmprestimos() {
        for(Emprestimo emprestimo: emprestimos) {
            System.out.println(emprestimo);
        }
    }
}
