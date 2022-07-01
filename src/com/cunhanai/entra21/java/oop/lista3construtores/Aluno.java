/**
 * Aluno
 * @date 2022-07-01
 * @author Ana Julia da Cunha - Entra21
 * 
 * 3. Escreva uma classe para representar um Aluno. Adicione atributos 
 * relacionados �s caracter�sticas de um Aluno, como nome, matricula, 
 * curso que est� matriculado, nome de 3 disciplinas que est� cursando 
 * e as notas dessas 3 disciplinas. Desenvolva um m�todo para verificar 
 * se o aluno est� aprovado (nota maior ou igual a 7) em uma 
 * determinada disciplina. Escreva um programa para testar essa classe, 
 * que pede as informa��es do aluno ao usu�rio e ao final informa o 
 * nome das disciplinas, mostra as notas e mostra se o aluno foi 
 * aprovado ou n�o.
 */

package com.cunhanai.entra21.java.oop.lista3construtores;

public class Aluno {
	
	private String nome; // nome do aluno
	private String matricula; // numero de matricula do ano
	private String curso; // curso que esta cursando
	private String[] disciplinas = new String[3]; // nome de 3 disciplinas que esta cursando
	private float[][] notas = new float[disciplinas.length][3]; // notas para as 3 respectivas disciplinas, i = indice disciplinas, j = notas
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno(String nome, String matricula, String curso) {

	}
}
