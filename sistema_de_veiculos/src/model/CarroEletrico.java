package model;

public class CarroEletrico extends Carro {

	private static final int 
	CONSUMO_POR_ACELERACAO = 2;
	
	int nivelBateria;
    

	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		
		Validadores.validarNivelDaBateria(nivelBateria);
		
		this.nivelBateria = nivelBateria;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {

		Validadores.validarNivelDaBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("Nível de Bateria: %d%n", this.nivelBateria);
	}
	
	@Override
	public void acelerar(int valor) {
		super.acelerar(valor);
		int consumoDaBateria = valor / CONSUMO_POR_ACELERACAO;
		System.out.printf("Consumo da bateria: %d%n", consumoDaBateria);
		this.nivelBateria -= consumoDaBateria;
		Validadores.validarNivelInsuficienteDaBateria(nivelBateria, consumoDaBateria);
		System.out.printf("Nível da bateria: %d%n", this.nivelBateria);
		}
	
}
