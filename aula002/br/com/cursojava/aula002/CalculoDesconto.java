package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoDesconto {
	
	double desconto;
	double valor;
	double valorDesconto;
	double valorProduto;
	
	public CalculoDesconto() {
		desconto = pedeDados("Informe o percentual de desconto");
		valor = pedeDados("Informe o valor do produto");
		valorDesconto = valor*desconto/100;
		valorProduto = valor-valorDesconto;
		System.out.printf("O valor do produto é: %f \n"
				+ "O percentual de desconto é: %f \n"
				+ "O valor de desconto é igual a: %f \n"
				+ "O valor do produto com desconto é igual a: %f", 
				valor, desconto, valorDesconto, valorProduto);
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		new CalculoDesconto();
	}
}
