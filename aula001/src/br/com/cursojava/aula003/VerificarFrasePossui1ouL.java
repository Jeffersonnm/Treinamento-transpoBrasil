package br.com.cursojava.aula003;

import java.util.Scanner;

public class VerificarFrasePossui1ouL {
	public static void main(String[] args) {
		System.out.println("Informe uma frase");
		String frase = new Scanner(System.in).nextLine();
		if (frase.contains("1") || frase.contains("L")) {
			System.out.println("Possui 1 ou L");
		} else {
			System.out.println("Não possui 1 ou L");
		}
	}
}
