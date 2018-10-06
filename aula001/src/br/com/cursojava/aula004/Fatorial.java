package br.com.cursojava.aula004;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println("Informe o numero inteiro entre 1 e 20 para fazer o fatorial");
		int num;
		do {
			num = new Scanner(System.in).nextInt();
			if (!(num > 0 && num < 21)) {
				System.out.println("Informe um numero entre 1 e 20");
			}
		} while (!(num > 0 && num < 21));
		double fatorial  = 1;
		for (int i = num; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println(fatorial);
	}
}
