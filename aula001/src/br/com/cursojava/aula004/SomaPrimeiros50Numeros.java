package br.com.cursojava.aula004;

public class SomaPrimeiros50Numeros {
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 0; i <= 50; i++) {
			soma += i;
		}
		System.out.println(soma);
	}
}
