package com.cunhanai.entra21.java.lista6repeticao.extra;

import java.util.Scanner;

public class QuestaoExtraCinema {

	/*
	 * Um cinema que possui capacidade de 100 lugares est� sempre lotado com
	 * ocupa��o total. Certo dia cada espectador respondeu a um question�rio,
	 * no que constava:
	 * 
	 *   - sua idade
	 *   - sua opini�o em rela��o ao filme, segundo:
	 *   	otimo = *****
	 *   	bom = ****
	 * 		regular = ***
	 * 		ruim = **
	 * 		pessimo = *
	 * 
	 * Escreva um programa que, lendo estes dados, calcule e imprima: 
	 *   - a quantidade de respostas �timo
	 *   - a diferenca percentual entre respostas bom e regular
	 *   - a media de idade das pessoas que responderam ruim
	 *   - a porcentagem de respostas p�ssimo e a maior idade que utilizou esta op��o
	 *   - a diferen�a de idade entre a maior idade que respondeu �timo e a maior idade
	 *   	que respondeu ruim
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int capacidadeMax = 15, idade;
		int qtdeOtimo = 0, qtdeBom = 0, qtdeRegular = 0, qtdeRuim = 0, qtdePessimo = 0;
		int maiorIdadePessimo = 0, maiorIdadeOtimo = 0, maiorIdadeRuim = 0, difIdOtimoRuim = 0;
		float mediaIdadeRuim = 0;
		double percentBomReg = 0, percentPessimo = 0;
		String opiniao;
		
		for (int i = 0; i < capacidadeMax; i++) {
			
			loop2:
			while (true) {
				System.out.print("Sua idade: ");
				idade = sc.nextInt();
				if (idade <= 0) {
					System.out.println("Idade inv�lida! Por favor, informe novamente a sua idade\n");
				}
				else {
					break loop2;
				}
			}
			
			System.out.println("Qual sua opini�o sobre o fime?");
			System.out.println("*****	�timo");
			System.out.println("****	Bom");
			System.out.println("***		Regular");
			System.out.println("**		Ruim");
			System.out.println("*		Pessimo");
			
			loop2:
			while (true) {
				System.out.print("Sua opini�o: ");
				opiniao = sc.next();
				
				switch (opiniao) {
				case "*****":
					++qtdeOtimo;
					if (idade > maiorIdadeOtimo) {
						maiorIdadeOtimo = idade;
					}
					break loop2;
				case "****":
					++qtdeBom;
					break loop2;
				case "***":
					++qtdeRegular;
					break loop2;
				case "**":
					++qtdeRuim;
					mediaIdadeRuim += idade;
					if (idade > maiorIdadePessimo) {
						maiorIdadeRuim = idade;
					}
					break loop2;
				case "*":
					++qtdePessimo;
					if (idade > maiorIdadePessimo) {
						maiorIdadePessimo = idade;
					}
					break loop2;
				default:
					System.out.println("Opini�o inv�lida! Por favor, digite os asteriscos de acordo com a sua opini�o!\n");
					break;
				}
				
			}
		}
		
		if (qtdeBom > 0 && qtdeRegular > 0) {
			percentBomReg = (qtdeBom + qtdeRegular)/((qtdeBom > qtdeRegular)? qtdeBom - qtdeRegular : qtdeRegular - qtdeBom);
		}
		
		if (qtdeRuim > 0) {
			mediaIdadeRuim /= qtdeRuim;
		}
		
		percentPessimo = (qtdePessimo*100)/capacidadeMax;
		difIdOtimoRuim = (maiorIdadeOtimo > maiorIdadeRuim)? maiorIdadeOtimo - maiorIdadeRuim : maiorIdadeRuim - maiorIdadeOtimo;
		
		System.out.printf("%n%s: %d", "Quantidade de respostas �timas", qtdeOtimo);
		System.out.printf("%n%s: %,.2f", "Diferen�a percentual entre respostas bom e regular", percentBomReg);
		System.out.printf("%n%s: %,.2f", "Idade m�dia de respostas ruins", mediaIdadeRuim);
		System.out.printf("%n%s: %,.2f", "Porcentagem de respostas p�ssimo", percentPessimo);
		System.out.printf("%n%s: %d", "Maior idade que respondeu p�ssimo", maiorIdadePessimo);
		System.out.printf("%n%s: %d", "Diferen�a entre as maiores idades que responderam �timo e ruim", difIdOtimoRuim);

		sc.close();
	}

}
