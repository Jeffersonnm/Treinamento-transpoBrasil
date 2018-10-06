package br.com.cursojava.aula004;

import java.util.Scanner;

public class Menu {

	public Menu() {
		OUTER:
		while (true) {
			System.out.println("A - abrir arquivo\n" + "B - Procurar arquivo\n" + "C - Download arquivo\n"
					+ "D - Upload de arquivo\n" + "S - Sair\n" + "Digite a opção desejada abaixo e pressione enter:");
			switch (new Scanner(System.in).next()) {
			case "S":
				System.out.println("Finalizando...");
				break OUTER;
			case "A":
				break;
			case "B":
				break;
			case "C":
				break;
			case "D":
				break;
			default:
				System.out.println("Opção não encontrada, digite novamente");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Menu();
	}
}
