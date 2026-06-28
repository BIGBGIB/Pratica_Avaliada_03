package model;
public class Carro {
	
	String modelo;
	int velocidade;
	
	public Carro(String modelo, int velocidade) {
		
		Validadores.validarAceleracao(velocidade);
		
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		Validadores.validarAceleracao(velocidade);
		this.velocidade = velocidade;
	}
	
	public void acelerar(int valor) {
		
		System.out.printf("Aumentar velocidade do carro em: %d Km/h\n", valor);
		this.velocidade += valor;
		System.out.printf("Velocidade Atual: %d Km/h\n", velocidade);
		
	}
	
	public void visualizar() {
		
		System.out.printf("Modelo: %s%n", this.modelo);
		System.out.printf("Velocidade: %d Km/h\n", this.velocidade);
		
	}

}
