package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao13VetorBInversoDeA {

	/*
	 * Questão 13 - Ler um vetor A com 10 elementos e construir um vetor B de mesmo
	 * tipo e tamanho e com os mesmos elementos de A, sendo que estes deverão estar
	 * invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o 
	 * segundo elemento de A passa a ser o penúltimode B e assim por diante.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
			
			vetorB[vetorB.length-1-i] = vetorA[i];
		}
		
		System.out.print("\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + (i == (vetorA.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + (i == (vetorB.length - 1)? "." : ", "));
		}
		
		sc.close();
	}

}
