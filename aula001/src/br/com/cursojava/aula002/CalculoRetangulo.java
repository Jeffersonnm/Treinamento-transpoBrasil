package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoRetangulo {
	
	double area;
	double perimetro;
	double base;
	double altura;
	
	public CalculoRetangulo() {
		base = pedeDados("Informe a base do retangulo");
		altura = pedeDados("Informe a altura do retangulo");
		System.out.printf("A area do retangulo é igual a: %f\n", base * altura);
		System.out.printf("O perimetro do retangulo é igual a: %f", (base + altura)*2);
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		new CalculoRetangulo();
	}
}
