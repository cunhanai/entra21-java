/*
 * Questao 04 Codigo
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_4: Escreva um PROGRAMA que leia o c�digo de
 * um determinado produto e mostre a sua classifica��o. Utilize
 * a seguinte tabea como refer�ncia.
 * 
 * 		1 				- Alimento n�o-perec�vel
 * 		2, 3 ou 4		- Alimento perec�vel
 *		5 ou 6			- Vestu�rio
 * 		7				- Higiene pessoal
 * 		8 at� 15		- Limpeza e utens�lios dom�sticos
 * 		Outro n�mero	- Inv�lido
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao04Codigo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String classificacao;
		
		// PEDE O CODIGO DO PRODUTO
		System.out.print("C�digo do produto: ");
		int codigo = sc.nextInt();
		
		// VERIFICA QUAL TIPO DE PRODUTO �
		if (codigo == 1) {
			classificacao = "alimento n�o-perec�vel";
		}
		else if (codigo >= 2 && codigo <= 4) {
			classificacao = "alimento perec�vel";
		}
		else if (codigo == 5 || codigo == 6) {
			classificacao = "vestu�rio";
		}
		else if (codigo == 7) {
			classificacao = "higiene pessoal";
		}
		else if (codigo >= 8 && codigo <= 15) {
			classificacao = "limpeza e utens�lios dom�sticos";
		}
		else {
			classificacao = "inv�lido"; // SE O C�DIGO N�O ESTIVER ENTRE 1 E 15, ELE � INV�LIDO
		}
		
		// SE O C�DIGO FOR INV�LIDO, ELE INFORMA AO USU�RIO, SEN�O ELE IMPRIME O TIPO DE PRODUTO 
		if (classificacao == "inv�lido") {
			System.out.printf("C�digo %s", classificacao);
		}
		else {
			System.out.printf("O produto � %s.", classificacao);
		}
		
		sc.close();
	}

}
