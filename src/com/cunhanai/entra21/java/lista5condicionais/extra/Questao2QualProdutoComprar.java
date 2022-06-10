/*
 * Questao 2 Qual Produto Comprar
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 2 – Faça um programa que pergunte o preço de três produtos e informe qual
 * produto você deve comprar, sabendo que a decisão sempre é pelo mais barato.
 */

package com.cunhanai.entra21.java.lista5condicionais.extra;

import java.util.Scanner;

public class Questao2QualProdutoComprar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco1, preco2, preco3;
		String decisao;
		
		// PEDE O PREÇO DOS PRODUTOS
		System.out.print("Preço do produto 1: ");
		preco1 = sc.nextDouble();
		System.out.print("Preço do produto 2: ");
		preco2 = sc.nextDouble();
		System.out.print("Preço do produto 3: ");
		preco3 = sc.nextDouble();
		
		// VERIFICA OS PREÇOS E DECLARA A DECISÃO
		if (preco1 == preco2 && preco1 == preco3) {
			decisao = "Você pode comprar qualquer produto, eles possuem o mesmo preço.";
		}
		else if (preco1 == preco2 && preco1 < preco3) {
			decisao = "Você pode comprar tanto o primeiro produto, quanto o segundo.";
		}
		else if (preco1 == preco3 && preco1 < preco2) {
			decisao = "Você pode comprar tanto primeiro produto, quanto o terceiro.";
		}
		else if (preco2 == preco3 && preco2 < preco1) {
			decisao = "Você pode comprar tanto o segundo produto, quanto o terceiro.";
		}
		else if (preco1 < preco2 && preco1 < preco3) {
			decisao = "Você deve comprar primeiro produto.";
		}
		else if (preco2 < preco1 && preco2 < preco3) {
			decisao = "Você deve comprar o segundo produto";
		}
		else {
			decisao = "Você deve comprar o terceiro produto.";
		}
		
		// IMPRIME A DECISÃO
		System.out.println(decisao);
		
		sc.close();
		
		
	}

}
