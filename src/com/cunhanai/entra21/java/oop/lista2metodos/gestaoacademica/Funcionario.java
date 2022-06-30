/**
 * Funcionario
 * @author Ana Julia da Cunha
 * @date 2022-06-30
 */

package com.cunhanai.entra21.java.oop.lista2metodos.gestaoacademica;

public class Funcionario extends Pessoa{
	
	private String endereco;
	private String telefone;
	private String ctps;
	private float salario;
	
	public Funcionario(String nome, String endereco, String cpf, String telefone,
			String ctps, float salario) {
		super(nome, cpf);
		this.endereco = endereco;
		this.telefone = telefone;
		this.ctps = ctps;
		this.salario = salario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
