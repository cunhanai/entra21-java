package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class ExemploVerorAVetorB {

	/*
	 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
	 * tipo e tamanho com os mesmos elemetos do vetor A, ou seja B[i] = A[i]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[6];
		// int[] vetorB = new int[vetorA.length];
		int[] vetorB = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
		// vetorB[i] = vetorA[i];
			
		}
		vetorB = vetorA;
		
		System.out.print("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		sc.close();
	}

}
