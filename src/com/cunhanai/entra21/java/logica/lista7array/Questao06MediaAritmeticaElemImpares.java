package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao06MediaAritmeticaElemImpares {

	/*
	 * Quest�o 6 - Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que defina e escreva a m�dia aritm�tica simples dos elementos
	 * �mpares armazenados neste vetor.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0, impar = 0;
		float media;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d: ", i);
			vetorA[i] = sc.nextInt();
			
			if (vetorA[i] % 2 == 1) {
				soma += vetorA[i];
				++impar;
			}
		}
		
		media = soma / impar;
		
		System.out.println("M�dia aritm�tica simples dos elementos �mpares: " + media);
		
		sc.close();
	}

}
