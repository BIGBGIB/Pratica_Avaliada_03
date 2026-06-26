package sistema_de_usuarios.model;

public class Usuario {

	String nome;
	String email;
	
	public Usuario(String nome, String email) {
		
		Validadores.validarNome(nome);
		Validadores.validarEmail(email);
		
		this.nome = nome;
		this.email = email;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		Validadores.validarNome(nome);
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		Validadores.validarEmail(email);
		this.email = email;
	}


	public void visualizar() {
		System.out.println("******************************");
		System.out.println("             DADOS            ");
		System.out.println("******************************");
		System.out.printf("Nome: %s%n", this.nome);
		System.out.printf("Email: %s%n", this.email);
		
	}
	
	
}
