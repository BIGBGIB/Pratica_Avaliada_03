package model;

public class Notificacao {
	
	String destinatario;

	public Notificacao(String destinatario) {

		this.destinatario = destinatario;
		Validadores.validarDestinatario(destinatario);
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validadores.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) {
		
		Validadores.validarMensagem(mensagem);
	}

}
