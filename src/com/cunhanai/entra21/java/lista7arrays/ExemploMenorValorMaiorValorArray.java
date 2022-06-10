package lista7arrays;

import java.util.Scanner;

public class ExemploMenorValorMaiorValorArray {

	/*
	 * Criar dois vetores inteiros com tamanho 10, imprimir o menor valor e o
	 * maior valor e fazer a soma no final.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int maiorValorA = Integer.MIN_VALUE;
		int menorValorA = Integer.MAX_VALUE;
		int maiorValorB = Integer.MIN_VALUE;
		int menorValorB = Integer.MAX_VALUE;
		int menorValor, maiorValor, somaA = 0, somaB = 0, somaVetores, somaMaiorMenor;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d do vetor A: ", i);
			vetorA[i] = sc.nextInt();
			somaA += vetorA[i];
			
			if (vetorA[i] > maiorValorA) {
				maiorValorA = vetorA[i];
			}
			
			if (vetorA[i] < menorValorA) {
				menorValorA = vetorA[i];
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Valor da posição %d do vetor B: ", i);
			vetorB[i] = sc.nextInt();
			somaB += vetorB[i];
			
			if (vetorB[i] > maiorValorB) {
				maiorValorB = vetorB[i];
			}
			
			if (vetorB[i] < menorValorB) {
				menorValorB = vetorB[i];
			}
		}
		
		if (maiorValorA > maiorValorB) {
			maiorValor = maiorValorA;
		}
		else {
			maiorValor = maiorValorB;
		}
		
		if (menorValorA < menorValorB) {
			menorValor = menorValorA;
		}
		else {
			menorValor = menorValorB;
		}
		
		somaVetores = somaA + somaB;
		somaMaiorMenor = maiorValor + menorValor;
		
		System.out.print("\n\nValores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			
			if (vetorA[i] == maiorValorA && vetorA[i] == maiorValor) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorA[i], "-- este é o maior valor de todos os vetores e o maior de A");
			}
			else if (vetorA[i] == maiorValorA) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorA[i], "-- este é o maior valor do vetor A");
			}
			else if (vetorA[i] == menorValorA && vetorA[i] == menorValor) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorA[i], "-- este é o menor valor de todos os vetores e o menor de A");
			}
			else if (vetorA[i] == menorValorA) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorA[i], "-- este é o menor valor do vetor A");
			}
			else {
				System.out.printf("%n%s %d: %d", "Posicão", i, vetorA[i]);
			}
		}
		
		System.out.print("\n\nValores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			
			if (vetorB[i] == maiorValorB && vetorB[i] == maiorValor) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorB[i], "-- este é o maior valor de todos os vetores e o maior de B");
			}
			else if (vetorB[i] == maiorValorB) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorB[i], "-- este é o maior valor do vetor B");
			}
			else if (vetorB[i] == menorValorB && vetorB[i] == menorValor) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorB[i], "-- este é o menor valor de todos os vetores e o menor de B");
			}
			else if (vetorB[i] == menorValorB) {
				System.out.printf("%n%s %d: %d %s", "Posicão", i, vetorB[i], "-- este é o menor valor do vetor B");
			}
			else {
				System.out.printf("%n%s %d: %d", "Posicão", i, vetorB[i]);
			}
		}
		
		if (somaA > somaB) {
			System.out.printf("%n%n%s: %d", "Vetor A é maior que o Vetor B. Soma de A", somaA);
		}
		if (somaB > somaA) {
			System.out.printf("%n%n%s: %d", "Vetor B é maior que o Vetor A. Soma de B", somaB);
		}
		else {
			System.out.print("\n\nOs dois vetores tem o mesmo tamanho.");
		}
		
		System.out.printf("%n%s: %d", "Soma do maior com o menor valor", somaMaiorMenor);
		System.out.printf("%n%s: %d", "Soma dos dois vetores", somaVetores);
		
		sc.close();
	}
}
