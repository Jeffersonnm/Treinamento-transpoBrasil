package br.com.cursojava.aula002;

import java.util.Scanner;

public class MenuCaixaEletronico {

	int opcao;
	
	public MenuCaixaEletronico() {
		opcao = pedeDados("1 - Depositar\n"
				+ "2 - Sacar\n"
				+ "3 - Verificar Saldo\n"
				+ "Informe a op��o desejada abaixo e pressione enter:");
		System.out.println(mostraMensagem());
	}
	
	String mostraMensagem() {
		return opcao == 1 ? "codigo: 1 mensagem: Voc� Escolheu a op��o Depositar" : opcao == 2 ? "codigo: 2 mensagem: Voc� Escolheu a op��o Sacar" : opcao == 3 ? "codigo: 3 mensagem: Voc� Escolheu a op��o Verificar Saldo" : ""; 
	}
	
	int pedeDados(String mensag) {
		System.out.println(mensag);
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		new MenuCaixaEletronico();
	}
}
