package com.cunhanai.entra21.java.logica.lista6repeticao;

import java.util.Scanner;

public class Questao15CodigoSenha {
	
	/*
	 * Questao 15 – Faça um programa que leia o código e a senha de um usuário. Não aceite a 
	 * senha igual ao código do usuário. Mostrando uma mensagem de erro e voltando a pedir as 
	 * informações.
	 * Obs.: Código e senha números positivos inteiros
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, senha;
		
		while (true) {
			System.out.print("Código: ");
			codigo = sc.nextInt();
			System.out.print("Senha: ");
			senha = sc.nextInt();
			
			if (codigo == senha) {
				System.out.print("Código e senha não podem ser iguais! Por favor, digite novamente.\n\n");
			}
			else {
				break;
			}
		}
		System.out.println("Código e senha cadastrados com sucesso!");
		
		sc.close();
	}

}
