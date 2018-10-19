package br.com.cursojava.aula005.exercicios;

import java.util.Scanner;

/*
 * Crie um programa que solicite  10 notas e as armazene em um 
 * array. Em seguida calcule a média das notas e apresente todas 
 * as notas que possuem valor igual ou maior que a média.
 */
public class Ex02 extends Thread {
	
	float[] notas = new float[10];
	float media = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe Nota " + (i + 1));
			notas[i] = new Scanner(System.in).nextFloat();
			media += notas[i] / notas.length;
		}
		System.out.println("Notas maiores que a média");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				System.out.println("Nota " + (i + 1) + ": " + notas[i]);
			}
		}
		System.out.println("A média é: " + media);
	}
	
	public static void main(String[] args) {
		new Ex02().start();
	}
}
