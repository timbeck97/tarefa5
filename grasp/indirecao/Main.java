import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
      
       RepositorioInterface repositorio = new RepositorioImplementacao();
        Biblioteca biblioteca = new Biblioteca(repositorio);

        Midia livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Midia revista1 = new Revista("National Geographic", 202);

        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);

        System.out.println("\nMídias na biblioteca:");
        biblioteca.exibirMidias();
	}

}
