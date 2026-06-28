package model;

public class NotificacaoSMS extends Notificacao {

	public NotificacaoSMS(String destinatario) {
		super(destinatario);
	}

	@Override
	public void enviar(String mensagem) {
		super.enviar(mensagem);
		
		System.out.printf("Enviando SMS para: %s%n", this.destinatario);
		System.out.printf("Assunto do SMS: %s%n", mensagem);
	}
}
