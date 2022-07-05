package com.cunhanai.entra21.java.oop.lista3opp.testes;

import com.cunhanai.entra21.java.oop.lista3opp.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ana", "123456", "Java");
		
		String[] disciplina = {"Java", "Desenvolvimento Humano", "Ingles"};
		float[][] notas = {{7, 8, 8.5f}, {0, 5.4f, 7}, {7, 8, 6}};
		
		aluno.setDisciplinas(disciplina);
		aluno.setNotas(notas);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Aluno %S em %s.%n", (aluno.verificarAprovacao(i) ? "aprovado" : "reprovado"), aluno.getDisciplina(i));
		}
	}

}
