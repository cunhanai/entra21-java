package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao16ValidarInformacoes {
	
	/*
	 * Questao 16 � Fa�a um programa que leia o nome do usu�rio e valide as seguintes 
	 * informa��es:
	 * Idade entre 0 e 100 anos
	 * Sal�rio: Maior que zero
	 * Sexo: �f� ou �m�
	 * Estado civil: �s�, �c�, �v� �d�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, sexoStr, estadoStr, genEstadoStr;
		int idade = 0;
		double salario = 0;
		char sexo = 'x', estadoCivil = 'x';
		
		System.out.print("Nome: ");
		nome = sc.next();
		
		while (true) {
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			if (idade >= 0 && idade <= 100) {
				break;
			}
			else {
				System.out.println("Idade inv�lida! Por favor, digite um valor entre 0 e 100!\n");
			}
		}
		
		while (true) {
			System.out.print("Sal�rio: ");
			salario = sc.nextDouble();
			
			if (salario <= 0) {
				System.out.println("Sal�rio n�o pode ser igual nem menor a zero!\n");
			}
			else {
				break;
			}
		}
		
		while (true) {
			System.out.print("Sexo (f/m): ");
			sexo = Character.toLowerCase(sc.next().charAt(0));
			
			if (sexo != 'f' && sexo != 'm') {
				System.out.println("Sexo inv�lido! Digite 'f' para feminino e 'm' para masculino!\n");
			}
			else {
				break;
			}
		}

		while (true) {
			System.out.println("\nESTADO CIVIL");
			System.out.println("\'s\' para solteiro(a)");
			System.out.println("\'c\' para casado(a)");
			System.out.println("\'v\' para vi�vo(a)");
			System.out.println("\'d\' para divorciado(a)");
			System.out.print("\nEstado civil (s/c/v/d): ");
			estadoCivil = Character.toLowerCase(sc.next().charAt(0));
			
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				System.out.println("Estado c�vil precisa ser um dos valores dispon�veis!");
			}
			else {
				break;
			}
		}
		sexoStr = (sexo == 'f')? "mulher" : "homem";
		estadoStr = (estadoCivil == 's')? "solteiro" : (estadoCivil == 'c')? "casado" : (estadoCivil == 'v')? "vi�vo" : "divorciado";
		genEstadoStr = (sexo == 'f')? estadoStr.substring(0, (estadoStr.length()-1)) + "a" : estadoStr;
		System.out.printf("%n%S, voc� tem %d anos, � %s, %s e ganha R$ %,.2f.", nome, idade, sexoStr, genEstadoStr, salario);
		
		sc.close();
	}

}
