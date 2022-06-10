/*
 * Questao 08 Combustivel
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_8: Pensando no grande número de motoristas que 
 * viajam no feriado, um posto de combustíveis resolveu fazer 
 * uma super promoção, oferecendo preços abaixo do mercado:
 * 
 * 		TIPO DE COMBUSTÍVEL		VALOR POR LITRO
 * 		Gasolina				R$ 2,53
 * 		Etanol					R$ 2,09
 * 		Diesel					R$ 1,92
 * 
 * Além disso, todos os clientes que abastecerem seus veículos 
 * com mais de 30 litros de etanol serão premiados com uma 
 * troca de óleo. Escreva um programa para esse posto de modo 
 * que ele receba como entrada o combustível escolhido e a 
 * quantidade de litros que deseja abastecer, calcule e informe 
 * o total a pagar de combustível e uma mensagem indicando se 
 * o cliente ganhou ou não a troca de óleo.
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
		System.out.println("Combustível \t Valor litro");
		System.out.println("[1] Gasolina \t R$ 2,53");
		System.out.println("[2] Etanol \t R$ 2,09");
		System.out.println("[3] Diesel \t R$ 1,92");
		
		// PEDE O TIPO DE COMUSTÍVEL E A QUANTIDADE DE LITROS QUE O USUÁRIO QUER
		System.out.print("\nTipo de combustível: ");
		combustivel = sc.next().charAt(0);
		System.out.print("Quantidade de litros: ");
		litros = sc.nextDouble();
		
		// VERIFICA O TIPO DE COMBUSTÍVEL E CALCULA O VALOR A SER PAGO
		switch (combustivel) {
		case '1':
			total = litros * 2.53;
			break;
		case '2':
			total = litros * 1.92;
			break;
		case '3':
			total = litros * 2.09;
			// SE O USUÁRIO ABASTECER COM MAIS DE 30 LITROS DE ETANOL, GANHA UMA TROCA DE ÓLEO
			trocaOleo = (litros > 30) ? true : false; 
			break;
		default:
			// SE O NÚMERO DIGITADO FOR INVÁLIDO, INFORMA AO USUÁRIO
			System.out.println("Código errado! Por favor, digite um código válido!");
			break;
		}
		
		// IMPRIME O VALOR FINAL
		System.out.printf("%n%s %,.2f%n", "Valor total:", total);
		
		// VERIFICA SE O USUÁRIO GANHOU UMA TROCA DE ÓLEO E, CASO SIM, INFORMA A ELE
		if (trocaOleo) {
			System.out.println("Você ganhou uma troca de óleo!");
		}
		
		sc.close();
	}

}
