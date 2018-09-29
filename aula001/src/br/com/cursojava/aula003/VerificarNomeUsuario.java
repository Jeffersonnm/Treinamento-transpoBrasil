package br.com.cursojava.aula003;

import java.util.Scanner;

public class VerificarNomeUsuario {
	
	public static void main(String[] args) {
		System.out.println("Informe o seu nome abaixo e pressione enter");
		String nome = new Scanner(System.in).next().trim();
		System.out.printf(nome.length() < 3 ? "Nome inválido" : ("Bem vindo " + "%s"), nome);
	}
}
