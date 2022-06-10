/*
 * Questao 02 Detran
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 2 - Crie um programa que ajude o DETRAN a saber, o total de recursos que foram
 * arrecadados com a aplicação de multas de trânsito.
 * O programa deve ler as seguintes informações para cada motorista:
 * 
 * 	- O número da carteira de motorista
 * 	- Número de multas;
 * 	- Valor de cada uma das multas.
 * 
 * Deve ser impresso o valor da dívida de cada motorista e ao final da leitura o total de recursos 
 * arrecadados (somatório de todas as multas). O programa deverá imprimir também o número da 
 * carteira do motorista que obteve o maior número de multa
 */

package com.cunhanai.entra21.java.lista6repeticao;

import java.util.Scanner;

public class Questao02Detran {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCNH, numMultas, maiorNum = 0, maiorCNH = 0;
		double divida, recursos = 0;
		
		while (true) {
			divida = 0;
			
			System.out.print("\nNúmero CNH (digite 0 para encerrar): ");
			numCNH = sc.nextInt();
			
			if (numCNH == 0) {
				break;
			}
			
			System.out.print("Número de multas: ");
			numMultas = sc.nextInt();
			
			for (int i = 1; i <= numMultas; i++) {
				System.out.printf("Valor da multa %d: ", i);
				divida += sc.nextDouble();
			}
			
			recursos += divida;
			
			if (numMultas > maiorNum) {
				maiorNum = numMultas;
				maiorCNH = numCNH; 
			}
			
			System.out.printf("%n%s %d %n%s %,.2f %n", "N° CNH:", numCNH, "Dívida: R$", divida);
		}
		System.out.println("\n-------------------------------------");
		System.out.printf("Total de recursos arrecadados: R$ %,.2f", recursos);
		System.out.printf("%n%n%s %d %n%s %d", "Motorista com maior número de multas:", maiorCNH, "Número de multas:", maiorNum);
		
		sc.close();
	}
	
	
}
