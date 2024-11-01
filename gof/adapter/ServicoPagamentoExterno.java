import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
class ServicoPagamentoExterno {
    public void pagarFatura(String identificador, double valor) {
    System.out.println("Pagamento de R$ " + valor + " processado para o identificador: " + identificador);
    }
}