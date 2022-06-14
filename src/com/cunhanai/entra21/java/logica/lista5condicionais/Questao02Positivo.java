/*
 * Questao 02 Positivo
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_2: Escreva um programa que receba como entrada um
 * n�mero e exiba uma mensagem informando se ele � positivo, negativo ou neutro.
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao02Positivo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo;
		
		// PEDE UM N�MERO INTEIRO AO USU�RIO
		System.out.print("Digite um n�mero inteiro: ");
		int numero = sc.nextInt();
		
		// VERIFICA SE ELE � POSITIVO, NEGATIVO OU NEUTRO E IMPRIME O RESULTADO
		if (numero > 0) {
			tipo = "positivo";
		}
		else if (numero < 0) {
			tipo = "negativo";
		}
		else {
			tipo = "neutro";
		}
		
		System.out.printf("O n�mero %,d � %s%n", numero, tipo);
		
		sc.close();
	}
}
