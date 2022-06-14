/*
 * Questao 18 Vogal Consoante
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão 18 – Faça um programa que o usuário entra com uma letra,
 * e o programa informa se é uma vogal ou consoante.
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao18VogalConsoante {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		
		// PEDE UMA LETRA AO USUÁRIO
		System.out.print("Letra: ");
		letra = Character.toLowerCase(sc.next().charAt(0));
		
		// VERIFICA SE A LETRA É VOGAL OU CONSOANTE E IMPRIME
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.printf("%n%C é vogal.", letra);
		}
		else {
			System.out.printf("%n%C é consoante.", letra);
		}
		
		sc.close();
	}

}
