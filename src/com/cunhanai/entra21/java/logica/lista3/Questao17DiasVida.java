/*
 * Questao 17 Dias Vida
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao_17: Fa�a um algoritmo que leia o nome e a idade de uma pessoal. Determine 
 * quantos dias aproximadamente esta pessoa j� viveu. Escreva o nome da pessoa e o 
 * n�mero de dias vividos
 */

package com.cunhanai.entra21.java.logica.lista3;
import java.util.Scanner;

public class Questao17DiasVida {

	public static void main(String[] args) {
		int idade, dias;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O NOME E A IDADE DO USU�RIO
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(sc.nextLine());
		
		// CALCULA A QUANTIDADE DE DIAS DE VIDA APROXIMADA E A IMPRIME
		dias = idade * 365;
		System.out.println(nome + " j� viveu aproximadamente " + dias + " dias.");
		
		sc.close();
	}

}
