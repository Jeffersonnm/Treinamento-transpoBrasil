package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoIMC {
	
	double imc;
	double peso;
	double altura;

	
	public CalculoIMC() {
		peso = pedeDados("Informe o peso da pessoa");
		altura = pedeDados("Informe a altura da pessoa");
		imc = peso/Math.pow(altura, 2);
		System.out.printf("o IMC da pessoa é: %f", imc);
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		CalculoIMC c = new CalculoIMC();
	}

}
