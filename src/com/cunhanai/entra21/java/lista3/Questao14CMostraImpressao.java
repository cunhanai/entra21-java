/*
 * Questao 14C Mostra Impressao
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudoc�digos e mostre o que 
 * ser� impresso na tela ao serem executados.
 * 
 * A <- 10
 * B <- 20
 * C <- A
 * B <- C
 * A <- B
 * Escrever A, B, C
 */

package com.cunhanai.entra21.java.lista3;

public class Questao14CMostraImpressao {
	
	public static void main(String[] args) {
		int a, b, c;
		
		a = 10;
		b = 20;
		c = a;
		b = c;
		a = b;
		
		System.out.println(a + ", " + b + ", " + c);
	}
}
