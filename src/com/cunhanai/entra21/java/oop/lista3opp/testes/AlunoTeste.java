/**
 * Aluno Teste
 * @date 2022-07-01
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classe Aluno, do exercicio 3.
 */

package com.cunhanai.entra21.java.oop.lista3opp.testes;

import com.cunhanai.entra21.java.oop.lista3opp.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		// CRIA UM OBJETO PARA ALUNO
		Aluno aluno = new Aluno("Ana", "123456", "Java");

		// DEFINE AS DISCIPLINAS E AS NOTAS DO ALUNO
		String[] disciplina = { "Java", "Desenvolvimento Humano", "Ingles" };
		float[][] notas = { { 7, 8, 8.5f }, { 0, 5.4f, 7 }, { 7, 8, 6 } };

		// SETTA AS DISCIPLINAS E SUAS RESPECTIVAS NOTAS
		aluno.setDisciplinas(disciplina);
		aluno.setNotas(notas);

		// IMPRIME A DISCIPLINA E SE O ALUNO FOI APROVADO OU NAO
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Aluno %S em %s.%n", (aluno.verificarAprovacao(i) ? "aprovado" : "reprovado"),
					aluno.getDisciplina(i));
		}
	}

}
