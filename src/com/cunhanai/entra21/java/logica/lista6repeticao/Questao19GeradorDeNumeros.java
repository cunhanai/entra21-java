package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao19GeradorDeNumeros {

		/*
		 * Quest�o 19 � Fa�aum programa que receba dois n�meros inteiros e
		 * gere os n�meros inteiros que est�o no intervalo compreendido por eles.
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aux;
		String token;
		
		System.out.println("Digite dois n�meros inteiros.");
		System.out.print("Primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.printf("%nOs n�meros compreendidos no intervalo de %d e %d s�o: ", num1, num2);
		for (int i = num1+1; i < num2; i++) {
			token = (i == (num2-1)) ? "." : ", " ;
			System.out.print(i + token);
		}
		
		sc.close();
	}

}
