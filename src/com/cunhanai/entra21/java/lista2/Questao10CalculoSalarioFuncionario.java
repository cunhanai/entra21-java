/*
 * Quesao 10 Calculo Salario Funcionario
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_10 :Os funcion�rios da limpeza da Faculdade Maur�cio de Nassau recebem, por filho, 
 * 3% a mais sobre o valor do sal�rio base. Elabore um algoritmo que l� o nome de um determinado
 * funcion�rio, o n�mero de horas trabalhadas por ele, o valor que recebe por hora e o n�mero de 
 * filhos que este funcion�rio possui. Ao final, exiba o sal�rio total do funcion�rio.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao10CalculoSalarioFuncionario {

	public static void main(String[] args) {
		double horasTrab, valorHora, acresPorFilho, salario, salarioTotal, acrescimo;
		int qtdeFilhos;
		String nomeFunc;
		Scanner sc = new Scanner(System.in);
		
		// PEDE AO USU�RIO O NOME DO FUNCION�RIO, A QTDE DE HORAS TRABALHADAS, VALOR DA HORA DE 
		// TRABALHO E A QUANTIDADE DE FILHOS QUE ELE TEM
		System.out.print("Nome do funcion�rio: ");;
		nomeFunc = sc.nextLine();
		System.out.print("Quantidade de horas trabalhadas por " + nomeFunc + ": ");
		horasTrab = sc.nextDouble();
		System.out.print("Valor que " + nomeFunc + " recebe por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Quantidade de filhos que " + nomeFunc + " possui: ");
		qtdeFilhos = sc.nextInt();
		
		// CALCULA O VALOR FINAL DO SAL�RIO DO FUNCION�RIO
		acresPorFilho = 0.03;
		salario = horasTrab * valorHora;
		acrescimo = acresPorFilho * qtdeFilhos * salario;
		salarioTotal = salario + acrescimo;
		
		// IMPRIME O RESULTADO
		System.out.println("O sal�rio final de " + nomeFunc + " � R$ " + salarioTotal);
		
		sc.close();
	}

}
