package br.com.cursojava.aula005.exercicios;

import java.util.Scanner;

/*
 * Crie um programa que leia o nome e as notas de 10 alunos, 
 * em seguida apresente o nome e a nota do aluno com a maior 
 * nota e do aluno com a menor nota. Os nomes e as notas devem 
 * ser armazenados em um array.
 */

public class Ex01 extends Thread {

	String[][] alunos = new String[2][10];
	float maiorNota;
	float menorNota;
	int posMaiorNota;
	int posMenorNota;
	
	@Override
	public void run() {
		for (int i = 0; i < alunos[0].length; i++) {
			System.out.println("Informe o nome do aluno(a) " + (i + 1));
			alunos[0][i] = new Scanner(System.in).next().trim();
			System.out.println("Informe a nota do aluno(a) " + (i + 1));
			alunos[1][i] = new Scanner(System.in).next().trim();
			if (i > 0) {
				if (maiorNota < Float.parseFloat(alunos[1][i])) {
					maiorNota = Float.parseFloat(alunos[1][i]);
					posMaiorNota = i;
				}
				if (menorNota > Float.parseFloat(alunos[1][i])) {
					menorNota = Float.parseFloat(alunos[1][i]);
					posMenorNota = i;
				}
			} else if (i == 0) {
				maiorNota = Float.parseFloat(alunos[1][i]);
				menorNota = Float.parseFloat(alunos[1][i]);
				posMaiorNota = i;
				posMenorNota = i;
			}
		}
		System.out.println("Aluno(a) com a maior nota: " + alunos[0][posMaiorNota] + " Nota: " + alunos[1][posMaiorNota]);
		System.out.println("Aluno(a) com a menor nota: " + alunos[0][posMenorNota] + " Nota: " + alunos[1][posMenorNota]);
	}

	public static void main(String[] args) {
		new Ex01().start();
	}
}
