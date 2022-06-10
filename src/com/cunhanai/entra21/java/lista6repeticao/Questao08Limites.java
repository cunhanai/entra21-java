package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao08Limites {
	
	/*
	 * Questão 8 - Criar um programa que leia os limites inferior e superior de um intervalo e imprima 
	 * todos os números pares no intervalo aberto e seu somatório.
	 * Suponha que os números digitados são um intervalo crescente. Exemplo:
	 * 
	 * Limite inferior: 3
	 * Limite superior: 12
	 * Saída: 4 6 8 10
	 * Soma: 28
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limiteSuperior, limiteInferior, aux, soma = 0;
		String text = "";
		
		System.out.print("Limite superior (int): ");
		limiteSuperior = sc.nextInt();
		System.out.print("Limite inferior (int): ");
		limiteInferior = sc.nextInt();
		
		if (limiteInferior > limiteSuperior) {
			aux = limiteInferior;
			limiteInferior = limiteSuperior;
			limiteSuperior = aux;
		}
		
		for (int i = limiteInferior+1; i < limiteSuperior; i++) {
			if ((i % 2) == 0) {
				text += String.valueOf(i) + " ";
				soma += i;
			}
		}
		
		System.out.printf("%nNúmeros pares no intervalo aberto de %d e %d: %s", limiteSuperior, limiteInferior, text);
		System.out.printf("%nSoma desses números: %d", soma);
		
		sc.close();
	}

}
