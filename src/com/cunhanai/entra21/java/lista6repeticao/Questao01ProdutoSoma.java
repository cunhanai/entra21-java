/*
 * Questao 01 Produto Soma
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 1 - Crie um programa que o usuário entre com vários números inteiros e positivos e 
 * imprima o produto dos números ímpares e a soma dos números pares.
 * Mensagem de entrada: Digite um número positivo e para terminar um negativo ou zero
 */

package com.cunhanai.entra21.java.lista6repeticao;

import java.util.Scanner;

public class Questao01ProdutoSoma {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma = 0, produto = 0;
		
		// PEDE VÁRIOS NÚMEROS INTEIROS POSITIVOS OU UM NEGATIVO OU ZERO PARA TERMINAR
		while (true) {
			System.out.print("Digite um número positivo e para terminar um negativo ou zero: ");
			num = sc.nextInt();
			
			// VERIFICA SE O NÚMERO É MENOR OU IGUAL A ZERO
			if (num <= 0) {
				// SE SIM, QUEBRA O LOOP
				break;
			}
			else {
				// SE NÃO, VERIFICA SE É PAR
				if ((num % 2) == 0) {
					// SE SIM, SOMA OS NÚMEROS PARES
					soma += num;
				}
				else {
					// SE NÃO, MULTIPLICA OS NÚMEROS ÍMPARES
					if (produto == 0) {
						produto = 1;
					}
					produto *= num;
				}
			}
		}
		
		System.out.println("\nProduto dos números ímpares: " + ((produto == 0) ? "não foram informados números ímpares" : produto));
		System.out.println("Soma dos números pares: " + ((soma == 0) ? "não foram informados números pares" : soma));
		
		sc.close();
	}

}
