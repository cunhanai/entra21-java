/*
 * Questao 1 Numero Aleatorio
 * @date 2022-06-07
 * @authors Ana Júlia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Questão_1: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
 * Após isso determine o maior número da matriz e a sua posição (linha, coluna)
 */

package com.cunhanai.entra21.java.logica.lista8matrizes;

import java.util.Random;

public class Questao1NumeroAleatorio {

	public static void main(String[] args) {
		Random numeroAleato = new Random(); // inicializa a biblioteca Random
		int[][] matrizAleato = new int[4][4]; // matriz que receberá números aleatórios
		int maiorNum = Integer.MIN_VALUE; // maior valor da matriz
		int[] posicao = new int[2]; // matriz que receberá a posição do maior número, 0 = i, 1 = j
		// matrizAleato = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}
		// GERA UMA MATRIZ 4x4 DE NÚMEROS ALEATÓRIOS
		for (int i = 0; i < matrizAleato.length; i++) {
			for (int j = 0; j < matrizAleato[i].length; j++) {
				matrizAleato[i][j] = numeroAleato.nextInt(10);
				
				// VERIFICA O MAIOR NÚMERO DA MATRIZ E ATRIBUINDO SUA POSIÇÃO EM UMA MATRIZ 2X2
				if (matrizAleato[i][j] > maiorNum) {
					maiorNum = matrizAleato[i][j];
					posicao[0] = i; // POSIÇÃO 0 RECEBE A LINHA ONDE O MAIOR NÚMERO SE LOCALIZA
					posicao[1] = j; // POSIÇÃO 1 RECEBE A COLUNA ONDE O MAIOR NÚMERO SE LOCALIZA
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
		
		// IMPRIME O MAIOR NÚMERO E A SUA POSIÇÃO NA MATRIZ
		System.out.printf("%nO maior valor gerado foi %d, na linha %d e coluna %d", maiorNum, posicao[0], posicao[1]);
		
	}

}
