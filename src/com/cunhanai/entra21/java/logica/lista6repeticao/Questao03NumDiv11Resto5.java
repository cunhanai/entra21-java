package com.cunhanai.entra21.java.logica.lista6repeticao;

public class Questao03NumDiv11Resto5 {
	
	/*
	 * Questão 3 - Escreva um programa para mostrar os números entre 1000 e 2000 que quando 
	 * divididos por 11 dão resto igual a 5.
	 */

	public static void main(String[] args) {
		
		for (int i = 1000; i < 2000; i++) {
			if ((i % 11) == 5) {
				System.out.println(i);
			}
		}

	}

}
