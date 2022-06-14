/*
 * Questao 14 Credito Especial
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 14 - Um banco conceder� um cr�dito especial aos seus clientes,
 * vari�vel com o saldo m�dio no �ltimo ano. Fa�a um programa que leia o
 * saldo m�dio de um cliente e calcule o valor do cr�dito de acordo com a
 * tabela abaixo. Mostre uma mensagem informando o saldo m�dio e o valor
 * do cr�dito.
 * 
 * 		Saldo m�dio		Percentual
 * 		De 0 a 200,		Nenhum cr�dito
 *		De 201 a 400,	20% do valor do saldo m�dio
 * 		De 401 a 600,	30% do valor do saldo m�dio
 * 		Acima de 601, 	40% do valor do saldo m�dio
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao14CreditoEspecial {
	

	public static void main(String[] args) {
		double saldoMedio, valorCredito;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O SALDO M�DIO DO CLIENTE
		System.out.print("Saldo m�dio do cliente: ");
		saldoMedio = sc.nextDouble();
		
		// VERIFICA SE O SE O CLIENTE TEM DIREITO A CR�DITO, SE SIM, CALCULA E IMPRIME A QTDE DE CR�DITOS
		if (saldoMedio <= 200) {
			System.out.println("Nenhum cr�dito.");
		}
		else if (saldoMedio >= 201 && saldoMedio <= 400) {
			valorCredito = saldoMedio * 0.2;
			System.out.printf("%n20%% do valor do saldo m�dio: R$ %.2f", valorCredito);
		}
		else if (saldoMedio >= 401 && saldoMedio <= 600) {
			valorCredito = saldoMedio * 0.3;
			System.out.printf("%n30%% do valor do saldo m�dio: R$ %.2f", valorCredito);
		}
		else {
			valorCredito = saldoMedio * 0.4;
			System.out.printf("%n40%% do valor do saldo m�dio: R$ %.2f", valorCredito);
		}
		
		sc.close();

	}

}
