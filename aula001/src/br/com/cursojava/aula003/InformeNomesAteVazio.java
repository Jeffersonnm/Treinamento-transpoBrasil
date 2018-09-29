package br.com.cursojava.aula003;

import java.util.Scanner;

public class InformeNomesAteVazio {
	public static void main(String[] args) {
		String nome = "a";
		while (!nome.trim().isEmpty()) {
			nome = new Scanner(System.in).nextLine();
			System.out.println("Quantidade de caracteres do nome " + nome.trim().length());
		}
	}
}
