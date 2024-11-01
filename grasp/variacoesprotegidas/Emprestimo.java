import java.util.*;
import java.time.*;
public class Emprestimo {
   private Livro livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private CalculoMultaInterface calculadoraMulta;

    public Emprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao, CalculoMultaInterface calculadoraMulta) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.calculadoraMulta = calculadoraMulta;
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

    // Cálculo de multa delegada à calculadora
    public double calcularMulta() {
        return calculadoraMulta.calcularMulta(this);
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }
}
