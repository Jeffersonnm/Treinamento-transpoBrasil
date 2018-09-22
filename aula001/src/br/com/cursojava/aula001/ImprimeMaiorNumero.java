package br.com.cursojava.aula001;

public class ImprimeMaiorNumero {
	int a;
	int b;
	int c;
	int d;
	
	public ImprimeMaiorNumero() {
		a = 3;
		b = 7;
		c = 25;
		d = 10;
		System.out.println(max(max(a, b), max(c, d)));
	}
	
	private double max(double a, double b) {
		return Math.max(a, b);
	}
	
	public static void main(String[] args) {
		new ImprimeMaiorNumero();
	
	}	

}
