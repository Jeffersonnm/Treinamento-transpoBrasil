package br.com.cursojava.aula001;

public class CalculoAreaRetangulo {
	
	float area;
	float altura;
	float base;
	
	public CalculoAreaRetangulo() {
		base = 8;
		altura = 15;
		System.out.printf("Altura: %.1f\nBase: %.1f\nA área do retângulo é igual a: %.1f", altura, base, calculaArea(base, altura));
	}
	
	private float calculaArea(float base, float altura) {
		return base * altura;
	}
	
	public static void main(String[] args) {
		new CalculoAreaRetangulo();
	}
}
