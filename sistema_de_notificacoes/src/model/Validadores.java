package model;

public class Validadores {
	
	public static void validarMensagem(String mensagem) {
		if (mensagem == null || mensagem.trim().isEmpty())
			throw new IllegalArgumentException("A Mensagem não pode ser vazia!");
	}
	
	public static void validarDestinatario(String destinatario) {
		if (!destinatario.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$") && !destinatario.matches("^[0-9]{9}$"))
			throw new IllegalArgumentException("E-mail ou Telefone Inválido!");
	}
	
	
	
}
