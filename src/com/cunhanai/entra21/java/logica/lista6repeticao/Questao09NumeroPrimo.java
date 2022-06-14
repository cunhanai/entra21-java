package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao09NumeroPrimo {
	
	/*
	 * Quest�o 9 - Construa um programa que receba um n�mero inteiro e verifique se o mesmo � 
	 * primo.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		boolean primo = true;
		
		System.out.print("Digite um n�mero: ");
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
			System.out.println("N�mero primo.");
		}
		else {
			System.out.println("N�o � n�mero primo.");
		}
		
		sc.close();
	}

}
