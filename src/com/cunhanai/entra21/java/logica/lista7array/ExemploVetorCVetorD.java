package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class ExemploVetorCVetorD {

	/*
	 * Criar um vvetor C com 8 elementos. Construir um vetor D de mesmo tipo
	 * e tamanho e com os elementos do vetor C multiplicados por 2, ou seja:
	 * D[i] = C[i] * 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorC = new int[8];
		int [] vetorD = new int[vetorC.length];
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorC[i] = sc.nextInt();
			vetorD[i] = vetorC[i] * 2;
		}
		
		System.out.print("Vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		System.out.print("\nVetor D: ");
		for (int i = 0; i < vetorD.length; i++) {
			System.out.print(vetorD[i] + " ");
		}
		sc.close();
	}

}
