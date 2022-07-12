package com.entra21.cursojavamanha.oop.exerciciospratica.passagemvalorreferencia;

import java.util.Scanner;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Jose1", "1234", "Java");
		int valor =10;
		
		System.out.println("******** VALORES ORIGINAIS ");
		
		//System.out.println(aluno);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNomeCurso());
		System.out.println(valor);
		
		System.out.println("******* EXEMPLO 1");
		
		testePassagemValorReferencia(valor, aluno);
		
		//System.out.println(" DEPOIS DO MÉTODO");
		//System.out.println(aluno);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNomeCurso());
		System.out.println(valor);
		
		System.out.println("******* EXEMPLO 2");
		
		testePassagemValorReferencia2(valor, aluno);
		
		//System.out.println(aluno);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNomeCurso());
		System.out.println(valor);
		
		
	}
	
	private static void testePassagemValorReferencia(int valor, Aluno aluno) {
		int novovalor = valor + 10;
		valor = novovalor;
		
		aluno = new Aluno("Jose2", "12365", "HTML");
		//System.out.println(" DENTRO DO MÉTODO");
		//System.out.println(aluno);
		//System.out.println(valor);
		
	}
	
	private static void testePassagemValorReferencia2(int valor, Aluno aluno) {
		int novovalor = valor + 10;
		valor = novovalor;
		
		aluno.setNome("Jose" + valor);
		//System.out.println(aluno);
		//System.out.println(valor);
		
	}
}