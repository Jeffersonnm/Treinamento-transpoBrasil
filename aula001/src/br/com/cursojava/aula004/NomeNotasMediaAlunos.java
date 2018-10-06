package br.com.cursojava.aula004;

import java.util.Scanner;

public class NomeNotasMediaAlunos {
	public static void main(String[] args) {
		String[] alunos = new String[10];
		float[] notas = new float[2];
		float[] media = new float[alunos.length];
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("informe o nome dos alunos");
			alunos[i] = new Scanner(System.in).next();
			for (int j = 0; j < notas.length; j++) {
				System.out.println("informe a nota "+ (j + 1) +" do aluno" + i);
				notas[j] = new Scanner(System.in).nextFloat();
				media[i] += notas[j] / notas.length;
			}
		}
		for (int i = 0; i < media.length; i++) {
			System.out.println("aluno: " + alunos[i] + " teve media: " + media[i]);
		}
	}
}
