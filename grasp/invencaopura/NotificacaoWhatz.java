import java.util.*;
import java.time.*;

class NotificacaoWhatz implements InterfaceNotificacao {
     @Override
    public void notificar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando mensagem no whatz para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
