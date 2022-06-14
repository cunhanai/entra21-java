/*
 * Questao 2 Num Par Impar
 * @date 2022-06-07
 * @authors Ana J�lia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Quest�o_2: Capture do teclado valores para preenchimento de uma matriz M 3x3. 
 * Ap�s a captura imprima a matriz criada e encontre a quantidade de n�meros 
 * pares, a quantidade de n�meros �mpares.
 */

package com.cunhanai.entra21.java.logica.lista8matrizes;

import java.util.Scanner;

public class Questao2NumParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // inicializa a biblioteca Scanner
		int[][] matrizM = new int[3][3]; // matriz para preenchimento via teclado
		int par = 0, impar = 0; // conta a quantidade de n�meros pares e �mpares
		
		// CRIA UMA MATRIZ 3x3 COM VALORES INFORMADOS VIA TECLADO 
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.printf("Valor da linha %d e coluna %d: ", i, j);
				matrizM[i][j] = sc.nextInt();
				
				// VERIFICA SE O N�MERO � PAR OU �MPAR E CONTA-OS
				if (matrizM[i][j] % 2 == 0) {
					par++;
				}
				else {
					impar++;
				}
			}
		}
		
		// IMPRIME OS VALORES DA MATRIZ
		for (int[] linha : matrizM) {
			for (int coluna : linha) {
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		
		// IMPRIME A QUANTIDADE DE N�MEROS PARES E �MPARES
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros impares: " + impar);
		
		sc.close();
	}

}
