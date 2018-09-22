package br.com.cursojava.aula002;



import java.util.Scanner;

public class VerificarAprovacao {
	
	double nota1;
	double nota2;
	double nota3;
	double media;
	
	public VerificarAprovacao() {
		nota1 = pedeDados("Informe nota 1");
		nota2 = pedeDados("Informe nota 2");
		nota3 = pedeDados("Informe nota 3");
		media = (nota1+nota2+nota3)/3;
		System.out.println(resultado());
	}
	
	String resultado() {
		return media > 7 ? "Aprovado" : "Reprovado"; 
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		new VerificarAprovacao();
	}

}
