package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao04MediaAltura {
	
	/*
	 * Questão 4 - Foi feita uma pesquisa entre os habitantes de uma região e
	 * coletados os dados de altura e sexo (0=masc, 1=fem) das pessoas.
	 * Faça um programa que leia 5 dados diferentes e informe:
	 * 		a maior e a menor altura encontradas;
	 * 		a média de altura das mulheres;
	 * 		a média de altura da população;
	 * 		o percentual de homens na população.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sexo, fem = 0, masc = 0;
		double altura, maior, menor, sumFem = 0, mediaFem, sumPop = 0, mediaPop, percent;
		maior = Double.MIN_NORMAL;
		menor = Double.MAX_VALUE; 
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%nSexo do habitante %d (0 = masc, 1 = fem): ", i);
			sexo = sc.nextInt();
			
			while (sexo != 0 && sexo != 1) {
				System.out.printf("Sexo inválido, digite 0 para masculino ou 1 para feminino: ");
				sexo = sc.nextInt();
			}
			System.out.printf("Altura do habitante %d: ", i);
			altura = sc.nextDouble();
			
			if (altura > maior) {
				maior = altura;
			}
			
			
			if (altura < menor) {
				menor = altura;
			}
			
			if (sexo == 1) {
				++fem;
				sumFem += altura;
			}
			else {
				++masc;
			}
			
			sumPop += altura;
		}
		mediaFem = sumFem / fem;
		mediaPop = sumPop/5;
		percent = (100 * masc)/5;
		
		System.out.printf("%nA maior altura foi de %.2fm, e a menor de %.2fm.", maior, menor);
		System.out.printf("%nA média de altura das mulheres é de %.2fm.", mediaFem);
		System.out.printf("%nA média de altura da população entrevistada é de %.2fm.", mediaPop);
		System.out.printf("%nO porcentual de homens na população entrevistada é de %.1f%%.", percent);
		
		sc.close();
	}

}
