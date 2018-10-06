package br.com.cursojava.aula004;

import java.util.Scanner;

public class ValorComDesconto {
	public static void main(String[] args) {
		System.out.println("Informe o valor de 10 produtos para calcular um desconto sobre todos os produtos");
		float[] valorProdutos = new float[10];
		float[] valorProdutosComDesconto = new float[10];
		
		for (int i = 0; i < valorProdutos.length; i++) {
			valorProdutos[i] = new Scanner(System.in).nextFloat();
		}
		for (int i = 0; i < valorProdutos.length; i++) {
			valorProdutosComDesconto[i] = (float)(valorProdutos[i] - valorProdutos[i] * 0.1);
		}
		for (int i = 0; i < valorProdutosComDesconto.length; i++) {
			System.out.println(valorProdutosComDesconto[i]);
		}
	}
}
