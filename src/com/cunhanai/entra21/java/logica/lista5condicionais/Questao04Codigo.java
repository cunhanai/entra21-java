/*
 * Questao 04 Codigo
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_4: Escreva um PROGRAMA que leia o código de
 * um determinado produto e mostre a sua classificação. Utilize
 * a seguinte tabea como referência.
 * 
 * 		1 				- Alimento não-perecível
 * 		2, 3 ou 4		- Alimento perecível
 *		5 ou 6			- Vestuário
 * 		7				- Higiene pessoal
 * 		8 até 15		- Limpeza e utensílios domésticos
 * 		Outro número	- Inválido
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao04Codigo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String classificacao;
		
		// PEDE O CODIGO DO PRODUTO
		System.out.print("Código do produto: ");
		int codigo = sc.nextInt();
		
		// VERIFICA QUAL TIPO DE PRODUTO É
		if (codigo == 1) {
			classificacao = "alimento não-perecível";
		}
		else if (codigo >= 2 && codigo <= 4) {
			classificacao = "alimento perecível";
		}
		else if (codigo == 5 || codigo == 6) {
			classificacao = "vestuário";
		}
		else if (codigo == 7) {
			classificacao = "higiene pessoal";
		}
		else if (codigo >= 8 && codigo <= 15) {
			classificacao = "limpeza e utensílios domésticos";
		}
		else {
			classificacao = "inválido"; // SE O CÓDIGO NÃO ESTIVER ENTRE 1 E 15, ELE É INVÁLIDO
		}
		
		// SE O CÓDIGO FOR INVÁLIDO, ELE INFORMA AO USUÁRIO, SENÃO ELE IMPRIME O TIPO DE PRODUTO 
		if (classificacao == "inválido") {
			System.out.printf("Código %s", classificacao);
		}
		else {
			System.out.printf("O produto é %s.", classificacao);
		}
		
		sc.close();
	}

}
