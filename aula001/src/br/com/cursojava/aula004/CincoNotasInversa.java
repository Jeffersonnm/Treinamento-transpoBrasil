package br.com.cursojava.aula004;

import java.util.Scanner;

public class CincoNotasInversa {
	public static void main(String[] args) {
		System.out.println("Informe 5 nomes");
		String[] nomes = {new Scanner(System.in).next(), 
				new Scanner(System.in).next(), 
				new Scanner(System.in).next(), 
				new Scanner(System.in).next(), 
				new Scanner(System.in).next()};
		for (int i = nomes.length - 1; i >= 0; i--) {
			System.out.println(nomes[i]);
		}
	}
}
