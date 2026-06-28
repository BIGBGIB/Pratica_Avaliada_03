package sistema_de_notificacoes;

import model.Notificacao;
import model.NotificacaoEmail;
import model.NotificacaoSMS;

public class TestaNotificacoes {

	public static void main(String[] args) {

		criarNotificacoesValidas();
		tipoInvalido();
		mensagemVazia();
		destinatarioInvalido();

	}

	static void criarNotificacao(String tipo, String destinatario, String mensagem) {

		Notificacao notificacao;

		if (tipo.equalsIgnoreCase("Email")) {
			notificacao = new NotificacaoEmail(destinatario);
		} else if (tipo.equalsIgnoreCase("SMS")) {
			notificacao = new NotificacaoSMS(destinatario);
		} else {
			throw new IllegalArgumentException("Tipo de notificação inexistente!");
		}

		notificacao.enviar(mensagem);

	}

	static void criarNotificacoesValidas() {
		System.out.println("\n>>> Caso 1: Notificação Email e Notificação SMS Válidas!");

		System.out.println("\n**********E-mail**********");
		try {
			criarNotificacao("Email", "Gabriel_Oliveira@gmail.com", "Candidatura Aceita!");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}

		System.out.println("\n**********SMS**********");
		try {
			criarNotificacao("SMS", "996496409", "Comprar Cebola");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void tipoInvalido() {
		System.out.println("\n>>> Caso 2: Notificação com tipo inválido!");

		try {
			criarNotificacao("FAX", "Gabriel_Oliveira@gmail.com", "Candidatura Aceita!");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}

	}

	static void mensagemVazia() {
		System.out.println("\n>>> Caso 3: Notificação Email e Notificação SMS com Mensagens Vazias!");

		System.out.println("\n**********E-mail**********");
		try {
			criarNotificacao("Email", "Gabriel_Oliveira@gmail.com", "");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}

		System.out.println("\n**********SMS**********");
		try {
			criarNotificacao("SMS", "996496409", "");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void destinatarioInvalido() {
		System.out.println("\n>>> Caso 4: Notificação Email e Notificação SMS com Destinatarios Inválidos!");

		System.out.println("\n**********E-mail**********");
		try {
			criarNotificacao("Email", "Gabriel_Oliveira", "Candidatura Aceita!");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}

		System.out.println("\n**********SMS**********");
		try {
			criarNotificacao("SMS", "99649", "Comprar Cebola");

		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
