package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao19GeradorDeNumeros {

		/*
		 * Questão 19 – Façaum programa que receba dois números inteiros e
		 * gere os números inteiros que estão no intervalo compreendido por eles.
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aux;
		String token;
		
		System.out.println("Digite dois números inteiros.");
		System.out.print("Primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.printf("%nOs números compreendidos no intervalo de %d e %d são: ", num1, num2);
		for (int i = num1+1; i < num2; i++) {
			token = (i == (num2-1)) ? "." : ", " ;
			System.out.print(i + token);
		}
		
		sc.close();
	}

}
