/*
 * Questao 02 Detran
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 2 - Crie um programa que ajude o DETRAN a saber, o total de recursos que foram
 * arrecadados com a aplica��o de multas de tr�nsito.
 * O programa deve ler as seguintes informa��es para cada motorista:
 * 
 * 	- O n�mero da carteira de motorista
 * 	- N�mero de multas;
 * 	- Valor de cada uma das multas.
 * 
 * Deve ser impresso o valor da d�vida de cada motorista e ao final da leitura o total de recursos 
 * arrecadados (somat�rio de todas as multas). O programa dever� imprimir tamb�m o n�mero da 
 * carteira do motorista que obteve o maior n�mero de multa
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
			
			System.out.print("\nN�mero CNH (digite 0 para encerrar): ");
			numCNH = sc.nextInt();
			
			if (numCNH == 0) {
				break;
			}
			
			System.out.print("N�mero de multas: ");
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
			
			System.out.printf("%n%s %d %n%s %,.2f %n", "N� CNH:", numCNH, "D�vida: R$", divida);
		}
		System.out.println("\n-------------------------------------");
		System.out.printf("Total de recursos arrecadados: R$ %,.2f", recursos);
		System.out.printf("%n%n%s %d %n%s %d", "Motorista com maior n�mero de multas:", maiorCNH, "N�mero de multas:", maiorNum);
		
		sc.close();
	}
	
	
}
