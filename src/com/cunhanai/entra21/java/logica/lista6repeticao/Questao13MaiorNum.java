package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao13MaiorNum {

		/*
		 * Questão 13 - Construa um programa que leia uma quantidade indeterminada de números 
		 * inteiros positivos e identifique qual foi o maior número digitado. O final da série de números 
		 * digitada deve ser indicado pela entrada de -1.
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, maior = 0;
		
		while (true) {
			System.out.print("Digite um número inteiro positivo: ");
			n = sc.nextInt();
			
			if (n < -1) {
				System.out.println("O número informado não é válido. Por favor, digite um número inteiro positivo ou -1 para encerrar.");
				continue;
			}
			
			if (n == -1) {
				break;
			}
			
			if (n > maior) {
				maior = n;
			}
		}
		System.out.printf("O maior número digitado foi %,d.", maior);
		sc.close();
	}

}
