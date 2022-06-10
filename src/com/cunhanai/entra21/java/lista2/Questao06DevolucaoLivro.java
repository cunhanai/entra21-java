/*
 * Questao 06 Devolucao Livro
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_6: A biblioteca da Faculdade Maur�cio de Nassau empresta gratuitamente seus 
 * livros a alunos, professores e funcion�rios de toda a institui��o. Por�m, sempre que 
 * um usu�rio atrasa a entrega de um livro, ele tem que pagar uma multa de R$ 2,50 por 
 * cada dia de atraso. Escreva um programa que receba como entrada a quantidade de dias 
 * de atraso do empr�stimo de um livro, e exiba o valor da multa a ser paga pelo usu�rio.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao06DevolucaoLivro {
	public static void main(String[] args) {
		double valor, multa = 2.5;
		int diasAtraso;
		
		// PEDE OS DIAS DE ATRASO NA DEVOLU��O DE LIVROS AO USU�RIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Dias de atraso na devolu��o: ");
		diasAtraso = sc.nextInt();
		
		// CALCULA O VALOR DE ATRASO E O IMPRIME
		valor = diasAtraso * multa;;
		System.out.println("A multa para " +  diasAtraso + " dias de atraso � de R$ " + valor);
		
		sc.close();
	}
}
