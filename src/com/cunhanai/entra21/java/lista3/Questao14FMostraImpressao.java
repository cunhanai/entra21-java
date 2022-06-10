/*
 * Questao 14F Mostra Impressao
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_14: Analise os algoritmos abaixo, escreva os pseudocódigos e mostre o que 
 * será impresso na tela ao serem executados.
 * 
 * X <- 1
 * Y <- 2
 * Z <- Y - X
 * Escrever Z
 * X <- 5
 * Y <- X + Z
 * Escrever X, Y, Z
 */

package com.cunhanai.entra21.java.lista3;

public class Questao14FMostraImpressao {
	
	public static void main(String[] args) {
		int x, y, z;
		
		x = 1;
		y = 2;
		z = y - x;
		System.out.println(z);
		
		x = 5;
		y = x + z;
		System.out.println(x + ", " + y + ", " + z);
	}
}
