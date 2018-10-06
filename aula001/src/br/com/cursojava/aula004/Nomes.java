package br.com.cursojava.aula004;

import java.util.Scanner;

public class Nomes {
	public static void main(String[] args) {
		String[] nomes = new String[10];
		System.out.println("Informe 10 nomes");
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = new Scanner(System.in).next();
		}
		int maiorNome = nomes[0].length();
		for (int i = 0; i < nomes.length; i++) {
			maiorNome = Integer.max(maiorNome, nomes[i].length());
		}
		System.out.println("O nome com maior quantidade de caracteres: " + nomes[maiorNome]);
	}
}
