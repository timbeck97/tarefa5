import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Biblioteca {
    private List<String> livros;
    private ConfiguracaoBiblioteca configuracaoBiblioteca;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.configuracaoBiblioteca = ConfiguracaoBiblioteca.getInstance("08:00 - 18:00", 2.0);
    }

    // Adiciona um livro à biblioteca
    public void adicionarLivro(String livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    // Exibe as configurações da biblioteca
    public void exibirConfiguracoes() {
        System.out.println(configuracaoBiblioteca.toString());
    }
}