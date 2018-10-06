package br.com.cursojava.aula004;

import java.util.Scanner;

public class CincoNotas {
	public static void main(String[] args) {
		System.out.println("Informe 5 notas");
		float[] notas = {new Scanner(System.in).nextFloat(), 
				new Scanner(System.in).nextFloat(), 
				new Scanner(System.in).nextFloat(), 
				new Scanner(System.in).nextFloat(), 
				new Scanner(System.in).nextFloat()};
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
