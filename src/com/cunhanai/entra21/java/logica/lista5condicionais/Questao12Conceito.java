/*
 * Questao 12 Conceito
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 12 -Fa�a um algoritmo para lero nome do Aluno, as
 * 3 notas obtidas por um aluno nas 3 verifica��es e a m�dia dos
 * exerc�cios que fazem parte da avalia��o. Calcular a m�dia de 
 * aproveitamento, usando a f�rmula abaixoe escrever o conceito 
 * do aluno de acordo com a tabela de conceitos abaixo:
 * 
 * 							N1 + N2 * 2 + N3 * 3+M�dia_dos_Exerc�cios
 * M�dia_de_Aproveitamento = -----------------------------------------
 * 												7
 * A atribui��o de conceitos obedece a tabela abaixo:
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
		System.out.print("M�dia dos exerc�cios: ");
		mediaExercicios = sc.nextDouble();
		
		// CALCULA A M�DIA DE APROVEITAMENTO PONDERADA
		media = (n1 + n2*2 + n3*3 + mediaExercicios)/7;
		
		// VERIFICA O CONCEITO DA M�DIA
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
		System.out.printf("%n%s %.1f. %s","M�dia de aproveitamento:", media, conceito);
		
		sc.close();
	}

}
