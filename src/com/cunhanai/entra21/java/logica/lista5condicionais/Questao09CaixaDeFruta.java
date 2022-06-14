/*
 * Questao 09 Caixa De Fruta
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_9 Sabendo-se que:
 * 
 * 		a. uma caixa de laranja cont�m 60 unidades
 * 		b. uma caixa de lim�o cont�m 80 unidades 
 * 		c. uma caixa de morango cont�m 20 unidades 
 * 
 * Fa�a um PROGRAMA em que o usu�rio ir� informar o fruto e o respectivo pre�o 
 * unit�rio e obtenha como resultado a fruta e o pre�o da caixa
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao09CaixaDeFruta {

	public static void main(String[] args) {
		int fruta;
		String tipoFruta;
		boolean controle = false;
		double valorUnitario, precoCaixa = 0;
		Scanner sc = new Scanner(System.in);
		
		// IMPRIME OS TIPOS DE CAIXA DE FRUTA E AS UNIDADES DE FRUTA QUE CADA UMA COMPORTA
		System.out.println("Caixa de \t Unidades");
		System.out.println("[1] Laranja \t 60");
		System.out.println("[2] Lim�o \t 80");
		System.out.println("[3] Morango \t 20");
		
		// PEDE A FRUTA E O VALOR UNIT�RIO DE CADA UMA
		System.out.print("\nFruta: ");
		fruta = sc.nextInt();
		System.out.print("Valor unit�rio: ");
		valorUnitario = sc.nextDouble();
		
		// VERIFICA QUAL FRUTA � E CALCULA O VALOR DA CAIXA COM BASE EM SUA CAPACIDADE 
		switch (fruta) {
		case 1:
			precoCaixa = valorUnitario * 60;
			tipoFruta = "laranja";
			controle = true;
			break;
		case 2:
			precoCaixa = valorUnitario * 80;
			tipoFruta = "lim�o";
			controle = true;
			break;
		case 3:
			precoCaixa = valorUnitario * 20;
			tipoFruta = "morango";
			controle = true;
			break;
		default:
			tipoFruta = "";
			precoCaixa = 0;
			break;
		}
		
		// VERIFICA SE O C�DIGO DA FRUTA � VALIDO E IMPRIME O RESULTADO
		if (controle) {
			System.out.printf("Pre�o da caixa de %s: R$ %,.2f.", tipoFruta, precoCaixa);
		}
		else {
			System.out.print("Comando errado! Por favor, digite um n�mero de 1 a 3.");
		}
		
		sc.close();
	}

}
