package com.cunhanai.entra21.java.logica.lista7array;

import java.util.Scanner;

public class Questao12TodosPares {

	/*
	 * Questão 12 - Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
	 * que verifique se "todos" os elementos do vetor A são pares. Se pelo
	 * menos um elemento do vetor não for par o processo de repetição para de
	 * percorrer os elementos do vetor e deve ser encerrado, como sugestão:
	 * utilize uma variável do tipo flag para atingir este propósito.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean par = true;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
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
			System.out.println("Todos os elementos do vetor são pares.");
		}
		else {
			System.out.println("Nenhum ou nem todos os elementos do vetor são pares.");
		}

		sc.close();
	}

}
