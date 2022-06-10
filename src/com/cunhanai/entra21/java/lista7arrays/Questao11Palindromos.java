package lista7arrays;

import java.util.Scanner;

public class Questao11Palindromos {

	
	/*
	 * Questão 11 - Números palíndromos são aqueles que escritos da direita para a
	 * esquerda têm o mesmo valor quando escritos da esquerda para a
	 * direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
	 * programa que verifique se um dado vetor A de 10 elementos inteiros é
	 * um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
	 * último, se o segundo elemento do vetor é igual ao penúltimo e assim
	 * por diante até verificar todos os elementos ou chegar a conclusão que
	 * o vetor não é um palíndromo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = false;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("%nValor da posição %d: ", i);
			vetorA[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == vetorA[vetorA.length-1-i]) {
				palindromo = true;
			}
			else {
				palindromo = false;
				break;
			}
		}
		
		System.out.printf("%n%s %s %s", "O vetor A", ((palindromo == true)? "é" : "não é"), "um palíndromo.");
		
		sc.close();
	}

}
