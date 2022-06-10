/*
 * Questao 2 Qual Produto Comprar
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 2 � Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
 * produto voc� deve comprar, sabendo que a decis�o sempre � pelo mais barato.
 */

package com.cunhanai.entra21.java.lista5condicionais.extra;

import java.util.Scanner;

public class Questao2QualProdutoComprar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco1, preco2, preco3;
		String decisao;
		
		// PEDE O PRE�O DOS PRODUTOS
		System.out.print("Pre�o do produto 1: ");
		preco1 = sc.nextDouble();
		System.out.print("Pre�o do produto 2: ");
		preco2 = sc.nextDouble();
		System.out.print("Pre�o do produto 3: ");
		preco3 = sc.nextDouble();
		
		// VERIFICA OS PRE�OS E DECLARA A DECIS�O
		if (preco1 == preco2 && preco1 == preco3) {
			decisao = "Voc� pode comprar qualquer produto, eles possuem o mesmo pre�o.";
		}
		else if (preco1 == preco2 && preco1 < preco3) {
			decisao = "Voc� pode comprar tanto o primeiro produto, quanto o segundo.";
		}
		else if (preco1 == preco3 && preco1 < preco2) {
			decisao = "Voc� pode comprar tanto primeiro produto, quanto o terceiro.";
		}
		else if (preco2 == preco3 && preco2 < preco1) {
			decisao = "Voc� pode comprar tanto o segundo produto, quanto o terceiro.";
		}
		else if (preco1 < preco2 && preco1 < preco3) {
			decisao = "Voc� deve comprar primeiro produto.";
		}
		else if (preco2 < preco1 && preco2 < preco3) {
			decisao = "Voc� deve comprar o segundo produto";
		}
		else {
			decisao = "Voc� deve comprar o terceiro produto.";
		}
		
		// IMPRIME A DECIS�O
		System.out.println(decisao);
		
		sc.close();
		
		
	}

}
