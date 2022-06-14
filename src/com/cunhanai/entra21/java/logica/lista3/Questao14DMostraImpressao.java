/*
 * Questao 14D Mostra Impressao
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudocódigos e mostre o que 
 * será impresso na tela ao serem executados.
 * 
 * A <- 10
 * B <- A + 1
 * A <- B + 1
 * B <- A + 1
 * Escrever A
 * A <- B + 1
 * Escrever A, B
 */

package com.cunhanai.entra21.java.logica.lista3;

public class Questao14DMostraImpressao {
	
	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = a + 1;
		a = b + 1;
		b = a + 1;
		System.out.println(a);
		
		a = b + 1;
		System.out.println(a + ", " + b);
	}
}
