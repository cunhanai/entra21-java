package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao05NumeroTriangular {

	/*
	 * Quest�o 5 - Fa�a um programa que o usu�rio informa um n�mero e o programa verifica se ele
	 * � um n�mero triangular.
	 * Obs.: Um n�mero � triangular quando o resultado do produto de tr�s n�meros consecutivos.
	 * Exemplo: 24 = 2 x 3 x 4.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, multi = 0, n1 = 0, n2 = 0, n3 = 0; 
		boolean triangular = false;
		
		System.out.print("Digite um n�mero inteiro positivo: ");
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
		
		System.out.printf("%n%s %d %s %s", "O numero", num, (triangular)? "�" : "n�o �", "um n�mero triangular.");
		
		if (triangular) {
			System.out.printf("%n%s %d x %d x %d", "Os tr�s n�meros consecultivos que o formam s�o:", n1, n2, n3);
		}
		
		sc.close();
	}
}
