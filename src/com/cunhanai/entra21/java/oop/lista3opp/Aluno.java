/**
 * Aluno
 * @date 2022-07-01
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
 */

package com.cunhanai.entra21.java.oop.lista3opp;

public class Aluno {

	private String nome; // nome do aluno
	private String matricula; // numero de matricula do ano
	private String curso; // curso que esta cursando
	private String[] disciplinas = new String[3]; // nome de 3 disciplinas que esta cursando
	private float[][] notas = new float[disciplinas.length][3]; // notas para as 3 respectivas disciplinas, i = indice
																// disciplinas, j = notas

	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}
	
	public String getDisciplina(int i) {
		return disciplinas[i];
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public float[][] getNotas() {
		return notas;
	}

	public void setNotas(float[][] notas) {
		this.notas = notas;
	}

	/**
	 * Verifica se o aluno foi aprovado em uma determinada disciplina.
	 * 
	 * @param id e o indice da disciplina na matriz disciplinas.
	 * @retuns <code>boolean</code> indicando se o aluno foi aprovado ou nao.
	 */
	public boolean verificarAprovacao(int idDisciplina) {
		float media = 0;
		for (int j = 0; j < this.notas[idDisciplina].length; j++) {
			// PERCORRE TODAS AS NOTAS DA DISCIPLINA E AS SOMA
			media += this.notas[idDisciplina][j];
		}

		// FAZ A MEDIA DAS NOTAS
		media /= this.notas[idDisciplina].length;

		// RETORNA SE FOI APROVADO OU NAO
		return (media >= 7);
	}
}
