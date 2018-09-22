package br.com.cursojava.aula002;

import java.util.Scanner;

public class VerificaTamString {
	
	String nomeUsuario;
	
	public VerificaTamString() {
		nomeUsuario = pedeDados("Informe o seu nome de usuário");
		System.out.println(nomeUsuario.length() >= 3 ? "nome de usuário tem ao menos 3 letras" : "nome de usuário inválido");
	}
	
	String pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).next();
	}
	
	public static void main(String[] args) {
		new VerificaTamString();
	}
}
