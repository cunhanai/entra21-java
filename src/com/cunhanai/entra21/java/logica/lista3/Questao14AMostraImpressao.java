/*
 * Questao 14A Mostra Impressao
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudocodigos e mostre o que 
 * sera impresso na tela ao serem executados.
 * 
 * A <- 10
 * B <- 20
 * Escrever B
 * B <- 5
 * Escrever A, B
 */

package com.cunhanai.entra21.java.logica.lista3;

public class Questao14AMostraImpressao {
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(b);
		
		b = 5;
		System.out.println(a + ", " + b);
	}
}
