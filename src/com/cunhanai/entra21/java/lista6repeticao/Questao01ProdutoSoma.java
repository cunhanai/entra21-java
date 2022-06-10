/*
 * Questao 01 Produto Soma
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 1 - Crie um programa que o usu�rio entre com v�rios n�meros inteiros e positivos e 
 * imprima o produto dos n�meros �mpares e a soma dos n�meros pares.
 * Mensagem de entrada: Digite um n�mero positivo e para terminar um negativo ou zero
 */

package com.cunhanai.entra21.java.lista6repeticao;

import java.util.Scanner;

public class Questao01ProdutoSoma {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma = 0, produto = 0;
		
		// PEDE V�RIOS N�MEROS INTEIROS POSITIVOS OU UM NEGATIVO OU ZERO PARA TERMINAR
		while (true) {
			System.out.print("Digite um n�mero positivo e para terminar um negativo ou zero: ");
			num = sc.nextInt();
			
			// VERIFICA SE O N�MERO � MENOR OU IGUAL A ZERO
			if (num <= 0) {
				// SE SIM, QUEBRA O LOOP
				break;
			}
			else {
				// SE N�O, VERIFICA SE � PAR
				if ((num % 2) == 0) {
					// SE SIM, SOMA OS N�MEROS PARES
					soma += num;
				}
				else {
					// SE N�O, MULTIPLICA OS N�MEROS �MPARES
					if (produto == 0) {
						produto = 1;
					}
					produto *= num;
				}
			}
		}
		
		System.out.println("\nProduto dos n�meros �mpares: " + ((produto == 0) ? "n�o foram informados n�meros �mpares" : produto));
		System.out.println("Soma dos n�meros pares: " + ((soma == 0) ? "n�o foram informados n�meros pares" : soma));
		
		sc.close();
	}

}
