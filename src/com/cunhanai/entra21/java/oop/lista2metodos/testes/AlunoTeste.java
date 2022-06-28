/**
 * Aluno Teste
 * @date 2022-06-24
 * @author Ana Julia da Cunha - Entra21
 * 
 * Crie uma classe de testes para testar a classe Aluno.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.testes;

import com.cunhanai.entra21.java.oop.lista2metodos.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Ana";
		aluno1.matricula = "54321";
		aluno1.curso = "Programacao em Java";
		aluno1.disciplinas[0] = "Java";
		aluno1.disciplinas[1] = "Inglês";
		aluno1.disciplinas[2] = "Desenvolvimento Humano";
		aluno1.notas[0][0] = 9.5f;
		aluno1.notas[0][1] = 10;
		aluno1.notas[0][2] = 8;
		aluno1.notas[1][0] = 7;
		aluno1.notas[1][1] = 7;
		aluno1.notas[1][2] = 7;
		aluno1.notas[2][0] = 5.5f;
		aluno1.notas[2][1] = 7;
		aluno1.notas[2][2] = 3.3f;
		
		for (int i = 0; i < aluno1.notas.length; i++) {
			System.out.printf("%n%n%s %s: ", "Notas de", aluno1.disciplinas[i]);
			for (int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.printf(aluno1.notas[i][j] + (j == 2 ? "." : ", "));
			}
			System.out.printf("%nAluno %s.", (aluno1.verificarAprovacao(i) ? "aprovado" : "reprovado"));
		}
	}

}
