package com.cunhanai.entra21.java.logica.lista6repeticao;

public class Questao17CrescimentoPopulacional {
	
	/*
	 * Quest�o 17 � Suponho que a popula��o de um Pais A seja na ordem de 80000 habitantes 
	 *com uma taxa anual de crescimento de 3% e que a popula��o B seja de 200000 habitantes 
	 *com uma taxa de crescimento de 1,5% . Fa�a um programa que calcule e escreva o numero 
	 *de anos necess�rio para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s 
	 *B, mantidas as taxas de crescimento.
	 */
	public static void main(String[] args) {
		int paisA, paisB, anos = 0;
		float taxaA, taxaB;
		
		paisA = 80000;
		taxaA = 0.03f;
		paisB = 200000;
		taxaB = 0.015f;
		
		while (paisA < paisB) {
			paisA = (int)(paisA + (paisA * taxaA));
			paisB = (int)(paisB + (paisB * taxaB));
			++anos;
		}
		System.out.printf("Ser�o necess�rios %d anos para que a popula��o do Pa�s A seja maior que a do Pa�s B.", anos);
	}

}
