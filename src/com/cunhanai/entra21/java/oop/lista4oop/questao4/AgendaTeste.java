/**
 * Agenda Teste
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para as classes Agenda e Contato do ecercicio 4.
 */

package com.cunhanai.entra21.java.oop.lista4oop.questao4;

import java.util.Scanner;

public class AgendaTeste {

	public static void main(String[] args) {
		
		String nome;
		int fone;
		String email;
		Contato[] contatos = new Contato[3];
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome da Agenda: ");
		String nomeAgenda = sc.nextLine();

		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%nNome %d: ", i+1);
			nome = sc.next();
			System.out.printf("Telefone %d: ", i+1);
			fone = sc.nextInt();
			System.out.printf("Email %d: ", i+1);
			email = sc.next();
			
			Contato contato = new Contato(nome, fone, email);	
			contatos[i] = contato;
		}
		
		// CRIA A AGENDA
		Agenda agenda = new Agenda(nomeAgenda, contatos);
		
		// IMPRIME
		System.out.println();
		System.out.println(agenda);
		
		sc.close();
	}

}
