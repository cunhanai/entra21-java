/**
 * Aluno
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 5. Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso tem um Professor, que possui nome, departamento e email. Cada 
 * Curso também pode ter vários alunos (tipo Aluno). Cada Aluno tem nome, 
 * matricula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos, e que preça para o usuário entrar com as 4 notas de cada aluno. Ao 
 * final, imprima a média de cada aluno, se o mesmo está aprovado (media maior ou igual a 7), e qual é a média da turma
 */

package com.cunhanai.entra21.java.oop.lista4oop.questao5;

public class Aluno {

	private String nome;
	private String matricula;
	private float[] notas = new float[4];

	public Aluno(String matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, String matricula, float[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
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

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	public float calcularMedia() {
		return (notas[0] + notas[1] + notas[2] + notas[3])/4;
	}
	
	public boolean verificarAprovacao() {
		return calcularMedia() >= 7;
	}
}
