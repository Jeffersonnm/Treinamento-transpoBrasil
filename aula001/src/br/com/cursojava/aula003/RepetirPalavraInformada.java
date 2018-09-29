package br.com.cursojava.aula003;

import java.util.Scanner;

public class RepetirPalavraInformada {
	public static void main(String[] args) {
		System.out.println("Informe a palavra");
		String palavra = new Scanner(System.in).next();
		String novaPalavra = palavra;
		int i = 0;
		while (i != 4) {
			System.out.println(novaPalavra);
			novaPalavra += " " + palavra;
			i++;
		}
	}
}
