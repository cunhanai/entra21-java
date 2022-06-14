package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao16VetorCompactado {

	/*
	 * Questao 16 - Criar um programa que leia um vetor A[20]. A seguir, compacte este vetor A, 
	 * retirando todos os valores nulos ou negativos e mostre então o vetor compactado.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetorA = new double[20];
		double[] vetorACompacto;
		int countNulNeg = 0, j = 0;
		
		// atribuir valores ao vetor A
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextDouble();
			
			if (vetorA[i] <= 0) {
				++countNulNeg;
			}
		}
		
		// compactar o vetor A em outro vetor
		vetorACompacto = new double[vetorA.length - countNulNeg];
		for (int i = 0; i < vetorACompacto.length; i++) {
			loop:
			while (j < vetorA.length) {
				if (vetorA[j] > 0) {
					vetorACompacto[i] = vetorA[j];
					j++;
					break loop;
				}
				else {
					j++;
				}
			}
		}
		
		// imprime o vetor compacto
		for (int i = 0; i < vetorACompacto.length; i++) {
			System.out.print(vetorACompacto[i] + ((vetorACompacto.length - 1 == i)? "." : ", "));
		}
		
		sc.close();
	}

}
