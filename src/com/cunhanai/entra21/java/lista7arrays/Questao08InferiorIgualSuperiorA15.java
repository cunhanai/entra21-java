package lista7arrays;

import java.util.Scanner;

public class Questao08InferiorIgualSuperiorA15 {

	/*
	 * Quest�o 8 - Criar um vetor A com 10 elementos inteiros. Escrever um programa
	 * que calcule e escreva:
	 * 		a) a soma de elementos armazenados neste vetor que s�o inferiores a 15;
	 * 		b) a quantidade de elementos armazenados no vetor que s�o iguais a 15;
	 * 		c) a m�dia dos elementos armazenados no vetor que s�o superiores a 15.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaMenor15 = 0, qtdeIgual15 = 0, somaMaior15 = 0, qtdeMaior15 = 0, aI;
		double media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("Valor da posi��o %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			aI = vetorA[i];
			if (aI < 15) {
				somaMenor15 += aI;
			}
			else if (aI == 15) {
				++qtdeIgual15;
			}
			else {
				somaMaior15 += aI;
				++qtdeMaior15;
			}
			
			if (qtdeMaior15 > 0) {
				media = somaMaior15 / qtdeMaior15;
			}
		}
		
		System.out.println("Soma dos elementos menores que 15: " + somaMenor15);
		System.out.println("Quantidade de elementos iguais a 15: " + qtdeIgual15);
		System.out.println("M�dia dos elementos maiores que 15: " + media);
		
		sc.close();
	}

}
