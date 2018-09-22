package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaPonderada {
	
	double nota1;
	double nota2;
	double nota3;
	double peso1;
	double peso2;
	double peso3;
	
	public MediaPonderada() {
		nota1 = pedeDados("Informe a nota 1");
		nota2 = pedeDados("Informe a nota 2");
		nota3 = pedeDados("Informe a nota 3");
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		System.out.printf("A media pondera é igual a: %.2f", ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/(peso1+peso2+peso3));
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}

	public static void main(String[] args) {
		new MediaPonderada();
	}
}
