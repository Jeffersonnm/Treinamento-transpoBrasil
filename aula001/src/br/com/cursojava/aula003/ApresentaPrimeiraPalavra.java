package br.com.cursojava.aula003;

import java.util.Scanner;

public class ApresentaPrimeiraPalavra {
	public static void main(String[] args) {
		System.out.println("Informe uma frase");
		
		String palavra = new Scanner(System.in).next();
		System.out.println(palavra);
	}
}
