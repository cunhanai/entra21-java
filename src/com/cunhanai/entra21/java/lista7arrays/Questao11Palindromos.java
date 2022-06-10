package lista7arrays;

import java.util.Scanner;

public class Questao11Palindromos {

	
	/*
	 * Quest�o 11 - N�meros pal�ndromos s�o aqueles que escritos da direita para a
	 * esquerda t�m o mesmo valor quando escritos da esquerda para a
	 * direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
	 * programa que verifique se um dado vetor A de 10 elementos inteiros �
	 * um pal�ndromo, ou seja, se o primeiro elemento do vetor e igual ao
	 * �ltimo, se o segundo elemento do vetor � igual ao pen�ltimo e assim
	 * por diante at� verificar todos os elementos ou chegar a conclus�o que
	 * o vetor n�o � um pal�ndromo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = false;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf("%nValor da posi��o %d: ", i);
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
		
		System.out.printf("%n%s %s %s", "O vetor A", ((palindromo == true)? "�" : "n�o �"), "um pal�ndromo.");
		
		sc.close();
	}

}
