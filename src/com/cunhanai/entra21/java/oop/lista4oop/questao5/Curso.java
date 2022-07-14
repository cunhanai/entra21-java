/**
 * Curso
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 5. Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um Professor, que possui nome, departamento e email. Cada 
 * Curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, 
 * matricula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que preça para o usuário entrar com as 4 notas de cada aluno. Ao 
 * final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7), e qual é a média da turma
 */


package com.cunhanai.entra21.java.oop.lista4oop.questao5;

import java.util.Calendar;

public class Curso {

	private String nome;
	private Calendar horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public Curso(String nome, Professor professor, Aluno[] alunos) {
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
	}

	public Curso(String nome, Calendar horario, Professor professor, Aluno[] alunos) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public float calcularMediaTurma() {
		float media = 0;
		for (Aluno aluno : alunos) {
			media += aluno.calcularMedia();
		}
		media /= alunos.length;
		return media;
	}

}
