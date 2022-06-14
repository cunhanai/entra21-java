package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao07PercentParesImpares {

	/*
	 * Quest�o 7 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
	 * que defina o percentual de elementos pares e �mpares,
	 * respectivamente, armazenados neste vetor.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int par = 0, impar = 0;
		double percentPar, percentImpar;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d: ", i);
			vetorA[i] = sc.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				++par;
			}
			else {
				++impar;
			}
		}
		
		percentPar = (par * 100) / vetorA.length;
		percentImpar = (impar * 100) / vetorA.length;
		
		System.out.println("\nPercentual de valores pares: " + percentPar + "%");
		System.out.println("Percentual de valores �mpares: " + percentImpar + "%");
		
		sc.close();
	}

}
