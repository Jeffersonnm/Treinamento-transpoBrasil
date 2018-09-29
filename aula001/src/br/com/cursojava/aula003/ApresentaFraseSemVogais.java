package br.com.cursojava.aula003;

import java.util.Scanner;

public class ApresentaFraseSemVogais {
	public static void main(String[] args) {
		System.out.println("Informe a frase");
		System.out.println(new Scanner(System.in).next().trim().replaceAll("[aeiouAEIOUáéíóúÁÉÍÓÚÀÈÌÒàèìòùãõÃÕâêîôûÂÊÎÔÛ]", ""));
	}
}
