/*
 * Questao 06 Devolucao Livro
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_6: A biblioteca da Faculdade Mauricio de Nassau empresta gratuitamente seus 
 * livros a alunos, professores e funcionarios de toda a instituicao. Porem, sempre que 
 * um usuario atrasa a entrega de um livro, ele tem que pagar uma multa de R$ 2,50 por 
 * cada dia de atraso. Escreva um programa que receba como entrada a quantidade de dias 
 * de atraso do emprestimo de um livro, e exiba o valor da multa a ser paga pelo usuario.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao06DevolucaoLivro {
	public static void main(String[] args) {
		double valor, multa = 2.5;
		int diasAtraso;
		
		// PEDE OS DIAS DE ATRASO NA DEVOLUCAO DE LIVROS AO USUARIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Dias de atraso na devolucaoo: ");
		diasAtraso = sc.nextInt();
		
		// CALCULA O VALOR DE ATRASO E O IMPRIME
		valor = diasAtraso * multa;;
		System.out.println("A multa para " +  diasAtraso + " dias de atraso: R$ " + valor);
		
		sc.close();
	}
}
