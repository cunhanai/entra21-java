/*
 * Questao 15 Kg Carne
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 15 � Fa�a um programa que pe�a ao usu�rio para escolher o 
 * tipo de carne, e digite a quantidade em kg. O programa dever�:
 * 
 * - Imprimir a quantidade e o tipo de carne  que foi escolhida;
 * - Dependendo do tipo de carne e quantidade;
 * - Definir qual ser� o valor da carne;
 * - Calcular o valor de carne com quantidade;
 * - Imprimir na mesma linha o calculo feito e o  total;
 * - Informar que se pagamento no cart�o digitar a op��o 1 e conceder 
 *   o desconto de 5% no totalimprimir o valor de desconto caso teve
 * - Imprimir o total a pagar.
 * - Seguindo as informa��es abaixo:
 * 
 * 
 * TIPO DE CARNE			PRE�O KG
 * 					Qtd < 5kg	Qtde > 5kg
 * Fil� duplo		4,9			5,8
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
		System.out.println("Tipo carne \t\t Pre�o");
		System.out.println("\t\tQtd < 5kg\tQtd > 5kg");
		System.out.println("[1]Fil� duplo \t 4,9 \t\t 5,8");
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
			// SE O C�DIGO FOR INV�LIDO, N�O H� COMPRA
			compra = false;
			preco = 0;
			valor = 0;
			break;
		}
		
		// CALCULA O VALOR FINAL DA CARNE
		valor = qtde * preco;
		
		// VERIFICA SE H� COMPRA
		if (compra) {
			// SE SIM, IMPRIME AS FORMAS DE PAGAMENTO DISPON�VEIS
			System.out.printf("%n%,.2f * %,.2f = %,.2f", qtde, preco, valor);
			System.out.println("\nForma de pagamento:");
			System.out.println("[1] Cart�o");
			System.out.println("[2] Dinheiro");
			System.out.println("[3] Pix");
			
			// PEDE A FORMA DE PAGAMENTO AO USU�RIO
			System.out.print("\nQual a forma de pagamento? ");
			formaPagamento = sc.nextInt();
			
			// VERIFICA SE H� DESCONTO AO ESCOLHER CART�O E INFORMA AO USU�RIO
			if (formaPagamento == 1) {
				desconto = valor * 0.05;
				valorTotal = valor - desconto;
				System.out.printf("%n%s %,.2f!","Voc� obteve um desconto de", desconto);
			}
			else {
				valorTotal = valor;
			}
			
			// IMPRIME O VALOR FINA� A SER PAGO 
			System.out.printf("%n%s %,.2f", "Valor total:", valorTotal);
		}
		else {
			// SE N�O, INFORMA QUE O TIPO DE CARNE � INV�LIDO
			System.out.println("Tipo de carne inv�lido.");
		}
		
		sc.close();
	}

}
