package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao14CDs {
	
	/*
	 * Questão 14 – Faça um programa que calcule o valor total investido por um colecionador de em 
	 * sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a 
	 * quantidade de CDs e o valor para cada um deles
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeCDs;
		double valor, sum = 0, valorMedio;
		
		System.out.print("Quantidade de CDs: ");
		qtdeCDs = sc.nextInt();
		
		for (int i = 1; i <= qtdeCDs; i++) {
			System.out.printf("Valor gasto no %d° CD: ", i);
			valor = sc.nextDouble();
			sum += valor;
		}
		valorMedio = sum /qtdeCDs;
		System.out.printf("%n%s %s %,.2f", "Valor médio gasto nos CDs:", "R$", valorMedio);
		
		sc.close();
	}

}
