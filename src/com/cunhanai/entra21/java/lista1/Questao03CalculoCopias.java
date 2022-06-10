/*
 * Questao 03 Calculo Copias
 * @date Maio 2022
 * @author 
 * 
 * Questão_3: Sabendo que a Copiadora da Faculdade Maurício de Nassau cobra R$ 0,08 
 * por cada cópia feita, escreva um programa que receba como entrada a quantidade de
 * folhas de um livro e exiba o valor total a ser pago para copiá-lo.
 * (Lembrete: cada folha corresponde a duas páginas, frente e verso).
 */

package com.cunhanai.entra21.java.lista1;
import java.util.Scanner;

public class Questao03CalculoCopias {
	
	public static void main(String[] args) {
		double qtdeFolhas, total, valorCopia = 0.08;
		int frenteVerso = 2;
		
		// PEDE A QUANTIDADE DE FOLHAS A SER IMPRESSA AO USUÁRIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de folhas: ");
		qtdeFolhas = sc.nextDouble();
		
		// CALCULA O VALOR A SER PAGO E O IMPRIME
		total = qtdeFolhas * valorCopia * frenteVerso;
		System.out.println("O valor a ser pago é: R$ " + total);
		
		sc.close();
	}
}
