package sistema_de_usuarios.model;

public class Administrador extends Usuario {

	String nivelDeAcesso;

	public Administrador(String nome, String email, String nivelDeAcesso) {
		super(nome, email);
		this.nivelDeAcesso = nivelDeAcesso;
	}

	public String getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public void setNivelDeAcesso(String nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Nível de Acesso: %s%n", this.nivelDeAcesso);
	}
}
