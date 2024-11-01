public class Livro implements Midia {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void exibir() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }
}