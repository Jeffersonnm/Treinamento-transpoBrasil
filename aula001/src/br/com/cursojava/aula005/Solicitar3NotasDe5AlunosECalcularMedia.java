package br.com.cursojava.aula005;

import java.util.Scanner;

public class Solicitar3NotasDe5AlunosECalcularMedia extends Thread {
	
	String[][] notas = new String[3][5];
	float[] media = new float[notas[0].length];
	
	@Override
	public void run() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d \n", (i + 1), (j + 1));
				notas[i][j] = new Scanner(System.in).next().trim();
				media[j] += Float.parseFloat(notas[i][j]) / notas.length;
			}
		}
		for (int i = 0; i < media.length; i++) {
			System.out.println("média aluno "+ (i + 1) + ": " + media[i]);
		}
	}
	
	public static void main(String[] args) {
		new Solicitar3NotasDe5AlunosECalcularMedia().start();
	}
}
