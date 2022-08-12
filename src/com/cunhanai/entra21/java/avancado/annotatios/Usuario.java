package com.cunhanai.entra21.java.avancado.annotatios;

import java.time.LocalDate;

public class Usuario {

	private String nome;
	private String cpf;
	@IdadeMinima(valor = 18)
	private LocalDate dataNasciento;

	public Usuario() {

	}

	/**
	 * @param nome
	 * @param cpf
	 * @param dataNasciento
	 */
	public Usuario(String nome, String cpf, LocalDate dataNasciento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasciento = dataNasciento;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dataNasciento
	 */
	public LocalDate getDataNasciento() {
		return dataNasciento;
	}

	/**
	 * @param dataNasciento the dataNasciento to set
	 */
	public void setDataNasciento(LocalDate dataNasciento) {
		this.dataNasciento = dataNasciento;
	}

}
