package com.cunhanai.entra21.java.oop.lista3construtores.gestaoacademica;

public class TecnicoAdministrativo extends Funcionario {

	private String cargo;
	private String departamento;

	public TecnicoAdministrativo(String nome, String endereco, String cpf, String telefone, String ctps, float salario,
			String cargo, String departamento) {
		super(nome, endereco, cpf, telefone, ctps, salario);
		this.cargo = cargo;
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}