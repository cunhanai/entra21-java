package lista7arrays;

import java.util.Scanner;

public class Questao01VetorBQuadradoDeA {
	
	/*
	 * Questão 1 - Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
	 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
	 * ser o quadrado do respectivo elemento de A, ou seja:
	 * B[i] = A[i] * A[i]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("%s %d: ", "Valor da posição", i);
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.print("\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + (i == (vetorA.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + (i == (vetorB.length - 1)? "." : ", "));
		}
		sc.close();
		
	}

}
