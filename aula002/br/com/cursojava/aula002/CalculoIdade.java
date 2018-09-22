package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoIdade {
	
	double idadeAnos;
	double idadeMeses;
	double idadeDias;
	
	public CalculoIdade() {
		idadeDias= pedeDados("Informe a sua idade em dias");
		idadeAnos = idadeDias/360;
		idadeMeses = (idadeAnos - (int)idadeAnos) *10;
		idadeDias = idadeDias-((int)idadeAnos*360)-(idadeMeses*30);
		idadeAnos = (int)idadeAnos;
		System.out.printf("Idade em anos é: %.0f\n"
				+ "Idade em meses é: %.0f\n"
				+ "Idade em dias é: %.0f",
				idadeAnos, idadeMeses, idadeDias);
		
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {

		CalculoIdade c = new CalculoIdade();
	}
}
