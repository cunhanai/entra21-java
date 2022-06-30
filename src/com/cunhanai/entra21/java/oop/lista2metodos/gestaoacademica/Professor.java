/**
 * Professor
 * @author Ana Julia da Cunha
 * @date 2022-06-30
 */

package com.cunhanai.entra21.java.oop.lista2metodos.gestaoacademica;

public class Professor extends Funcionario {
	
	private String titulacao;
	private String areaDePesquisa;
	
	public Professor(String nome, String endereco, String cpf, String telefone,
			String ctps, float salario, String titulacao, String areaDePesquia) {
		super(nome, endereco, cpf, telefone, ctps, salario);
		this.titulacao = titulacao;
		this.areaDePesquisa = areaDePesquia;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getAreaDePesquisa() {
		return areaDePesquisa;
	}

	public void setAreaDePesquisa(String areaDePesquisa) {
		this.areaDePesquisa = areaDePesquisa;
	}
	
	
}
