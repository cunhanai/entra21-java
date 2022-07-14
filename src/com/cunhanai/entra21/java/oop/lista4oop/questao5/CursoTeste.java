/**
 * Curso Teste
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para as classes Curso, Professor e Aluno da questao 2.
 */

package com.cunhanai.entra21.java.oop.lista4oop.questao5;

public class CursoTeste {

	public static void main(String[] args) {
		/*
		 * Escreva um programa teste que crie um Curso com 5 alunos, e que preça para o
		 * usuário entrar com as 4 notas de cada aluno. Ao final, imprima a média de
		 * cada aluno, se o mesmo está aprovado (media maior ou igual a 7), e qual é a
		 * média da turma
		 */
		
		// INSTANCIANDO O PROFESSOR
		Professor professor = new Professor("Elana", "Informatica", "elana@informatica.com");
		
		// INSTANCIANDO OS ALUNOS
		Aluno[] alunos = new Aluno[5];
		alunos[0] = new Aluno("Ana", "111111");
		alunos[1] = new Aluno("Julia", "222222");
		alunos[2] = new Aluno("Heloisa", "333333");
		alunos[3] = new Aluno("Nathan", "444444");
		alunos[4] = new Aluno("Jota", "555555");
		
		// INSTANCIANDO CURSO
		Curso curso = new Curso("Java", professor, alunos);
		
		// NOTAS
		// Criando notas
		float[] notasA1 = {5, 7.5f, 8, 4};
		float[] notasA2 = {9, 9.5f, 8, 7.75f};
		float[] notasA3 = {3.5f, 5, 7, 2};
		float[] notasA4 = {8, 6.6f, 9.25f, 6};
		float[] notasA5 = {7.5f, 8, 10, 9};
		
		// Adicionando notas
		alunos[0].setNotas(notasA1);
		alunos[1].setNotas(notasA2);
		alunos[2].setNotas(notasA3);
		alunos[3].setNotas(notasA4);
		alunos[4].setNotas(notasA5);
		
		// PRINT
		// Printando o curso
		System.out.println("Curso: " + curso.getNome());
		System.out.println("Professor: " + professor.getNome() + "\nE-mail: " + professor.getEmail());
		System.out.println("\n======<ALUNOS>======");
		
		// Printando dados dos alunos
		for (Aluno aluno : alunos) {
			System.out.println("\n---------------------");
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Matricula: " + aluno.getMatricula());
			
			// Printando notas
			int i = 1;
			for (float nota : aluno.getNotas()) {
				System.out.printf("%nNota %d: %.2f", i, nota);
				i++;
			}
			
			// Verificando aprovacao
			System.out.println("\n\nAluno " + (aluno.verificarAprovacao() ? "aprovado." : "reprovado."));
		}
		
		// Printando media da turma
		System.out.println("=================");
		System.out.printf("%nMedia da turma: %.2f", curso.calcularMediaTurma());
	}

}
