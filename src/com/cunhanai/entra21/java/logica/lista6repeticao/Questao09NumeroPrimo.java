package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao09NumeroPrimo {
	
	/*
	 * Questão 9 - Construa um programa que receba um número inteiro e verifique se o mesmo é 
	 * primo.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		boolean primo = true;
		
		System.out.print("Digite um número: ");
		num = sc.nextDouble();
		
		for (int i = 2; i < num; i++) {
			if ((num % i) == 0) {
					primo = false;
					break;
			}
			else {
				primo = true;
			}
		}
		
		if (primo) {
			System.out.println("Número primo.");
		}
		else {
			System.out.println("Não é número primo.");
		}
		
		sc.close();
	}

}
