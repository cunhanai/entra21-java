package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao12TodosPares {

	/*
	 * Quest�o 12 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
	 * que verifique se "todos" os elementos do vetor A s�o pares. Se pelo
	 * menos um elemento do vetor n�o for par o processo de repeti��o para de
	 * percorrer os elementos do vetor e deve ser encerrado, como sugest�o:
	 * utilize uma vari�vel do tipo flag para atingir este prop�sito.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean par = true;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				par = true;
			}
			else {
				par = false;
				break;
			}
		}
		
		if (par) {
			System.out.println("Todos os elementos do vetor s�o pares.");
		}
		else {
			System.out.println("Nenhum ou nem todos os elementos do vetor s�o pares.");
		}

		sc.close();
	}

}
