package br.com.cursojava.aula001;

public class CalcularPerimetroDeQuadrado {
	
	int lados;
	
	public CalcularPerimetroDeQuadrado() {
		lados = 25;
		System.out.printf("Medida do lado do quadrado: %d\n"
				+ "Perimetro do quadrado: %d", 
				lados, imprimePerimetroDoQuadrado(lados));
	}
	
	private int imprimePerimetroDoQuadrado(int lados) {
		return lados*4;
	}
	
	public static void main(String[] args) {
		CalcularPerimetroDeQuadrado c = new CalcularPerimetroDeQuadrado();
	}
}
