package lista7arrays;

import java.util.Scanner;

public class Questao02VetorBAVezesIECResto2 {

	/*
	 * Questão 2 - Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
	 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
	 * ser o respectivo elemento de A multiplicado por sua posição (ou
	 * índice), ou seja:
	 * B[i] = A[i] * i.
	 * 
	 * Construir um vetor C de
	 * mesmo tipo e tamanho que A, sendo que cada elemento do vetor C deverá
	 * ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
	 * seja: C[i] := A[i] % 2.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
			vetorB[i] = vetorA[i] * i;
			vetorC[i] = vetorA[i] % 2;
		}
		
		System.out.print("\n\nValor do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ((i == vetorA.length-1)? "." : ", "));
		}
		
		System.out.print("\nValor do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + ((i == vetorB.length-1)? "." : ", "));
		}
		
		System.out.print("\nValor do vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + ((i == vetorA.length-1)? "." : ", "));
		}
		
		sc.close();
	}

}
