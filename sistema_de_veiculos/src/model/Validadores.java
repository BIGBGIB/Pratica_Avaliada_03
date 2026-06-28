package model;

public class Validadores {

		public static void validarAceleracao(int valor) {
			if (valor <= 0)
				throw new IllegalArgumentException("A velocidade não pode ser menor que 0 nem igual a 0!");
		}
		
		public static void validarNivelDaBateria(int nivel) {
			if (nivel < 0 || nivel > 100)
				throw new IllegalArgumentException("O Nível da bateria não pode ser menor que 0 nem maior que 100!");
		}
		
		public static void validarNivelInsuficienteDaBateria(int nivelBateria, int consumo) {
			if (consumo > nivelBateria)
				throw new IllegalArgumentException("Não é possível acelerar! Consumo Maior que o Nível da Bateria");
		}
	}
