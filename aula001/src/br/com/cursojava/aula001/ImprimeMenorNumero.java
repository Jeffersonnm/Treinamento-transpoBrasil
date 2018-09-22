package br.com.cursojava.aula001;

public class ImprimeMenorNumero {
	int a;
	int b;
	int c;
	int d;
	
	public ImprimeMenorNumero() {
		a = 10;
		b = 7;
		c = 25;
		d = 10;
		System.out.println(min(min(a, b), min(c, d)));
	}
	
	private double min(double a, double b) {
		return Math.min(a, b);
	}
	
	public static void main(String[] args) {
		new ImprimeMenorNumero();
	
	}	
}
