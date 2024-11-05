public class MidiaFactory {
    //classe principal responsavel pela criacao dos objetos
    public static Midia criarMidia(TipoMidia tipo, String titulo, String autorOuEdicao) {
        switch (tipo) {
            case LIVRO:
                return new Livro(titulo, autorOuEdicao);
            case REVISTA:
                return new Revista(titulo, Integer.parseInt(autorOuEdicao));
            default:
                throw new IllegalArgumentException("Tipo de mídia não reconhecido.");
        }
    }
}