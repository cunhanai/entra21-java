/*
 * Questao 14E Mostra Impressao
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudocódigos e mostre o que 
 * será impresso na tela ao serem executados.
 * 
 * A <- 10
 * B <- 5
 * C <- A + B
 * B <- 20
 * A <- 10
 * Escrever A, B, C
 */

package com.cunhanai.entra21.java.logica.lista3;

public class Questao14EMostraImpressao {
	
	public static void main(String[] args) {
		int a, b, c;
		
		a = 10;
		b = 5;
		c = a + b;
		b = 20;
		a = 10;
		
		System.out.println(a + ", " + b + ", " + c);
	}
}
