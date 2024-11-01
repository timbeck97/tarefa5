import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
      
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarMidia(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarMidia(new Revista("National Geographic", 202));
        biblioteca.adicionarMidia(new Livro("1984", "George Orwell"));

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
	}

}
