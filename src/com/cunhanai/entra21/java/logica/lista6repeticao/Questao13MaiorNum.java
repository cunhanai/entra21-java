package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao13MaiorNum {

		/*
		 * Quest�o 13 - Construa um programa que leia uma quantidade indeterminada de n�meros 
		 * inteiros positivos e identifique qual foi o maior n�mero digitado. O final da s�rie de n�meros 
		 * digitada deve ser indicado pela entrada de -1.
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, maior = 0;
		
		while (true) {
			System.out.print("Digite um n�mero inteiro positivo: ");
			n = sc.nextInt();
			
			if (n < -1) {
				System.out.println("O n�mero informado n�o � v�lido. Por favor, digite um n�mero inteiro positivo ou -1 para encerrar.");
				continue;
			}
			
			if (n == -1) {
				break;
			}
			
			if (n > maior) {
				maior = n;
			}
		}
		System.out.printf("O maior n�mero digitado foi %,d.", maior);
		sc.close();
	}

}
