package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao15CodigoSenha {
	
	/*
	 * Questao 15 � Fa�a um programa que leia o c�digo e a senha de um usu�rio. N�o aceite a 
	 * senha igual ao c�digo do usu�rio. Mostrando uma mensagem de erro e voltando a pedir as 
	 * informa��es.
	 * Obs.: C�digo e senha n�meros positivos inteiros
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, senha;
		
		while (true) {
			System.out.print("C�digo: ");
			codigo = sc.nextInt();
			System.out.print("Senha: ");
			senha = sc.nextInt();
			
			if (codigo == senha) {
				System.out.print("C�digo e senha n�o podem ser iguais! Por favor, digite novamente.\n\n");
			}
			else {
				break;
			}
		}
		System.out.println("C�digo e senha cadastrados com sucesso!");
		
		sc.close();
	}

}
