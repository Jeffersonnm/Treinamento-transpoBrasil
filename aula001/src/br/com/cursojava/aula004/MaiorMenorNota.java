package br.com.cursojava.aula004;

import java.util.Scanner;

public class MaiorMenorNota {
	public static void main(String[] args) {
		float[] notas = new float[10];
		System.out.println("Informe 10 notas");
		float max = 0;
		float min = 0;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Scanner(System.in).nextFloat();
			max = notas[0];
			min = notas[0];
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("notas: %f \n", notas[i]);
			max = Float.max(max, notas[i]);
			min = Float.min(min, notas[i]);
		}
		System.out.printf("maior nota: %f \n" + "menor nota: %f \n", max, min);
	}
}
