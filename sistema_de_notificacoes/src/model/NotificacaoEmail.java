package model;

public class NotificacaoEmail extends Notificacao{

	public NotificacaoEmail(String destinatario) {
		super(destinatario);
	}
	
	@Override
	public void enviar(String mensagem) {
		super.enviar(mensagem);
		
		System.out.printf("Enviando E-mail para: %s%n", this.destinatario);
		System.out.printf("Assunto do E-mail: %s%n", mensagem);
	}

}
