import java.time.LocalDate;
public class Emprestimo {
    private Object midia;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private CalculoMulta estrategiaCalculo;

    public Emprestimo(Object midia, String nomeDoUsuario, LocalDate dataDeDevolucao, CalculoMulta estrategiaCalculo) {
        this.midia = midia;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.estrategiaCalculo = estrategiaCalculo;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public long calcularDiasAtraso() {
        return LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Object getMidia() {
        return midia;
    }

    public double calcularMulta() {
        long diasAtraso = calcularDiasAtraso();
        return estrategiaCalculo.calcularMulta(diasAtraso);
    }
}