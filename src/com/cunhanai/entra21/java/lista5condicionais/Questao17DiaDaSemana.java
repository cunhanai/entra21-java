/*
 * Questao 17 Dia Da Semana
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 17 – Faça um programa que o usuário entre com o dia da 
 * semana de 1 a 7 e o programa imprima caso seja
 * Domingo, segunda, Terça, Quarta, Quinta, Sexta ou Sábado
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao17DiaDaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// PEDE O DIA DA SEMANA AO USUÁRIO 
		System.out.print("Digite o número de um dia da semana (1 a 7): ");
		int dia = sc.nextInt();
		
		// IMPRIME O DIA DA SEMANA DE ACORDO COM SEU NÚMERO
		switch (dia) {
			case 1:
				System.out.println("Domingo.");
				break;
			case 2:
				System.out.println("Segunda.");
				break;
			case 3:
				System.out.println("Terça.");
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
				System.out.println("Sábado.");
				break;
			default:
				// SE O NÚMERO NÃO FOR VÁLIDO, INFORMA AO USUÁRIO
				System.out.println("Oops. Esse número não é válido.");
				break;
		}
		sc.close();
	}

}
