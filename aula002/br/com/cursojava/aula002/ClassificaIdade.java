package br.com.cursojava.aula002;

import java.util.Scanner;

public class ClassificaIdade {

	int idade;
	
	public ClassificaIdade() {
		idade = pedeDados("Informe a sua idade");
		System.out.println(classifica());
	}
	
	String classifica() {
		return idade >= 18 ? "Categoria Adulto" : idade > 14 ? "Categoria Juvenil" : idade > 12 ? "Categoria Infanto Juvenil" : idade > 9 ? "Categoria Infantil" : "Categoria Mirim"; 
	}
	
	int pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		new ClassificaIdade();
	}
}
