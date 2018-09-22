package br.com.cursojava.aula002;

import java.util.Scanner;

public class ValidacaoCnh {
	
	int idade;
	
	public ValidacaoCnh() {
		idade = pedeDados("Informe a sua idade");
		System.out.println(validacao());
	}
	
	int pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextInt();
	}
	
	String validacao() {
		return idade > 18 ? "Pode fazer CNH" : "Não pode fazer CNH";
	}
	
	public static void main(String[] args) {
		new ValidacaoCnh();
	}
}
