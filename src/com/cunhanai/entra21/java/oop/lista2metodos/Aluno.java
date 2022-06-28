/*
 * Aluno
 * @date 2022-06-24
 * @author Ana Julia da Cunha - Entra21
 * 
 * 3. Escreva uma classe para representar um Aluno. Adicione atributos 
 * relacionados às características de um Aluno, como nome, matricula, 
 * curso que está matriculado, nome de 3 disciplinas que está cursando 
 * e as notas dessas 3 disciplinas. Desenvolva um método para verificar 
 * se o aluno está aprovado (nota maior ou igual a 7) em uma 
 * determinada disciplina. Escreva um programa para testar essa classe, 
 * que pede as informações do aluno ao usuário e ao final informa o 
 * nome das disciplinas, mostra as notas e mostra se o aluno foi 
 * aprovado ou não.
 * 
 * OBS.: PROF HELOISA, COMO COLOQUEI OS TESTES EM OUTRO PACKAGE, ESTAVA DANDO ERRO COM
 * A VISIBILIDADE DAS VARIAVEIS, ENTAO O ECLIPSE DISSE PARA EU MUDAR TODOS OS ATRIBUTOS
 * E METODOS PARA PUBLIC
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class Aluno {
	
	public String nome; // nome do aluno
	public String matricula; // numero de matricula do ano
	public String curso; // curso que esta cursando
	public String[] disciplinas = new String[3]; // nome de 3 disciplinas que esta cursando
	public float[][] notas = new float[3][3]; // notas para as 3 respectivas disciplinas, i = indice disciplinas, j = notas
	
	/**
	 * Verifica se o aluno foi aprovado em uma determinada disciplina.
	 * @param id e o indice da disciplina na matriz disciplinas.
	 * @retuns <code>boolean</code> indicando se o aluno foi aprovado ou nao.
	 */
	public boolean verificarAprovacao(int id) {
		float media = 0;
		for (int j = 0; j < notas[id].length; j++) {
			// PERCORRE TODAS AS NOTAS DA DISCIPLINA E AS SOMA
			media += notas[id][j];
		}
		
		// FAZ A MEDIA DAS NOTAS
		media /= notas[id].length;

		// RETORNA SE FOI APROVADO OU NAO
		return (media >= 7); 
	}
}
