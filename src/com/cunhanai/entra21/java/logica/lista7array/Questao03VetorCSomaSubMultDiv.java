package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao03VetorCSomaSubMultDiv {
	
	/*
	 * Questão 3 - Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
	 * um vetor C, onde cada elemento de C é:
	 * 
	 * 		• a soma dos respectivos elementos em A e B
	 * 		  C[i] = A[i] + B[i].
	 * 		• a subtração dos respectivos elementos em A e B
	 * 		  C[i] = A[i] – B[i].
	 * 		• a multiplicação dos respectivos elementos em A e B
	 * 		  C[i] = A[i] * B[i].
	 * 		• a divisão dos respectivos elementos em A e B
	 * 		  C[i] = A[i] / float(B[i])
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		float[] vetorC = new float[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor do Vetor A na posição %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.printf("Valor do Vetor B na posição %d: ", i);
			vetorB[i] = sc.nextInt();
		}
		
		System.out.print("\n\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ((i == vetorA.length-1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + ((i == vetorB.length-1)? "." : ", "));
		}
		
		System.out.print("\n\nValores do vetor C (soma): ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.print(vetorC[i] + ((i == vetorC.length-1)? "." : ", "));
		}
		
		System.out.print("\n\nValores do vetor C (sub): ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.print(vetorC[i] + ((i == vetorC.length-1)? "." : ", "));
		}
		
		System.out.print("\n\nValores do vetor C (mult): ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.print(vetorC[i] + ((i == vetorC.length-1)? "." : ", "));
		}
		
		System.out.print("\n\nValores do vetor C (div): ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / (float)(vetorB[i]);
			System.out.print(vetorC[i] + ((i == vetorC.length-1)? "." : ", "));
		}
		
		sc.close();
	}

}
