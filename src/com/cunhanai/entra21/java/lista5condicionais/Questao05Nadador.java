/*
 * Questao 05 Nadador
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_5: Elabore um PROGRAMA que, dada a idade de
 * um nadador, classifique-o em uma das seguintes categorias:
 * 
 * 5 at� 7 anos	- Infantil A
 * 8 at� 10		- Infantil B
 * 11 at� 13 	- Juvenil A
 * 14 at� 17	- Juvenil B
 * Mais de 18	- Adulto
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao05Nadador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String classificacao;
		
		// PEDE AO USU�RIO A IDADE DO NADADOR
		System.out.print("Idade do nadador: ");
		int idade = sc.nextInt();
		
		// VERIFICA A CLASSIFICA��O DELE DE ACORDO COM A IDADE
		if (idade < 5) {
			// SE A IDADE FOR INV�LIDA, INFORMA AO USU�RIO
			classificacao = "inv�lidada/indispon�vel";
		}
		else if (idade >= 5 && idade <= 7) {
			classificacao = "Infantil A";
		}
		else if (idade >= 8 && idade <= 10) {
			classificacao = "Infantil B";
		}
		else if (idade >= 11 && idade <= 13) {
			classificacao = "Juvenil A";
		}
		else if (idade >= 14 && idade <= 17) {
			classificacao = "Juvenil B";
		}
		else {
			classificacao = "Adulto";
		}
		
		// IMPRIME A IDADE E A CLASSIFICA��O DO NADADOR
		System.out.printf("%d ano(s) - %S", idade, classificacao);
		
		sc.close();
	}

}
