package br.com.cursojava.aula002;

import java.util.Scanner;

public class SolicitarNotaseCalcularMedia {

	double nota1;
	double nota2;
	double nota3;
	
	public SolicitarNotaseCalcularMedia() {
		nota1 = pedeNotas("Informe a nota 1 abaixo e pressione enter");
		nota2 = pedeNotas("Informe a nota 2 abaixo e pressione enter");
		nota3 = pedeNotas("Informe a nota 3 abaixo e pressione enter");
		System.out.printf("A media é igual a %f", (nota1 + nota2 + nota3)/3);
	}
	
	double pedeNotas(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		SolicitarNotaseCalcularMedia s = new SolicitarNotaseCalcularMedia();
	}
}
