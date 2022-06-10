package lista7arrays;

import java.util.Scanner;

public class Questao14VetorCJuncaoAeB {

	/*
	 * Quest�o 14 � Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
	 * sendo este a jun��o dos dois outros vetores. Os primeiros 10 elementos de C dever�o receber 
	 * os elementos de A e os �ltimos elementos C dever�o receber os elementos de B. Desta forma, 
	 * C dever� ter o dobro de elementos de A e B, ou seja, 20 elementos	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[vetorA.length + vetorB.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d do primeiro vetor: ", i);
			vetorA[i] = sc.nextDouble();
			
			vetorC[i] = vetorA[i];
		}
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d do segundo vetor: ", i);
			vetorB[i] = sc.nextDouble();
			
			vetorC[vetorA.length+i] = vetorB[i];
		}
		
		// sa�das
		System.out.print("\nValores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + (i == (vetorA.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + (i == (vetorB.length - 1)? "." : ", "));
		}
		
		System.out.print("\nValores do vetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + (i == (vetorC.length - 1)? "." : ", "));
		}
		
		sc.close();
	}

}
