package br.com.cursojava.aula004;

import java.util.Scanner;

public class SolicitarEescreverPalavra {
	public static void main(String[] args) {
		System.out.println("Informe a palavra");
		String palavra = new Scanner(System.in).next();
		String[] letras = palavra.split("");
		String escrita = "";
		for (int i = 0; i < letras.length; i++) {
			escrita += letras[i];
			System.out.println(escrita);
		}
	}
}
