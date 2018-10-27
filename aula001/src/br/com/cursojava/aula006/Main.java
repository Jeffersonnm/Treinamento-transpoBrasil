package br.com.cursojava.aula006;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Aviao av = new Aviao();
		Veiculo v3 = av;
		/*
		 * Quais métodos são possíveis de serem chamados na referência v3?
		 * R: Todos os métodos da classe Veiculo e apenas isso.
		 * Quais métodos são possíveis de serem chamados na referência av?
		 * R: Todos os métodos da classe Veiculo e os métodos criados na classe Aviao.
		 */
	}
}
