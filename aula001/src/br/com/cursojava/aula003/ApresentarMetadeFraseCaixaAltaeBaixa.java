package br.com.cursojava.aula003;

import java.util.Scanner;

public class ApresentarMetadeFraseCaixaAltaeBaixa {
	public static void main(String[] args) {
		System.out.println("Informe a frase");
		String frase = new Scanner(System.in).nextLine();
		String[] palavras = frase.split(" ");
		frase = "";
		for (int i = 0; i < palavras.length; i++) {
			if (i < palavras.length/2) {
				palavras[i] = palavras[i].toLowerCase();
			} else {
				palavras[i] = palavras[i].toUpperCase();
			}
			frase += palavras[i] + " ";
		}
		System.out.println(frase);
		
	}
}
