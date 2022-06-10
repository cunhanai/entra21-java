/*
 * Questao 14B Mostra Impressao
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudocódigos e mostre o que 
 * será impresso na tela ao serem executados.
 * 
 * A <- 30
 * B <- 20
 * C <- A+B
 * Escrever C
 * B <- 10
 * Escrever B, C
 * C <- A+B
 * Escrever A, B, C
 */

package com.cunhanai.entra21.java.lista3;

public class Questao14BMostraImpressao {

	public static void main(String[] args) {
		int a, b, c;
		
		a = 30;
		b = 20;
		c = a + b;
		System.out.println(c);
		
		b = 10;
		System.out.println(b + ", " + c);
		
		c = a + b;
		System.out.println(a + ", " + b + ", " + c);
	}

}
