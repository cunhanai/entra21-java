/*
 * Questao 15 Kg Carne
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 15 – Faça um programa que peça ao usuário para escolher o 
 * tipo de carne, e digite a quantidade em kg. O programa deverá:
 * 
 * - Imprimir a quantidade e o tipo de carne  que foi escolhida;
 * - Dependendo do tipo de carne e quantidade;
 * - Definir qual será o valor da carne;
 * - Calcular o valor de carne com quantidade;
 * - Imprimir na mesma linha o calculo feito e o  total;
 * - Informar que se pagamento no cartão digitar a opção 1 e conceder 
 *   o desconto de 5% no totalimprimir o valor de desconto caso teve
 * - Imprimir o total a pagar.
 * - Seguindo as informações abaixo:
 * 
 * 
 * TIPO DE CARNE			PREÇO KG
 * 					Qtd < 5kg	Qtde > 5kg
 * Filé duplo		4,9			5,8
 * Alcatra			5,9			6,8
 * Picanha			6,9			7,8
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao15KgCarne {
	

	public static void main(String[] args) {
		int tipoCarne, formaPagamento;
		double qtde, valor, preco, desconto, valorTotal;
		boolean compra = false;
		Scanner sc = new Scanner(System.in);
		
		// IMPRIME OS TIPOS DE CARNE E SEUS RESPECTIVOS VALORES
		System.out.println("--------------------------------------------");
		System.out.println("Tipo carne \t\t Preço");
		System.out.println("\t\tQtd < 5kg\tQtd > 5kg");
		System.out.println("[1]Filé duplo \t 4,9 \t\t 5,8");
		System.out.println("[2]Alcatra \t 5,9 \t\t 6,8");
		System.out.println("[3]Picanha \t 6,9 \t\t 7,8");
		System.out.println("--------------------------------------------\n");
		
		// PEDE O TIPO DE CARNE E A QUANTIDADE
		System.out.print("Tipo de carne: ");
		tipoCarne = sc.nextInt();
		System.out.print("Quantidade (kg): ");
		qtde = sc.nextDouble();
		
		// VERIFICA O TIPO DE CARNE, A QUANTIDADE E ATRIBUI OS PRECOS
		switch (tipoCarne) {
		case 1:
			if (qtde < 5) {
				preco = 4.9;
			}
			else {
				preco = 5.8;
			}
			
			compra = true;
			break;
		case 2:
			if (qtde < 5) {
				preco = 5.9;
			}
			else {
				preco = 6.8;
			}
			
			compra = true;
			break;
		case 3:
			if (qtde < 5) {
				preco = 6.9;
			}
			else {
				preco = 7.8;
			}
			
			compra = true;
			break;
		default:
			// SE O CÓDIGO FOR INVÁLIDO, NÃO HÁ COMPRA
			compra = false;
			preco = 0;
			valor = 0;
			break;
		}
		
		// CALCULA O VALOR FINAL DA CARNE
		valor = qtde * preco;
		
		// VERIFICA SE HÁ COMPRA
		if (compra) {
			// SE SIM, IMPRIME AS FORMAS DE PAGAMENTO DISPONÍVEIS
			System.out.printf("%n%,.2f * %,.2f = %,.2f", qtde, preco, valor);
			System.out.println("\nForma de pagamento:");
			System.out.println("[1] Cartão");
			System.out.println("[2] Dinheiro");
			System.out.println("[3] Pix");
			
			// PEDE A FORMA DE PAGAMENTO AO USUÁRIO
			System.out.print("\nQual a forma de pagamento? ");
			formaPagamento = sc.nextInt();
			
			// VERIFICA SE HÁ DESCONTO AO ESCOLHER CARTÃO E INFORMA AO USUÁRIO
			if (formaPagamento == 1) {
				desconto = valor * 0.05;
				valorTotal = valor - desconto;
				System.out.printf("%n%s %,.2f!","Você obteve um desconto de", desconto);
			}
			else {
				valorTotal = valor;
			}
			
			// IMPRIME O VALOR FINAÇ A SER PAGO 
			System.out.printf("%n%s %,.2f", "Valor total:", valorTotal);
		}
		else {
			// SE NÃO, INFORMA QUE O TIPO DE CARNE É INVÁLIDO
			System.out.println("Tipo de carne inválido.");
		}
		
		sc.close();
	}

}
