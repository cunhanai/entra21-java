package lista7arrays;

import java.util.Scanner;

public class Questao04ElementosPares {

	/*
	 * Questão 4 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que defina e escreva a quantidade de elementos armazenados neste
	 * vetor que são pares.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int par = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				++par;
			}
		}
		
		System.out.printf("%n%s: %d", "Quantidade de elementos pares", par);
		
		sc.close();
	}

}
