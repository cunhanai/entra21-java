package com.cunhanai.entra21.java.logica.lista6repeticao;

public class Questao03NumDiv11Resto5 {
	
	/*
	 * Quest�o 3 - Escreva um programa para mostrar os n�meros entre 1000 e 2000 que quando 
	 * divididos por 11 d�o resto igual a 5.
	 */

	public static void main(String[] args) {
		
		for (int i = 1000; i < 2000; i++) {
			if ((i % 11) == 5) {
				System.out.println(i);
			}
		}

	}

}
