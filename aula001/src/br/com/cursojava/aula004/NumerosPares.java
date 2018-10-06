package br.com.cursojava.aula004;

public class NumerosPares {
	
	public NumerosPares() {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		new NumerosPares();
	}
}
