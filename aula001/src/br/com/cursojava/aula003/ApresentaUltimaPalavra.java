package br.com.cursojava.aula003;

import java.util.Scanner;

public class ApresentaUltimaPalavra {
	public static void main(String[] args) {
		System.out.println("Informe uma frase");
		
		String frase = new Scanner(System.in).nextLine();
		String[] palavras = frase.trim().split(" ");
		System.out.println(palavras[palavras.length-1]);
		System.out.println(frase.substring(1+frase.lastIndexOf(" ")));
	}
}
