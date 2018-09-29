package br.com.cursojava.aula003;

import java.util.Scanner;

public class Calcular20Notas {
	public static void main(String[] args) {
		int somaNotas = 0;
		int i = 0;
		while(i != 20) {
			System.out.println("Informe nota " + (i+1));
			somaNotas += new Scanner(System.in).nextInt();
			i++;
		}
		System.out.println((float)somaNotas/i);
	}
}
