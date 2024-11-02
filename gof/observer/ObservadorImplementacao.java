public class ObservadorImplementacao implements Observador {
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Enviando notificação por e-mail para: " + emprestimo.getUsuario().getNome() + " - Lembrete: devolução do livro \"" + emprestimo.getLivro().getTitulo() + "\" em breve.");
    }
}