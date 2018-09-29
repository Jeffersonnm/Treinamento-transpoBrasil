package br.com.cursojava.aula002;

import java.util.Scanner;

public class VerificaAnoBissexto {
	
	int ano;
	
	public VerificaAnoBissexto() {
		ano = pedeDados("Informe o seu ano de nascimento");
		System.out.println(verificaBissexto());
	}
	
	String verificaBissexto() {
		return ano % 400 == 0 || (ano % 100 != 0 && ano % 4 == 0) ? "Foi um ano bissexto" : "Não foi um ano bissexto";
	}
	
	int pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		new VerificaAnoBissexto();
	}
}
