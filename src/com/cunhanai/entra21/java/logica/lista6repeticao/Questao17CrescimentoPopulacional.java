package com.cunhanai.entra21.java.logica.lista6repeticao;

public class Questao17CrescimentoPopulacional {
	
	/*
	 * Questão 17 – Suponho que a população de um Pais A seja na ordem de 80000 habitantes 
	 *com uma taxa anual de crescimento de 3% e que a população B seja de 200000 habitantes 
	 *com uma taxa de crescimento de 1,5% . Faça um programa que calcule e escreva o numero 
	 *de anos necessário para que a população do país A ultrapasse ou iguale a população do país 
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
		System.out.printf("Serão necessários %d anos para que a população do País A seja maior que a do País B.", anos);
	}

}
