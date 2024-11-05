import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //Classe main alterada para ter a resposabilidade
        //de criar os objetos, dessa forma retirando esta responsabilidade da classe Biblioca, melhorando a coesão.

        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");
        biblioteca.registrarEmprestimo(livro1, "João");
        biblioteca.registrarEmprestimo(livro2, "Maria");
        System.out.println("Empréstimos registrados:");
        biblioteca.exibirEmprestimos();
    }



}
