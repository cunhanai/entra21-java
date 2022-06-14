/*
 * Questao 11 Calculadora
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_11: Fa�a um algoritmo que simule uma calculadora com as 
 * quatro opera��es b�sicas (+, -, *, /). O algoritmo deve solicitar ao 
 * usu�rio a entrada de dois operandos e da opera��o a ser executada, 
 * na forma de um menu. Dependendo da op��o escolhida, deve ser 
 * executada a opera��o solicitada e escrito seu resultado. Utilize uma 
 * vari�vel caractere para armazenar a opera��o a ser executada a 
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
		
		// IMPRIME AS OPERA��ES V�LIDAS
		System.out.println("\nOpera��es v�lidas: ");
		System.out.println("+  adi��o");
		System.out.println("-  subtra��o");
		System.out.println("*  multiplica��o");
		System.out.println("/  divis�o");
		
		// PEDE O TIPO DE OPERA��O 
		System.out.print("\n\nOpera��o: ");
		operacao = sc.next().charAt(0);
		
		// VERIFICA O TIPO DE OPERA��O E IMPRIME O C�LCULO 
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
			System.out.print("Opera��o inv�lida.");
			break;
		}
		
		sc.close();
	}

}
