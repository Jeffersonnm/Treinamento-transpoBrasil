package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaComConceito {
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double media;
	String conceito;
	
	public MediaComConceito() {
		nota1 = pedeDados("Informe nota 1");
		nota2 = pedeDados("Informe nota 2");
		nota3 = pedeDados("Informe nota 3");
		nota4 = pedeDados("Informe nota 4");
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		conceito = conceito();
		System.out.println(conceito);
	}
	
	String conceito() {
		return media > 9 ? "A" : media > 8 ? "B" : media > 6 ? "C" : media > 5 ? "D" : "Insuficiente";
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		new MediaComConceito();
	}

}
