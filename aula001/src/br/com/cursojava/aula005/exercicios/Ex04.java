package br.com.cursojava.aula005.exercicios;

import java.util.Scanner;

/*
 * Crie um programa que solicite o nome de 20 produtos e os armazene 
 * em um array. Os produtos informados não podem possuir o mesmo nome. 
 * Após a inserção dos produtos o programa deve apresentar um menu onde 
 * o usuário pode solicitar o nome de um produto e o programa de 
 * informar se o produto está contido ou não na lista de produtos digitada. 
 * O programa deve ser encerrado quando o usuário digitar sair. 
 */

public class Ex04 extends Thread {

	String[] nomeProdutos = new String[20];

	@Override
	public void run() {
		for (int i = 0; i < nomeProdutos.length; i++) {
			System.out.println("Informe abaixo o nome dos produtos a serem cadastrados e pressione enter: ");
			nomeProdutos[i] = new Scanner(System.in).next().trim();
			if (i > 0) {
				for (int j = i - 1; j >= 0; j--) {
					while(true) {
						if (nomeProdutos[i].equals(nomeProdutos[j])) {
							System.out.println("Nome de produto já cadastrado, por favor informe novamente");
							nomeProdutos[i] = new Scanner(System.in).next();
						} else {
							break;
						}
					}
				}
			}
		}
		menu();
	}

	void menu() {
		OUTER: 
		while (true) {
			System.out.println(""
					+ "1 - Verificar se o produto está na lista informando o nome dele\n"
					+ "Digite 'sair' para finalizar o programa\n"
					+ "Informe abaixo a opção desejada e pressione enter: ");
			switch (new Scanner(System.in).next().trim()) {
				case "1":
					System.out.println("Informe abaixo o nome do produto para verificar se ele "
							+ "está na lista de produtos digitada e pressione enter: ");
					String nomeInformado = new Scanner(System.in).next().trim();
					boolean encontrado = false;
					for (String produto : nomeProdutos) {
						if (nomeInformado.equals(produto)) {
							encontrado = true;	
						}
					}
					if (encontrado) {
						System.out.println("Está informado na lista");
					} else {
						System.out.println("Não está informado na lista");
					}
					break;
				case "sair":
					break OUTER;
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex04().start();
	}
}
