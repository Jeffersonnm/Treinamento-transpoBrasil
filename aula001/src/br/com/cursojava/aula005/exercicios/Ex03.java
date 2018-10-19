package br.com.cursojava.aula005.exercicios;

import java.util.Scanner;

/*
 * Crie um programa que solicite 10 notas e as armazene em um array. 
 * Em seguida crie dois novos arrays onde o primeiro deve conter as 
 * notas menores que a média e o segundo deve conter as notas maiores 
 * ou iguais a média. Os Arrays auxiliares(que armazena as notas divididas) 
 * devem possuir um tamanho exatamente igual a quantidade a ser armazenada 
 * em cada um. (Se tiver 5 notas maiores ou iguais a média então os array 
 * auxiliares deverão ser respectivamente de tamanho 3 e 7).
 */
public class Ex03 extends Thread {
	
	float[] notas = new float[10];
	float[] notasMaiores;
	float[] notasMenores;
	int contMaiores = 0;
	int contMenores = 0;
	
	float media = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe nota " + (i + 1));
			notas[i] = new Scanner(System.in).nextFloat();
			media += notas[i] / notas.length;
		}
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				contMaiores++;
			} else {
				contMenores++;
			}
		}
		notasMaiores = new float[contMaiores];
		notasMenores = new float[contMenores];
		contMaiores = 0;
		contMenores = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				notasMaiores[contMaiores] = notas[i];
				contMaiores++;
			} else {
				notasMenores[contMenores] = notas[i];
				contMenores++;
			}
		}
		System.out.println("Média igual a: " + media);
		System.out.println("Notas maiores que a média");
		for (int i = 0; i < notasMaiores.length; i++) {
			System.out.println(notasMaiores[i]);
		}
		System.out.println("Notas menores que a média");
		for (int i = 0; i < notasMenores.length; i++) {
			System.out.println(notasMenores[i]);
		}
	}
	
	public static void main(String[] args) {
		new Ex03().start();
	}
}
