package lista7arrays;

import java.util.Scanner;

public class Questao09IdadeSuperior35 {

	/*
	 * Questão 9 - Ler um vetor A com 10 elementos inteiros correspondentes as idades
	 * de um grupo de pessoas. Escreva um programa que determine e
	 * escreva a quantidade de pessoas que possuem idade superior a 35
	 * anos.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int idadeSup35 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			loop2:
			while (true) {
				System.out.printf("Digite a %dª idade: ", i+1);
				vetorA[i] = sc.nextInt();
				
				if (vetorA[i] < 0) {
					System.out.println("Idade não pode ser menor que zero! Por favor, digite novamente.\n");
				}
				else {
					break loop2;
				}
			}
			
			if (vetorA[i] > 35) {
				++idadeSup35;
			}
		}
		System.out.println("Quantidade de pessoas com idade superior a 35: " + idadeSup35);
		
		sc.close();
	}

}
