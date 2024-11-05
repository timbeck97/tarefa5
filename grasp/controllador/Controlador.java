import java.util.*;
import java.time.*;
public class Controlador {

    //classe de controle criada para realizar as operacoes, ela serve como intermediario entre a interface e a biblioteca
    //ela recebe os dados da interface e os envia para a biblioteca, e tambem recebe os dados da biblioteca e os envia para a interface
    //ela nao possui regras de negocio, apenas realiza a comunicacao entre a interface e a biblioteca

    private Biblioteca biblioteca;

    public Controlador(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void registrarEmprestimo(String titulo, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = new Livro(titulo);
        biblioteca.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
    }

    public void devolverLivro(String titulo) {
        Livro livro = new Livro(titulo); // Criar um novo livro só para a busca
        biblioteca.devolverLivro(livro);
    }

    public void exibirMultas() {
        System.out.println("\nMultas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    public void consultarLivrosAtrasados() {
        System.out.println("\nConsultando livros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.calcularMulta() > 0) {
                System.out.println(emprestimo);
            }
        }
    }
}
