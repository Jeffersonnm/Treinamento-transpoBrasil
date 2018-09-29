package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalculoImposto {
	
	double salario;
	double imposto;
	double impostoRenda;
	double impostoRendaPercentual;
	
	public CalculoImposto() {
		salario = pedeDados("Informe seu salario");
		imposto = salario * 0.11;
		impostoRendaPercentual = calculaImposto();
		impostoRenda = salario * impostoRendaPercentual;
		System.out.printf("Seu salario é: %.2f\n"
				+ "Desconto de imposto inss é: %.2f\n"
				+ "Desconto de imposto de renda é: %.2f\n"
				+ "Percentual de imposto de renda é: %.2f\n"
				+ "Seu salario liquido é: %.2f",
				salario, imposto, impostoRenda, impostoRendaPercentual*100, salario - impostoRenda - imposto);
	}
	
	double pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextDouble();
	}
	
	double calculaImposto() {
		return salario > 3600 ? 0.32 : salario > 2400 ? 0.24 : salario > 1800 ? 0.075 : 0;
	}
	public static void main(String[] args) {
		new CalculoImposto();
	}
}
