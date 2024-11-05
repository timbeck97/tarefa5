import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class CalculoMultaImplementacao implements CalculoMultaInterface {

    //classe que implementa a interface de calculo de multa

    private final double valorPorDia;

    public CalculoMultaImplementacao(double valorPorDia) {
        this.valorPorDia = valorPorDia;
    }

    @Override
    public double calcularMulta(Emprestimo emprestimo) {
        long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
        return diasAtraso > 0 ? diasAtraso * valorPorDia : 0.0;
    }
}
