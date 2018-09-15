package br.com.cursojava.aula001;

public class CalculoQuantidadeMinutos {
	
	int minutos;
	int dias;
	
	public CalculoQuantidadeMinutos() {
		dias = 90;
		minutos = 1440;
		System.out.printf("Quantidade de dias: %d\n"
				+ "Quantidade de minutos: %d\n"
				+ "Quantidade de minutos contidos na quantidade de dias: %d", 
				dias, minutos, calcularQuantidadeDeMinutos());
	}
	
	
	public int calcularQuantidadeDeMinutos() {
		return this.minutos * this.dias;
	}
	
	public static void main(String[] args) {
		CalculoQuantidadeMinutos c = new CalculoQuantidadeMinutos();
	}
}
