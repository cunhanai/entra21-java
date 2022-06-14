/*
 * Questao 18 Vogal Consoante
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o 18 � Fa�a um programa que o usu�rio entra com uma letra,
 * e o programa informa se � uma vogal ou consoante.
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao18VogalConsoante {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		
		// PEDE UMA LETRA AO USU�RIO
		System.out.print("Letra: ");
		letra = Character.toLowerCase(sc.next().charAt(0));
		
		// VERIFICA SE A LETRA � VOGAL OU CONSOANTE E IMPRIME
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.printf("%n%C � vogal.", letra);
		}
		else {
			System.out.printf("%n%C � consoante.", letra);
		}
		
		sc.close();
	}

}
