import java.time.LocalDate;
public class Main{
 public static void main(String[] args) {
         Biblioteca biblioteca = new Biblioteca();
        
     
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Revista revista1 = new Revista("National Geographic", 202);
        biblioteca.adicionarMidia(livro1);
        biblioteca.adicionarMidia(revista1);
        
       
        ListaMidias lista = new ListaMidias("Coleção Fantasia");
        lista.adicionarMidia(new Livro("Harry Potter", "J.K. Rowling"));
        lista.adicionarMidia(new Revista("Comic Book", 1));
        biblioteca.adicionarMidia(lista);
        
      
        biblioteca.exibirBiblioteca();
    }
}