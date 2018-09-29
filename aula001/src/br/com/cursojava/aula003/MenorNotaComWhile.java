package br.com.cursojava.aula003;

import java.util.Scanner;

public class MenorNotaComWhile {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Informe a nota 1");
		double menorNota = new Scanner(System.in).nextDouble();
		while(i != 9) {
			i++;
			System.out.println("Informe a nota " + (i + 1));
			menorNota = Math.min(menorNota, new Scanner(System.in).nextDouble());
		}
		System.out.println(menorNota);
	}
}
