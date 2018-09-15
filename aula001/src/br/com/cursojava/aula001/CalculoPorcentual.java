package br.com.cursojava.aula001;

public class CalculoPorcentual {
	
	double valor;
	double porcentual;
	
	public CalculoPorcentual() {
		porcentual = 13.5;
		valor = 870.5;
		System.out.printf("O valor correspondente de %.1f%% sobre o valor de %.1f é %.1f",
				porcentual, valor, (porcentual/100)*valor);
	}
	
	public static void main(String[] args) {
		CalculoPorcentual c = new CalculoPorcentual();
	}
}
