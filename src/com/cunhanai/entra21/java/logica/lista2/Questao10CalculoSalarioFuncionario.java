/*
 * Quesao 10 Calculo Salario Funcionario
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_10: Os funcionarios da limpeza da Faculdade Mauricio de Nassau recebem, por filho, 
 * 3% a mais sobre o valor do salario base. Elabore um algoritmo que le o nome de um determinado
 * funcionario, o numero de horas trabalhadas por ele, o valor que recebe por hora e o numero de 
 * filhos que este funcionario possui. Ao final, exiba o salario total do funcionario.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao10CalculoSalarioFuncionario {

	public static void main(String[] args) {
		double horasTrab, valorHora, acresPorFilho, salario, salarioTotal, acrescimo;
		int qtdeFilhos;
		String nomeFunc;
		Scanner sc = new Scanner(System.in);
		
		// PEDE AO USUARIO O NOME DO FUNCIONARIO, A QTDE DE HORAS TRABALHADAS, VALOR DA HORA DE 
		// TRABALHO E A QUANTIDADE DE FILHOS QUE ELE TEM
		System.out.print("Nome do funcionario: ");;
		nomeFunc = sc.nextLine();
		System.out.print("Quantidade de horas trabalhadas por " + nomeFunc + ": ");
		horasTrab = sc.nextDouble();
		System.out.print("Valor que " + nomeFunc + " recebe por hora: ");
		valorHora = sc.nextDouble();
		System.out.print("Quantidade de filhos que " + nomeFunc + " possui: ");
		qtdeFilhos = sc.nextInt();
		
		// CALCULA O VALOR FINAL DO SALARIO DO FUNCIONARIO
		acresPorFilho = 0.03;
		salario = horasTrab * valorHora;
		acrescimo = acresPorFilho * qtdeFilhos * salario;
		salarioTotal = salario + acrescimo;
		
		// IMPRIME O RESULTADO
		System.out.println("O salário final de " + nomeFunc + ": R$ " + salarioTotal);
		
		sc.close();
	}

}
