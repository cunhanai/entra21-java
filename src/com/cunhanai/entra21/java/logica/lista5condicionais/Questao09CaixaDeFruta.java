/*
 * Questao 09 Caixa De Fruta
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_9 Sabendo-se que:
 * 
 * 		a. uma caixa de laranja contém 60 unidades
 * 		b. uma caixa de limão contém 80 unidades 
 * 		c. uma caixa de morango contém 20 unidades 
 * 
 * Faça um PROGRAMA em que o usuário irá informar o fruto e o respectivo preço 
 * unitário e obtenha como resultado a fruta e o preço da caixa
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
		System.out.println("[2] Limão \t 80");
		System.out.println("[3] Morango \t 20");
		
		// PEDE A FRUTA E O VALOR UNITÁRIO DE CADA UMA
		System.out.print("\nFruta: ");
		fruta = sc.nextInt();
		System.out.print("Valor unitário: ");
		valorUnitario = sc.nextDouble();
		
		// VERIFICA QUAL FRUTA É E CALCULA O VALOR DA CAIXA COM BASE EM SUA CAPACIDADE 
		switch (fruta) {
		case 1:
			precoCaixa = valorUnitario * 60;
			tipoFruta = "laranja";
			controle = true;
			break;
		case 2:
			precoCaixa = valorUnitario * 80;
			tipoFruta = "limão";
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
		
		// VERIFICA SE O CÓDIGO DA FRUTA É VALIDO E IMPRIME O RESULTADO
		if (controle) {
			System.out.printf("Preço da caixa de %s: R$ %,.2f.", tipoFruta, precoCaixa);
		}
		else {
			System.out.print("Comando errado! Por favor, digite um número de 1 a 3.");
		}
		
		sc.close();
	}

}
