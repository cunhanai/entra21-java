/*
 * Questao 08 Combustivel
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_8: Pensando no grande n�mero de motoristas que 
 * viajam no feriado, um posto de combust�veis resolveu fazer 
 * uma super promo��o, oferecendo pre�os abaixo do mercado:
 * 
 * 		TIPO DE COMBUST�VEL		VALOR POR LITRO
 * 		Gasolina				R$ 2,53
 * 		Etanol					R$ 2,09
 * 		Diesel					R$ 1,92
 * 
 * Al�m disso, todos os clientes que abastecerem seus ve�culos 
 * com mais de 30 litros de etanol ser�o premiados com uma 
 * troca de �leo. Escreva um programa para esse posto de modo 
 * que ele receba como entrada o combust�vel escolhido e a 
 * quantidade de litros que deseja abastecer, calcule e informe 
 * o total a pagar de combust�vel e uma mensagem indicando se 
 * o cliente ganhou ou n�o a troca de �leo.
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao08Combustivel {
	
	public static void main(String[] args) {
		char combustivel;
		double litros, total = 0;
		boolean trocaOleo = false;
		Scanner sc = new Scanner(System.in);
		
		// IMPRIME OS TIPOS DE GASOLINA E OS VALORES DE CADA UM
		System.out.println("Combust�vel \t Valor litro");
		System.out.println("[1] Gasolina \t R$ 2,53");
		System.out.println("[2] Etanol \t R$ 2,09");
		System.out.println("[3] Diesel \t R$ 1,92");
		
		// PEDE O TIPO DE COMUST�VEL E A QUANTIDADE DE LITROS QUE O USU�RIO QUER
		System.out.print("\nTipo de combust�vel: ");
		combustivel = sc.next().charAt(0);
		System.out.print("Quantidade de litros: ");
		litros = sc.nextDouble();
		
		// VERIFICA O TIPO DE COMBUST�VEL E CALCULA O VALOR A SER PAGO
		switch (combustivel) {
		case '1':
			total = litros * 2.53;
			break;
		case '2':
			total = litros * 1.92;
			break;
		case '3':
			total = litros * 2.09;
			// SE O USU�RIO ABASTECER COM MAIS DE 30 LITROS DE ETANOL, GANHA UMA TROCA DE �LEO
			trocaOleo = (litros > 30) ? true : false; 
			break;
		default:
			// SE O N�MERO DIGITADO FOR INV�LIDO, INFORMA AO USU�RIO
			System.out.println("C�digo errado! Por favor, digite um c�digo v�lido!");
			break;
		}
		
		// IMPRIME O VALOR FINAL
		System.out.printf("%n%s %,.2f%n", "Valor total:", total);
		
		// VERIFICA SE O USU�RIO GANHOU UMA TROCA DE �LEO E, CASO SIM, INFORMA A ELE
		if (trocaOleo) {
			System.out.println("Voc� ganhou uma troca de �leo!");
		}
		
		sc.close();
	}

}
