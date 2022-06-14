package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao10MediaComVetores {

	/*
	 * Quest�o 10 - Ler as duas notas bimestrais para um conjunto de 10 alunos.
	 * Armazenar as notas informadas em dois vetores �Nota1� e �Nota2� do
	 * tipo real. Escreva um programa que calcule a m�dia aritm�tica simples
	 * das notas informadas armazenando o resultado em um vetor �Result�
	 * de mesmo tipo e tamanho.
	 * 
	 * Ao mostrar os resultados exibir a situa��o de cada aluno. Se a m�dia
	 * calculada for superior ou igual a 7 o aluno estar� �aprovado�, caso 
	 * contr�rio, a situa��o do aluno ser� �reproado�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeAlunos = 10;
		double[] nota1 = new double[qtdeAlunos];
		double[] nota2 = new double[qtdeAlunos];
		double[] result = new double[qtdeAlunos];
		
		for (int i = 0; i < qtdeAlunos; i++) {
			loop:
			while (true) {
				System.out.printf("%nPrimeira nota do %d� aluno: ", i+1);
				nota1[i] = sc.nextDouble();
				
				if (nota1[i] > 10 || nota1[i] < 0) {
					System.out.println("A nota precisa ser um valor entre 0 e 10!");
				}
				else {
					break loop;
				}
			}
			
			loop:
			while (true) {
				System.out.printf("Segunda nota do %d� aluno: ", i+1);
				nota2[i] = sc.nextDouble();
				
				if (nota2[i] > 10 || nota2[i] < 0) {
					System.out.println("A nota precisa ser um valor entre 0 e 10!");
				}
				else {
					break loop;
				}
			}
			
			
			result[i] = (nota1[i] + nota2[i])/2;
		}
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.printf("%nMedia aritm�tica do %d� aluno: %.2f%n", i+1, result[i]);
			
			if (result[i] >= 7) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
		}
		
		sc.close();
	}

}
