/*
 * Questao 13 Troca Valor Variaveis
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_13: Escreva um algoritmo que armazene o valor 10 em uma variável A e o 
 * valor 20 em uma variável B. A seguir (utilizando apenas atribuições entre 
 * variáveis) troque os seus conteúdos fazendo com que o valor que está em A passe 
 * para B e vice-versa. Ao final, escreve os valores que ficaram armazenados nas 
 * variáveis.
 */

package com.cunhanai.entra21.java.lista3;

public class Questao13TrocaValorVariaveis {

	public static void main(String[] args) {
		int a = 10, b = 20, aux;
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("O valor de A é: " + a);
		System.out.println("O valor de B é: " + b);
	}

}
