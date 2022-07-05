package com.cunhanai.entra21.java.oop.lista3construtores.gestaoacademica.testes;

import java.util.Scanner;

import com.cunhanai.entra21.java.oop.lista3construtores.gestaoacademica.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nome e cpf");
		Pessoa pessoa = new Pessoa(sc.next(), sc.next());
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		
		sc.close();
	}

}
