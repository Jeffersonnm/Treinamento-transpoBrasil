package br.com.cursojava.aula006;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Carro();
		Aviao av = new Aviao();
		Veiculo v3 = av;
		/*
		 * Quais m�todos s�o poss�veis de serem chamados na refer�ncia v3?
		 * R: Todos os m�todos da classe Veiculo e apenas isso.
		 * Quais m�todos s�o poss�veis de serem chamados na refer�ncia av?
		 * R: Todos os m�todos da classe Veiculo e os m�todos criados na classe Aviao.
		 */
	}
}
