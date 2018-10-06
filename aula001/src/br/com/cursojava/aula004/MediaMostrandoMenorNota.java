package br.com.cursojava.aula004;

import java.util.Scanner;

public class MediaMostrandoMenorNota {
	public static void main(String[] args) {
		System.out.println("Informe 10 notas para calcular a media");
		float[] notas = new float[10];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = new Scanner(System.in).nextFloat();
		}
		float media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media/notas.length;
		System.out.println("media é " + media);
		System.out.println("notas maior que a media: ");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < media) {
				System.out.println(notas[i]);
			}
		}
	}
}
