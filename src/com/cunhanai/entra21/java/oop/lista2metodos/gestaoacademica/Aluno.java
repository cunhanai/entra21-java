package com.cunhanai.entra21.java.oop.lista2metodos.gestaoacademica;

public class Aluno extends Pessoa {
	
	public String matricula;
	public String codCurso;
	
	public Aluno(String nome, String cpf, String matricula, String codCurso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.codCurso = codCurso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}

	public String getCodCurso() {
		return codCurso;
	}
}
