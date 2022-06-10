/*
 * Questao 01 Par Impar
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_1:  Elabore  um  PROGRAMA,  que  dado  um  n�mero inteiro,
 * positivo, verifique e exiba se ele � par ou �mpar (Obs.: um n�mero
 * par � divis�vel por 2, ou seja, o resto da divis�o por 2 � igual a zero).
 */

package com.cunhanai.entra21.java.lista5condicionais;
import java.util.Scanner;

public class Questao01ParImpar {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String parImp1, parImp2;
			
			// PEDE UM N�MERO INTEIRO AO USU�RIO
			System.out.print("Digite um n�mero inteiro positivo: ");
			int numero = sc.nextInt();
			
			// FORMA 1 DE CALCULAR SE O N�MERO � PAR OU �MPAR E IMPRIMIR O RESULTADO
			if ((numero % 2) == 0) {
				parImp1 = "par";
			}
			else {
				parImp1 = "�mpar";
			}
			System.out.printf("O n�mero %,d � %s%n", numero, parImp1);
			
			// FORMA 2 DE CALCULAR SE O N�MERO � PAR OU �MPAR E IMPRIMIR O RESULTADO
			System.out.printf("O n�mero %,d � %s%n", numero, ((numero % 2 == 0) ? "par" : "�mpar"));
			
			// FORMA 3 DE CALCULAR SE O N�MERO � PAR OU �MPAR E IMPRIMIR O RESULTADO
			switch (numero % 2) {
			case 0:
				parImp2 = "par";
				break;
			default:
				parImp2 = "�mpar";
			}
			System.out.printf("O n�mero %,d � %s%n", numero, parImp2);
			
			sc.close();
		}
}
