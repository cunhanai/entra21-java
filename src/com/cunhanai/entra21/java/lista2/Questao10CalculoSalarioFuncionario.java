/*
 * Quesao 10 Calculo Salario Funcionario
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_10 :Os funcionários da limpeza da Faculdade Maurício de Nassau recebem, por filho, 
 * 3% a mais sobre o valor do salário base. Elabore um algoritmo que lê o nome de um determinado
 * funcionário, o número de horas trabalhadas por ele, o valor que recebe por hora e o número de 
 * filhos que este funcionário possui. Ao final, exiba o salário total do funcionário.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao10CalculoSalarioFuncionario {

	public static void main(String[] args) {
		double horasTrab, valorHora, acresPorFilho, salario, salarioTotal, acrescimo;
		int qtdeFilhos;
		String nomeFunc;
		Scanner sc = new Scanner(System.in);
		
		// PEDE AO USUÁRIO O NOME DO FUNCIONÁRIO, A QTDE DE HORAS TRABALHADAS, VALOR DA HORA DE 
		// TRABALHO E A QUANTIDADE DE FILHOS QUE ELE TEM
		System.out.print("Nome do funcionário: ");;
		nomeFunc = sc.nextLine();
		System.out.print("Quantidade de horas trabalhadas por " + nomeFunc + ": ");
		horasTrab = sc.nextDouble();
		System.out.print("Valor que " + nomeFunc + " recebe por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Quantidade de filhos que " + nomeFunc + " possui: ");
		qtdeFilhos = sc.nextInt();
		
		// CALCULA O VALOR FINAL DO SALÁRIO DO FUNCIONÁRIO
		acresPorFilho = 0.03;
		salario = horasTrab * valorHora;
		acrescimo = acresPorFilho * qtdeFilhos * salario;
		salarioTotal = salario + acrescimo;
		
		// IMPRIME O RESULTADO
		System.out.println("O salário final de " + nomeFunc + " é R$ " + salarioTotal);
		
		sc.close();
	}

}
