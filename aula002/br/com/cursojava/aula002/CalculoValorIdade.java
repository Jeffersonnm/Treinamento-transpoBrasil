package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoValorIdade {
	
	double idadeAnos;
	double idadeDias;
	
	public CalculoValorIdade() {
		idadeAnos = pedeDados("Informe a idade em anos");
		idadeDias = idadeAnos*365;
		System.out.printf("A idade em dia é igual a: %f", idadeDias);
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		CalculoValorIdade c = new CalculoValorIdade();
	}
}
