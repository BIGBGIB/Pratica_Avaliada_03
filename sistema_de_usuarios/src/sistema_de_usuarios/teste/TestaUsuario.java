package sistema_de_usuarios.teste;

import sistema_de_usuarios.model.Administrador;
import sistema_de_usuarios.model.Usuario;

public class TestaUsuario {

	public static void main(String[] args) {

		criarObjetosValidos();
		usuarioNomeVazio();
		emailInvalido();

	}

	static void criarObjetosValidos() {
		System.out.println("\n>>> Caso 1: Usuário e administrador Válido!");
		try {
			Usuario a = new Usuario("Gabriel Oliveira", "gabriel_oliveira@empresa.com");
			a.visualizar();
			Administrador b = new Administrador("Raquel Ximenes", "Raquel_ximenes@empresa.com", "Master");
			b.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void usuarioNomeVazio() {
		System.out.println("\n>>> Caso 2: Usuário com nome vazio");
		try {
			 new Usuario("", "gabriel_oliveira@gmail.com"); // nome inválido: vazio
			
			
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void emailInvalido() {
		System.out.println("\n>>> Caso 3: Administrador com email inválido");
		try {
		  new Administrador("Raquel Ximenes", "emailinvalido", "Master"); // email inválido: sem @
			
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
