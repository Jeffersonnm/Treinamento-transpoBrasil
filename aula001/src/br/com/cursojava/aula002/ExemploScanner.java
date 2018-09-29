package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploScanner {
	
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Informe seu nome");
		String nome = teclado.next();
		System.out.printf("O nome informado foi %s", nome);
		teclado.close();
	}
}
