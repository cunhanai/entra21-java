package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao05NumeroTriangular {

	/*
	 * Questão 5 - Faça um programa que o usuário informa um número e o programa verifica se ele
	 * é um número triangular.
	 * Obs.: Um número é triangular quando o resultado do produto de três números consecutivos.
	 * Exemplo: 24 = 2 x 3 x 4.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, multi = 0, n1 = 0, n2 = 0, n3 = 0; 
		boolean triangular = false;
		
		System.out.print("Digite um número inteiro positivo: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			n1 = i;
			n2 = i+1;
			n3 = i+2;
			multi = n1 * n2 * n3;
			
			if (multi == num) {
				triangular = true;
				break;
			}
		}
		
		System.out.printf("%n%s %d %s %s", "O numero", num, (triangular)? "é" : "não é", "um número triangular.");
		
		if (triangular) {
			System.out.printf("%n%s %d x %d x %d", "Os três números consecultivos que o formam são:", n1, n2, n3);
		}
		
		sc.close();
	}
}
