package com.cunhanai.entra21.java.oop.lista3construtores.gestaoacademica;

public class Pessoa {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	/**
	 * Pega o nome da pessoa
	 * @return uma <code>String</code> com o nome da pessoa 
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}