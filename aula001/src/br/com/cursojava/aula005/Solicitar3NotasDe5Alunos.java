package br.com.cursojava.aula005;

import java.util.Scanner;

public class Solicitar3NotasDe5Alunos extends Thread {
	
	String[][] notas = new String[3][5];
	
	@Override
	public void run() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d \n", (i + 1), (j + 1));
				notas[i][j] = new Scanner(System.in).next().trim();
			}
		}
		for (int i = 0; i < notas[0].length; i++) {
			System.out.printf("Aluno %d: ", (i + 1));
			for (int j = 0; j < notas.length; j++) {
				System.out.printf("%s ", (notas[j][i]));
				if (j == notas.length - 1) {
					System.out.println("");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Solicitar3NotasDe5Alunos().start();
	}
}
