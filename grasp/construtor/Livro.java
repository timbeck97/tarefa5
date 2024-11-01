import java.util.*;
public class Livro {
    private String titulo;
    public Livro(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
   
    public Emprestimo criarEmprestimo(String nomeDoUsuario) {
        return new Emprestimo(this, nomeDoUsuario);
    }
}
