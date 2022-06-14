package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao05MultiplosDeCinco {

	/*
	 * Questão 5 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que determine a soma dos elementos armazenados neste vetor que
	 * são múltiplos de 5.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorA.length; j++) {
				if (i == j) {
				}
				else {
					soma = vetorA[i] + vetorA[j];
					
					if (soma % 5 == 0 && j > i) {
						System.out.printf("%nA soma de %d com %d (%d) é multipla de 5.", vetorA[i], vetorA[j], soma);
					}
				}
			}
		}
		sc.close();
	}

}
