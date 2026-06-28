package sistema_de_veiculos;

import model.Carro;
import model.CarroEletrico;

public class TestaCarros {

	public static void main(String[] args) {

		criarCarrosValidos();
		aceleracaoInvalida();
		nivelDeBateriaInvalida();
		carrosAcelerando();
		NivelInsuficienteDaBateria();

	}

	static void criarCarrosValidos() {
		System.out.println("\n>>> Caso 1: Carro Comum e Carro Elétrico Válidos!");
		try {
			Carro a = new Carro("Defender", 10);
			System.out.println("\n**********Carro Comum**********");
			a.visualizar();
			CarroEletrico b = new CarroEletrico("Dolphin", 10, 100);
			System.out.println("\n**********Carro Elétrico**********");
			b.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void aceleracaoInvalida() {
		System.out.println("\n>>> Caso 2: Carro Comum e Elétrico com aceleração inválida!");
		try {
			Carro c = new Carro("Defender", 0);
			c.visualizar();
			CarroEletrico d = new CarroEletrico("Dolphin", -10, 100);
			d.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void nivelDeBateriaInvalida() {
		System.out.println("\n>>> Caso 3: Carros Elétricos com Nível da Bateria inválido!");
		try {
			CarroEletrico e = new CarroEletrico("Dolphin", 10, 200);
			e.visualizar();
			CarroEletrico f = new CarroEletrico("Seal", 10, -50);
			f.visualizar();
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void carrosAcelerando() {
		System.out.println("\n>>> Caso 4: Carro Comum e Elétrico Acelerando!");
		try {
			Carro g = new Carro("Defender", 10);
			System.out.println("\n**********Carro Comum**********");
			g.visualizar();
			System.out.println("\n**********Carro Comum Acelerando**********");
			g.acelerar(70);
			CarroEletrico h = new CarroEletrico("Seal", 10, 100);
			System.out.println("\n**********Carro Elétrico**********");
			h.visualizar();
			System.out.println("\n**********Carro Elétrico Acelerando**********");
			h.acelerar(70);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

	static void NivelInsuficienteDaBateria() {
		System.out.println("\n>>> Caso 5: Carro Elétrico com Nível Insuficiente da Bateria!");
		try {
			CarroEletrico h = new CarroEletrico("Seal", 10, 100);
			System.out.println("\n**********Carro Elétrico**********");
			h.visualizar();
			System.out.println("\n**********Carro Elétrico Acelerando**********");
			h.acelerar(122);
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
