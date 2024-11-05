public class ObservadorImplementacao implements Observador {

    //implementação da logica de envio de 1 tipo de notificacao
    @Override
    public void atualizar(Emprestimo emprestimo) {
        System.out.println("Enviando notificação por e-mail para: " + emprestimo.getUsuario().getNome() + " - Lembrete: devolução do livro \"" + emprestimo.getLivro().getTitulo() + "\" em breve.");
    }
}