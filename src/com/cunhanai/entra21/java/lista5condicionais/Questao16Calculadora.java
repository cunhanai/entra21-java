/*
 * Questao 16 Calculadora
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 16 – Faça um programa que entre com dois números inteiros,
 * Entre com uma operação ( +, -, * ou /) e faça o calculo.
 * Imprima a mensagem  “operação invalida” caso não entre em nenhuma das 
 * operações escolhida.
 *
 * Para operação valida:
 * 		Imprima o resultado;
 * 		Verifique se o resultado é positivo ou negativo;
 * 		Verifique se o resultado é par ou impar.
 * 
 * Utilize TAMBÉM outra estrutura de Seleção diferente do if/else
 */
package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao16Calculadora {
	

	public static void main(String[] args) {
		double valor1, valor2, res;
		char operacao;
		boolean valido = false;
		String posNeg, parImp;
		Scanner sc = new Scanner(System.in);
		
		// PEDE OS VALORES A SEREM CALCULADOS AO USUÁRIO
		System.out.print("Valor 1: ");
		valor1 = sc.nextDouble();
		System.out.print("Valor 2: ");
		valor2 = sc.nextDouble();
		
		// IMPRIME AS OPERAÇÕES DISPONÍVEIS
		System.out.println("\nOperações válidas: ");
		System.out.println("+  adição");
		System.out.println("-  subtração");
		System.out.println("*  multiplicação");
		System.out.println("/  divisão");
		
		// PEDE O TIPO DE OPERAÇÃO
		System.out.print("\n\nOperação: ");
		operacao = sc.next().charAt(0);
		
		// VERIFICA O TIPO DE OPERAÇÃO E CALCULA
		switch (operacao) {
		case '+':
			res = valor1 + valor2;
			valido = true;
			break;
		case '-':
			res = valor1 - valor2;
			valido = true;
			break;
		case '*':
			res = valor1 * valor2;
			valido = true;
			break;
		case '/':
			res = valor1 / valor2;
			valido = true;
			break;
		default:
			valido = false; // INFORMA QUE A OPERAÇÃO ESCOLHIDA NÃO É VÁLIDA
			res = 0;
			break;
		}
		
		// VERIFICA SE A OPERAÇÃO É VÁLIDA
		if (valido) {
			// SE SIM, VERIFICA SE É PAR, POSITIVO E INFORMA OS RESULTADOS AO USUÁRIO
			parImp = ((res % 2) == 0) ? "par" : "ímpar";
			posNeg = (res == 0) ? "neutro" : (res > 0) ? "positivo" : "negativo";
			
			System.out.printf("O número é %s e %s", parImp, posNeg);
		}
		else {
			// SE NÃO, INFORMA AO USUÁRIO
			System.out.println("Operação inválida!");
		}
		
		sc.close();
	}
}
