package br.com.cursojava.aula001;

public class ArmazenarTresNotas {
	
	float nota1;
	float nota2;
	float nota3;
	float media;
	
	public ArmazenarTresNotas() {
		nota1 = 10;
		nota2 = 9;
		nota3 = 8;
		media = calcularMedia(notas(nota1, nota2, nota3));
		System.out.printf("Nota 1: %f\nNota 2: %f\nNota 3: %f\nA média das notas é igual a: %f", nota1, nota2, nota3, media);
	}
	
	private float calcularMedia(float[] notas) {
		return (notas[0]+notas[1]+notas[2])/3;
	}
	
	private float[] notas(float nota1, float nota2, float nota3) {
		float[] notas = new float[3];
		notas[0] = nota1;
		notas[1] = nota2;
		notas[2] = nota3;
		return notas;
	}
	public static void main(String[] args) {
		ArmazenarTresNotas a = new ArmazenarTresNotas();
	}
}
