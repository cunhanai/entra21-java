/*
 * Questao 01 Par Impar
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_1:  Elabore  um  PROGRAMA,  que  dado  um  número inteiro,
 * positivo, verifique e exiba se ele é par ou ímpar (Obs.: um número
 * par é divisível por 2, ou seja, o resto da divisão por 2 é igual a zero).
 */

package com.cunhanai.entra21.java.lista5condicionais;
import java.util.Scanner;

public class Questao01ParImpar {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String parImp1, parImp2;
			
			// PEDE UM NÚMERO INTEIRO AO USUÁRIO
			System.out.print("Digite um número inteiro positivo: ");
			int numero = sc.nextInt();
			
			// FORMA 1 DE CALCULAR SE O NÚMERO É PAR OU ÍMPAR E IMPRIMIR O RESULTADO
			if ((numero % 2) == 0) {
				parImp1 = "par";
			}
			else {
				parImp1 = "ímpar";
			}
			System.out.printf("O número %,d é %s%n", numero, parImp1);
			
			// FORMA 2 DE CALCULAR SE O NÚMERO É PAR OU ÍMPAR E IMPRIMIR O RESULTADO
			System.out.printf("O número %,d é %s%n", numero, ((numero % 2 == 0) ? "par" : "ímpar"));
			
			// FORMA 3 DE CALCULAR SE O NÚMERO É PAR OU ÍMPAR E IMPRIMIR O RESULTADO
			switch (numero % 2) {
			case 0:
				parImp2 = "par";
				break;
			default:
				parImp2 = "ímpar";
			}
			System.out.printf("O número %,d é %s%n", numero, parImp2);
			
			sc.close();
		}
}
