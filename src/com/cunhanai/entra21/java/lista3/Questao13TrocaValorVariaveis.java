/*
 * Questao 13 Troca Valor Variaveis
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao_13: Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o 
 * valor 20 em uma vari�vel B. A seguir (utilizando apenas atribui��es entre 
 * vari�veis) troque os seus conte�dos fazendo com que o valor que est� em A passe 
 * para B e vice-versa. Ao final, escreve os valores que ficaram armazenados nas 
 * vari�veis.
 */

package com.cunhanai.entra21.java.lista3;

public class Questao13TrocaValorVariaveis {

	public static void main(String[] args) {
		int a = 10, b = 20, aux;
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("O valor de A �: " + a);
		System.out.println("O valor de B �: " + b);
	}

}
