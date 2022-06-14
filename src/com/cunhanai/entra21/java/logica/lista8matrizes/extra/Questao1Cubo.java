/*
 * Questao 1 Cubo
 * @date 2022-06-10
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_1: Soma cubo. Gere duas matrizes cuboA e cuboB com Tamanhos [10][3][5].
 * Atribua UM valor inteiro qualquer nas duas matrizes. Gere uma terceira matriz 
 * cuboC do mesmo tamanho que cuboA e atribua os valores da soma de cuboA + cuboB.
 */

package com.cunhanai.entra21.java.logica.lista8matrizes.extra;

import java.util.Random;

public class Questao1Cubo {

	public static void main(String[] args) {
		Random aleato = new Random();
		int tamI = 10, tamJ = 3, tamK = 5; // tamanhos i, j e k das matrizes
		int[][][] cuboA = new int[tamI][tamJ][tamK]; // gera uma matriz 10x3x5
		int[][][] cuboB = new int[tamI][tamJ][tamK]; // gera uma segunda matriz 10x3x5
		int[][][] cuboC = new int[tamI][tamJ][tamK]; // gera uma terceira matriz 10x3x5
		int maxAleato = 500; // valor máximo que as matrizes podem receber de número aleatório
		
		// ATRIBUI VALORES ALEATÓRIOS ÀS MATRIZES
		for (int i = 0; i < tamI; i++) {
			for (int j = 0; j < tamJ; j++) {
				for (int k = 0; k < tamK; k++) {
					// ATRIBUI cuboA E cuboB COM VALORES ALEATÓRIOS
					cuboA[i][j][k] = aleato.nextInt(maxAleato);
					cuboB[i][j][k] = aleato.nextInt(maxAleato);
					
					// ATRIBUI cuboC A PARTIR DA SOMA DE cuboA + cuboB
					cuboC[i][j][k] = cuboA[i][j][k] + cuboB[i][j][k];
				}
			}
		}
		
		// IMPRIME OS VALORES DE cuboA
		System.out.println("VALORES DE CUBO A:");
		for (int[][] linha : cuboA) {
			for (int[] coluna : linha) {
				for (int profundidade : coluna) {
					System.out.print(profundidade + "\t");
				}
				System.out.print("\t\t\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// IMPRIME OS VALORES DE cuboB
		System.out.println("VALORES DE CUBO B:");
		for (int[][] linha : cuboB) {
			for (int[] coluna : linha) {
				for (int profundidade : coluna) {
					System.out.print(profundidade + "\t");
				}
				System.out.print("\t\t\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// IMPRIME OS VALORES DE cuboA
		System.out.println("VALORES DE CUBO C:");
		for (int[][] linha : cuboC) {
			for (int[] coluna : linha) {
				for (int profundidade : coluna) {
					System.out.print(profundidade + "\t");
				}
				System.out.print("\t\t\t");
			}
			System.out.println();
		}
	}

}
