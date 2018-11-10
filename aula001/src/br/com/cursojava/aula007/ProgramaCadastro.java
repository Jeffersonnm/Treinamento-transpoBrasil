package br.com.cursojava.aula007;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaCadastro {

	ArrayList<Produto> listaProdutos = new ArrayList<>();
	int resp = 1;
	
	public ProgramaCadastro() {
		while (resp != 0) {
			System.out.println("1 - Cadastrar produto\n" + "2 - Listar Produtos\n" + "3 - Remove Produtos\n" + "0 - Sair");
			resp = new Scanner(System.in).nextInt();
			menu(resp);
		}
	}

	void menu(int resp) {
		switch (resp) {
		case 1:
			System.out.println(
					"Cadastrar Produto: \n" + "Informe o nome do produto, a descricao e o preco respectivamente\n"
							+ "Pressione enter para informação: ");
			listaProdutos.add(new Produto(new Scanner(System.in).next(), new Scanner(System.in).next(),
					new Scanner(System.in).nextFloat()));
			break;
		case 2:
			for (int i = 0; i < listaProdutos.size(); i++) {
				System.out.println(listaProdutos.get(i).nome + "\t" + listaProdutos.get(i).descricao + "\t" + listaProdutos.get(i).preco);
			}
			break;
		case 3:
			System.out.println("Informe o nome e o preço do produto para removê-lo \n"
					+ "Informe respectivamente e pressione enter entre as informações");
			for (int i = 0; i < listaProdutos.size(); i++) {
				if (listaProdutos.get(i).nome.equals(new Scanner(System.in).next().trim())
						&& listaProdutos.get(i).preco == new Scanner(System.in).nextFloat()) {
					listaProdutos.remove(listaProdutos.get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		new ProgramaCadastro();
	}
}

class Produto {
	String nome;
	String descricao;
	float preco;

	public Produto(String nome, String descricao, float preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
}