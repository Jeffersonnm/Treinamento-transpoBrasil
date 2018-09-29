package br.com.cursojava.aula003;

import java.util.Scanner;

public class ApresentaPalavraCaixaAltaeBaixa {
	public static void main(String[] args) {
		System.out.println("Informe uma palavra");
		String palavra = new Scanner(System.in).nextLine();
		System.out.println(palavra.toUpperCase() + ", " + palavra.toLowerCase());
	}
}
