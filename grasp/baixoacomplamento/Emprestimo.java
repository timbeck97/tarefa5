import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro getLivro() {
        return livro;
    }
}
