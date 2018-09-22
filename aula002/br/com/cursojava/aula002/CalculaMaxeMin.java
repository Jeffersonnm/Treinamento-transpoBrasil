package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculaMaxeMin {
	
	double n1;
	double n2;
	double n3;
	
	public CalculaMaxeMin() {
		n1 = pedeDados("Informe nota 1");
		n2 = pedeDados("Informe nota 2");
		n3 = pedeDados("Informe nota 3");
		System.out.printf("A maior nota é: %f\nA menor nota é: %f", Math.max(Math.max(n1, n3), Math.max(n2, n3)), Math.min(Math.min(n1, n3), Math.min(n2, n3)));
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		new CalculaMaxeMin();
	}
}
