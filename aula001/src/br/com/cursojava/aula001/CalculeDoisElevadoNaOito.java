package br.com.cursojava.aula001;

public class CalculeDoisElevadoNaOito {

	double n1;
	double n2;
	
	public CalculeDoisElevadoNaOito() {
		n1 = 2;
		n2 = 8;
		System.out.println(Math.pow(n1, n2));
	}
	
	public static void main(String[] args) {
		CalculeDoisElevadoNaOito c = new CalculeDoisElevadoNaOito();
	}

}
