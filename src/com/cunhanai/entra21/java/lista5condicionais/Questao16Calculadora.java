/*
 * Questao 16 Calculadora
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 16 � Fa�a um programa que entre com dois n�meros inteiros,
 * Entre com uma opera��o ( +, -, * ou /) e fa�a o calculo.
 * Imprima a mensagem  �opera��o invalida� caso n�o entre em nenhuma das 
 * opera��es escolhida.
 *
 * Para opera��o valida:
 * 		Imprima o resultado;
 * 		Verifique se o resultado � positivo ou negativo;
 * 		Verifique se o resultado � par ou impar.
 * 
 * Utilize TAMB�M outra estrutura de Sele��o diferente do if/else
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
		
		// PEDE OS VALORES A SEREM CALCULADOS AO USU�RIO
		System.out.print("Valor 1: ");
		valor1 = sc.nextDouble();
		System.out.print("Valor 2: ");
		valor2 = sc.nextDouble();
		
		// IMPRIME AS OPERA��ES DISPON�VEIS
		System.out.println("\nOpera��es v�lidas: ");
		System.out.println("+  adi��o");
		System.out.println("-  subtra��o");
		System.out.println("*  multiplica��o");
		System.out.println("/  divis�o");
		
		// PEDE O TIPO DE OPERA��O
		System.out.print("\n\nOpera��o: ");
		operacao = sc.next().charAt(0);
		
		// VERIFICA O TIPO DE OPERA��O E CALCULA
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
			valido = false; // INFORMA QUE A OPERA��O ESCOLHIDA N�O � V�LIDA
			res = 0;
			break;
		}
		
		// VERIFICA SE A OPERA��O � V�LIDA
		if (valido) {
			// SE SIM, VERIFICA SE � PAR, POSITIVO E INFORMA OS RESULTADOS AO USU�RIO
			parImp = ((res % 2) == 0) ? "par" : "�mpar";
			posNeg = (res == 0) ? "neutro" : (res > 0) ? "positivo" : "negativo";
			
			System.out.printf("O n�mero � %s e %s", parImp, posNeg);
		}
		else {
			// SE N�O, INFORMA AO USU�RIO
			System.out.println("Opera��o inv�lida!");
		}
		
		sc.close();
	}
}
