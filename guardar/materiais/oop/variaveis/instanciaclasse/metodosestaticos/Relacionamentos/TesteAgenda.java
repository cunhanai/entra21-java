package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Entre com o nome da Agenda");
		String nome = scan.nextLine();
		Agenda agenda = new Agenda(nome);
		//Agenda agenda = new Agenda();
		//agenda.setNome(nome);
		
		Contato[] contato = new Contato[3];
		for(int i =0;i < 3; i++) {
			System.out.println("Entre com as informações do contato" + (i +1));
			Contato c = new Contato();
				
			System.out.println("Entre com o Nome");
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Entre com o Telefone");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Entre com o Email");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contato[i] = c;
		}
		
		agenda.setContato(contato);
		
		if(agenda != null){
		System.out.println(agenda.obterInfo());	
			
		}
		
	}

}
