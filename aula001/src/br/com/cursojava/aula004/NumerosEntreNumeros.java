package br.com.cursojava.aula004;

import java.util.Scanner;

public class NumerosEntreNumeros {
	
	int n1;
	int n2;
	
	public NumerosEntreNumeros() {
		System.out.println("Informe o primeiro numero");
		n1 = new Scanner(System.in).nextInt();
		System.out.println("Informe o segundo numero, ele deve ser maior que o primeiro");
		do {
			n2 = new Scanner(System.in).nextInt();
			if (!(n2 > n1)) {
				System.out.println("Informe o segundo numero maior que o primeiro");
			}
		} while (!(n2 > n1));
		String numeros = "";
		for (int i = n1 + 1; i < n2; i++) {
			numeros += i + " ";
		}
		System.out.println(numeros);
	}
	
	public static void main(String[] args) {
		new NumerosEntreNumeros();
	}
}
