package br.com.cursojava.aula003;

public class CemNumerosImpares {
	public static void main(String[] args) {
		int i = 0;
		while (i != 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
