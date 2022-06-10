package com.cunhanai.entra21.java.lista6repeticao.extra;

import java.util.Scanner;

public class QuestaoExtraCinema {

	/*
	 * Um cinema que possui capacidade de 100 lugares está sempre lotado com
	 * ocupação total. Certo dia cada espectador respondeu a um questionário,
	 * no que constava:
	 * 
	 *   - sua idade
	 *   - sua opinião em relação ao filme, segundo:
	 *   	otimo = *****
	 *   	bom = ****
	 * 		regular = ***
	 * 		ruim = **
	 * 		pessimo = *
	 * 
	 * Escreva um programa que, lendo estes dados, calcule e imprima: 
	 *   - a quantidade de respostas ótimo
	 *   - a diferenca percentual entre respostas bom e regular
	 *   - a media de idade das pessoas que responderam ruim
	 *   - a porcentagem de respostas péssimo e a maior idade que utilizou esta opção
	 *   - a diferença de idade entre a maior idade que respondeu ótimo e a maior idade
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
					System.out.println("Idade inválida! Por favor, informe novamente a sua idade\n");
				}
				else {
					break loop2;
				}
			}
			
			System.out.println("Qual sua opinião sobre o fime?");
			System.out.println("*****	Ótimo");
			System.out.println("****	Bom");
			System.out.println("***		Regular");
			System.out.println("**		Ruim");
			System.out.println("*		Pessimo");
			
			loop2:
			while (true) {
				System.out.print("Sua opinião: ");
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
					System.out.println("Opinião inválida! Por favor, digite os asteriscos de acordo com a sua opinião!\n");
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
		
		System.out.printf("%n%s: %d", "Quantidade de respostas ótimas", qtdeOtimo);
		System.out.printf("%n%s: %,.2f", "Diferença percentual entre respostas bom e regular", percentBomReg);
		System.out.printf("%n%s: %,.2f", "Idade média de respostas ruins", mediaIdadeRuim);
		System.out.printf("%n%s: %,.2f", "Porcentagem de respostas péssimo", percentPessimo);
		System.out.printf("%n%s: %d", "Maior idade que respondeu péssimo", maiorIdadePessimo);
		System.out.printf("%n%s: %d", "Diferença entre as maiores idades que responderam ótimo e ruim", difIdOtimoRuim);

		sc.close();
	}

}
