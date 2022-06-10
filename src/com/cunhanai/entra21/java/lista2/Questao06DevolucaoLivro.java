/*
 * Questao 06 Devolucao Livro
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_6: A biblioteca da Faculdade Maurício de Nassau empresta gratuitamente seus 
 * livros a alunos, professores e funcionários de toda a instituição. Porém, sempre que 
 * um usuário atrasa a entrega de um livro, ele tem que pagar uma multa de R$ 2,50 por 
 * cada dia de atraso. Escreva um programa que receba como entrada a quantidade de dias 
 * de atraso do empréstimo de um livro, e exiba o valor da multa a ser paga pelo usuário.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao06DevolucaoLivro {
	public static void main(String[] args) {
		double valor, multa = 2.5;
		int diasAtraso;
		
		// PEDE OS DIAS DE ATRASO NA DEVOLUÇÃO DE LIVROS AO USUÁRIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Dias de atraso na devolução: ");
		diasAtraso = sc.nextInt();
		
		// CALCULA O VALOR DE ATRASO E O IMPRIME
		valor = diasAtraso * multa;;
		System.out.println("A multa para " +  diasAtraso + " dias de atraso é de R$ " + valor);
		
		sc.close();
	}
}
