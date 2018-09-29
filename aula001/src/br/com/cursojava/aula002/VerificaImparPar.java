package br.com.cursojava.aula002;

import java.util.Scanner;

public class VerificaImparPar {

	int numero;
	
	public VerificaImparPar() {
		numero = pedeDados("Informe um numero inteiro");
		System.out.println(verifica());
	}
	
	String verifica() {
		return numero % 2 == 0 ? "Par" : "Impar";
	}
	
	int pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		new VerificaImparPar();
	}
}
