package lista7arrays;

import java.util.Scanner;

public class Questao15 {
	
	/*
	 * Questao 15 – Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	 * imprima cada elemento do vetor A e a relação de todos os divisores do
	 * respectivo elemento.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("%n%s %d: ", "Divisores de", vetorA[i]);
			for (int j = 1; j < vetorA[i]+1; j++) {
				if (vetorA[i] % j == 0) {
					System.out.print(j + ((vetorA[i] == j) ? "." : ", "));
				}
			}
		}
		
		sc.close();
	}

}
