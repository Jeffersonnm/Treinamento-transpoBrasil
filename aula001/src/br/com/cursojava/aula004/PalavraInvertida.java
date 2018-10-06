package br.com.cursojava.aula004;

import java.util.Scanner;

public class PalavraInvertida {
	
	public PalavraInvertida() {
		System.out.println("Informe a palavra que será invertida abaixo e pressione enter");
		String palavra = new Scanner(System.in).next();
		String[] letras = new String[palavra.length()];
		String inverso = "";
		letras = palavra.split("");
		int i = palavra.length() - 1;
		do {
			inverso += letras[i];
		} while (i-- > 0);
		System.out.printf("A palavra invertida é: %s", inverso);
	}
	
	public static void main(String[] args) {
		new PalavraInvertida();
	}
}
