package br.com.cursojava.aula005;

public class OperacoesMatriz extends Thread {

	int[][] matriz = {
			{10, 9, 8, 7}, 
			{6, 5, 4, 3}, 
			{2, 1, 2, 3}, 
			{4, 5, 6, 7}};
	
	int soma = 0;
	int[] diagonalPrincipal = new int[matriz.length];
	int[] diagonalSecundaria = new int[matriz.length];
	int[][] novaMatrizDiagonalPrincipal = new int[matriz.length][matriz.length];
	int[][] novaMatrizMultiplicada = new int[matriz.length][matriz.length];
	
	@Override
	public void run() {
		System.out.println("matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
				if (i == j) {
					diagonalPrincipal[i] = matriz[i][j];
					//System.out.println("diagonal principal: " + diagonalPrincipal[i]);
				}
				if (j == ((matriz[i].length - 1) - i)) {
					diagonalSecundaria[i] = matriz[i][j];
					//System.out.println("diagonal secundaria: " + diagonalSecundaria[i]);
				}
				System.out.print(matriz[i][j] + "\t");
				if (j == matriz[i].length - 1) {
					System.out.println();
				}
			}
		}
		System.out.println("e)");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				novaMatrizDiagonalPrincipal[i][j] = matriz[i][j] * diagonalPrincipal[i];
				//System.out.print(novaMatrizDiagonalPrincipal[i][j] + "\t");
				if (j == matriz[i].length - 1) {
					//System.out.println();
				}
				if ((j - i) > 0) {
					novaMatrizMultiplicada[i][j] = matriz[i][j] * diagonalSecundaria[i];
				} else if ((j - i) < 0){
					novaMatrizMultiplicada[i][j] = matriz[i][j] * diagonalPrincipal[i];
				}
				if (i == j) {
					novaMatrizMultiplicada[i][j] = (int) Math.pow(Double.parseDouble(Integer.toString(diagonalPrincipal[i])), 3);
				}
				System.out.print(novaMatrizMultiplicada[i][j] + "\t");
				if (j == matriz[i].length - 1) {
					System.out.println();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new OperacoesMatriz().start();
	}
}
