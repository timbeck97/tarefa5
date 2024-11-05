import java.util.*;
import java.time.*;
public class MultaService {

//classe service utilizada para implementar as regras de multa

 public void calcularMultas(List<Emprestimo> emprestimos) {
        for (Emprestimo emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
                double multa = diasAtraso > 0 ? diasAtraso * 2 : 0;
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }
}
