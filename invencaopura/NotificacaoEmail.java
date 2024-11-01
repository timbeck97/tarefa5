import java.util.*;
import java.time.*;

class NotificacaoEmail implements InterfaceNotificacao {
     @Override
    public void notificar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
    }
}
