package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao11Tabuada {
	
	/*
	 * Questão 11 - Faça um programa que exiba a tabuada de um número x.
	 * Obs: tabuada: x*1, x*2 … x*10;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, res;
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		System.out.printf("%n%s %d", "Tabuada do número", x);
		
		for (int i = 1; i < 11; i++) {
			res = x * i;
			System.out.printf("%n%d x %d = %d", x, i, res);
		}
		
		sc.close();
	}

}
