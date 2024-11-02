import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
class GestorMultas {
    public double verificarMulta(Emprestimo emprestimo) {
        long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 1.5 : 0.0; // Valor da multa alterado para R$1,50 por dia
    }
}