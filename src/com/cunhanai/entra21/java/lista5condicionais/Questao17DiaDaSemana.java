/*
 * Questao 17 Dia Da Semana
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 17 � Fa�a um programa que o usu�rio entre com o dia da 
 * semana de 1 a 7 e o programa imprima caso seja
 * Domingo, segunda, Ter�a, Quarta, Quinta, Sexta ou S�bado
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao17DiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// PEDE O DIA DA SEMANA AO USU�RIO 
		System.out.print("Digite o n�mero de um dia da semana (1 a 7): ");
		int dia = sc.nextInt();
		
		// IMPRIME O DIA DA SEMANA DE ACORDO COM SEU N�MERO
		switch (dia) {
			case 1:
				System.out.println("Domingo.");
				break;
			case 2:
				System.out.println("Segunda.");
				break;
			case 3:
				System.out.println("Ter�a.");
				break;
			case 4:
				System.out.println("Quarta.");
				break;
			case 5:
				System.out.println("Quinta.");
				break;
			case 6:
				System.out.println("Sexta.");
				break;
			case 7:
				System.out.println("S�bado.");
				break;
			default:
				// SE O N�MERO N�O FOR V�LIDO, INFORMA AO USU�RIO
				System.out.println("Oops. Esse n�mero n�o � v�lido.");
				break;
		}
		sc.close();
	}

}
