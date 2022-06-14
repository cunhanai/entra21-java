/*
 * Questao 11 Calculadora
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_11: Faça um algoritmo que simule uma calculadora com as 
 * quatro operações básicas (+, -, *, /). O algoritmo deve solicitar ao 
 * usuário a entrada de dois operandos e da operação a ser executada, 
 * na forma de um menu. Dependendo da opção escolhida, deve ser 
 * executada a operação solicitada e escrito seu resultado. Utilize uma 
 * variável caractere para armazenar a operação a ser executada a 
 * partir do operador.
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao11Calculadora {

	public static void main(String[] args) {
		double valor1, valor2;
		char operacao;
		Scanner sc = new Scanner(System.in);
		
		// PEDE OS VALORES A SEREM CALCULADOS
		System.out.print("Valor 1: ");
		valor1 = sc.nextDouble();
		System.out.print("Valor 2: ");
		valor2 = sc.nextDouble();
		
		// IMPRIME AS OPERAÇÕES VÁLIDAS
		System.out.println("\nOperações válidas: ");
		System.out.println("+  adição");
		System.out.println("-  subtração");
		System.out.println("*  multiplicação");
		System.out.println("/  divisão");
		
		// PEDE O TIPO DE OPERAÇÃO 
		System.out.print("\n\nOperação: ");
		operacao = sc.next().charAt(0);
		
		// VERIFICA O TIPO DE OPERAÇÃO E IMPRIME O CÁLCULO 
		switch (operacao) {
		case '+':
			System.out.println(valor1 + valor2);
			break;
		case '-':
			System.out.println(valor1 - valor2);
			break;
		case '*':
			System.out.println(valor1 * valor2);
			break;
		case '/':
			System.out.println(valor1 / valor2);
			break;
		default:
			System.out.print("Operação inválida.");
			break;
		}
		
		sc.close();
	}

}
