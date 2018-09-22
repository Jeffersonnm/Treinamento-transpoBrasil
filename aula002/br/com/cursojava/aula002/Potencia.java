package br.com.cursojava.aula002;

import java.util.Scanner;

public class Potencia {
	
	double numero;
	
	public Potencia() {
		numero = pedeDados("Informe um numero");
		System.out.printf("Numero elevado na potencia de 2: %.0f", Math.pow(numero, 2));
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	
	public static void main(String[] args) {
		new Potencia();
	}
}
