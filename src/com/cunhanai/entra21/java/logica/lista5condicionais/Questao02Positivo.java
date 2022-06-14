/*
 * Questao 02 Positivo
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_2: Escreva um programa que receba como entrada um
 * número e exiba uma mensagem informando se ele é positivo, negativo ou neutro.
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao02Positivo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo;
		
		// PEDE UM NÚMERO INTEIRO AO USUÁRIO
		System.out.print("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		// VERIFICA SE ELE É POSITIVO, NEGATIVO OU NEUTRO E IMPRIME O RESULTADO
		if (numero > 0) {
			tipo = "positivo";
		}
		else if (numero < 0) {
			tipo = "negativo";
		}
		else {
			tipo = "neutro";
		}
		
		System.out.printf("O número %,d é %s%n", numero, tipo);
		
		sc.close();
	}
}
