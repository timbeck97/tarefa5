import java.time.LocalDate;
public class Main{
 public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarMidia(TipoMidia.LIVRO, "O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarMidia(TipoMidia.REVISTA, "National Geographic", "202");

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
    }
}