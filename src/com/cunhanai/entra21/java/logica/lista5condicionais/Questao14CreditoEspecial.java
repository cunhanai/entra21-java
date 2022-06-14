/*
 * Questao 14 Credito Especial
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 14 - Um banco concederá um crédito especial aos seus clientes,
 * variável com o saldo médio no último ano. Faça um programa que leia o
 * saldo médio de um cliente e calcule o valor do crédito de acordo com a
 * tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor
 * do crédito.
 * 
 * 		Saldo médio		Percentual
 * 		De 0 a 200,		Nenhum crédito
 *		De 201 a 400,	20% do valor do saldo médio
 * 		De 401 a 600,	30% do valor do saldo médio
 * 		Acima de 601, 	40% do valor do saldo médio
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao14CreditoEspecial {
	

	public static void main(String[] args) {
		double saldoMedio, valorCredito;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O SALDO MÉDIO DO CLIENTE
		System.out.print("Saldo médio do cliente: ");
		saldoMedio = sc.nextDouble();
		
		// VERIFICA SE O SE O CLIENTE TEM DIREITO A CRÉDITO, SE SIM, CALCULA E IMPRIME A QTDE DE CRÉDITOS
		if (saldoMedio <= 200) {
			System.out.println("Nenhum crédito.");
		}
		else if (saldoMedio >= 201 && saldoMedio <= 400) {
			valorCredito = saldoMedio * 0.2;
			System.out.printf("%n20%% do valor do saldo médio: R$ %.2f", valorCredito);
		}
		else if (saldoMedio >= 401 && saldoMedio <= 600) {
			valorCredito = saldoMedio * 0.3;
			System.out.printf("%n30%% do valor do saldo médio: R$ %.2f", valorCredito);
		}
		else {
			valorCredito = saldoMedio * 0.4;
			System.out.printf("%n40%% do valor do saldo médio: R$ %.2f", valorCredito);
		}
		
		sc.close();

	}

}
