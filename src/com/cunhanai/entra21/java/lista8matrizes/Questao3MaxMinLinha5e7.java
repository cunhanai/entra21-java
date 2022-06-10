/*
 * Questao 3 Max Min Linha 5 e 7
 * @date 2022-06-07
 * @authors Ana Júlia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Questão_3: Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. 
 * Após isso indique qual é o maior e o menor valor da linha 5 e qual é o 
 * maior e o menor valor da coluna 7.
 */

package com.cunhanai.entra21.java.lista8matrizes;

import java.util.Random;

public class Questao3MaxMinLinha5e7 {

	public static void main(String[] args) {
		Random numeroAleato = new Random();
		int[][] matrizAleato = new int[10][10];
		int maxLinha5 = Integer.MIN_VALUE;
		int minLinha5 = Integer.MAX_VALUE;
		int maxLinha7 = Integer.MIN_VALUE;
		int minLinha7 = Integer.MAX_VALUE;
		int aux; // receberá o número aleatório para facilitar a verificação
		
		// GERA UMA MATRIZ COM VALORES ALEATÓRIOS
		for (int i = 0; i < matrizAleato.length; i++) {
			for (int j = 0; j < matrizAleato[i].length; j++) {
				aux = numeroAleato.nextInt(10);
				matrizAleato[i][j] = aux;
				
				// VERIFICA O MAIOR E O MENOR NÚMERO DA LINHA 5
				if (i == 5) {
					if (aux > maxLinha5) {
						maxLinha5 = aux;
					}
					else if (aux < minLinha5) {
						minLinha5 = aux;
					}
				}
				// VERIFICA O MAIOR E O MENOR NÚMERO DA LINHA 7
				else if (i == 7) {
					if (aux > maxLinha7) {
						maxLinha7 = aux;
					}
					else if (aux < minLinha7) {
						minLinha7 = aux;
					}
				}
			}
		}
		
		// IMPRIME OS VALORES DA MATRIZ
		System.out.println("Valores da matriz: ");
		for (int[] linha : matrizAleato) {
			for (int coluna : linha) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		
		// IMPRIME O MAIOR E O MENOR VALOR DAS LINHAS 5 E 7
		System.out.println();
		System.out.println("Maior valor da linha 5: " + maxLinha5);
		System.out.println("Menor valor da linha 5: " + minLinha5);
		System.out.println();
		System.out.println("Maior valor da linha 7: " + maxLinha7);
		System.out.println("Menor valor da linha 7: " + minLinha7);
	}

}
