/*
 * Questao 12 Conceito
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 12 -Faça um algoritmo para lero nome do Aluno, as
 * 3 notas obtidas por um aluno nas 3 verificações e a média dos
 * exercícios que fazem parte da avaliação. Calcular a média de 
 * aproveitamento, usando a fórmula abaixoe escrever o conceito 
 * do aluno de acordo com a tabela de conceitos abaixo:
 * 
 * 							N1 + N2 * 2 + N3 * 3+Média_dos_Exercícios
 * Média_de_Aproveitamento = -----------------------------------------
 * 												7
 * A atribuição de conceitos obedece a tabela abaixo:
 * 
 * 		MDA				Conceito
 * 		>= 9,0			A
 * 		>= 7,5 e < 9	B
 * 		>= 6 e < 7,5	C
 * 		< 6				D
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao12Conceito {

	public static void main(String[] args) {
		double n1, n2, n3, mediaExercicios, media;
		String conceito;
		Scanner sc = new Scanner(System.in);
		
		// PEDE AS NOTAS DO ALUNO
		System.out.print("Nota 1: ");
		n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		n3 = sc.nextDouble();
		System.out.print("Média dos exercícios: ");
		mediaExercicios = sc.nextDouble();
		
		// CALCULA A MÉDIA DE APROVEITAMENTO PONDERADA
		media = (n1 + n2*2 + n3*3 + mediaExercicios)/7;
		
		// VERIFICA O CONCEITO DA MÉDIA
		if (media >= 9) {
			conceito = "Conceito A";
		}
		else if (media >= 7.5) {
			conceito = "Conceito B";
		}
		else if (media >= 6) {
			conceito = "Conceito C";
		}
		else {
			conceito = "Conceito D";
		}
		
		// IMPRIME O RESULTADO
		System.out.printf("%n%s %.1f. %s","Média de aproveitamento:", media, conceito);
		
		sc.close();
	}

}
