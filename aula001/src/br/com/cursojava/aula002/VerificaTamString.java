package br.com.cursojava.aula002;

import java.util.Scanner;

public class VerificaTamString {
	
	String nomeUsuario;
	
	public VerificaTamString() {
		nomeUsuario = pedeDados("Informe o seu nome de usu�rio");
		System.out.println(nomeUsuario.length() >= 3 ? "nome de usu�rio tem ao menos 3 letras" : "nome de usu�rio inv�lido");
	}
	
	String pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).next();
	}
	
	public static void main(String[] args) {
		new VerificaTamString();
	}
}
