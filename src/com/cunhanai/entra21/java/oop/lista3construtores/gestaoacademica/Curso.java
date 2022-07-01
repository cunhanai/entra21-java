package com.cunhanai.entra21.java.oop.lista3construtores.gestaoacademica;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String codigo;
	private String nome;
	private float duracao;
	private List<String> disciplinas;

	public Curso(String codigo, String nome, float duracao) {
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
		this.disciplinas = new ArrayList<String>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	public List<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void adicionarDisciplinas(String codDisciplina) {
		disciplinas.add(codDisciplina);
	}
}