package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.Objects;

public class Aluno {
//public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String matricula;
	private String curso;
	private double notas;

	public Aluno(String nome, String curso, double notas) {
		this.nome = nome;
		this.curso = curso;
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
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String obterInfo() {
		String info =  " Nome Aluno =  " +nome + ";";
		info +=  "Matricula=  " +matricula + ";";
		info +=  "Matricula=  " +matricula + ";";
		info +=  "Notas=  " ;
		
		int soma = 0;
		double media = soma/4;
		info +=  "\n " + "Media = " + media + " - ";
		if(media >= 7) {
			info +=  "Aprovado"; 
		}
		else {
			info +=  "Reprovado"; 
		}
		
		return info;
				
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno{ "+ nome + ", "+ curso + ", " + notas +"}\n";
	}

//	@Override
//	public int compareTo(Aluno aluno) { 
//		return this.nome.compareTo(aluno.getNome()); // chamada AO MESMO METODO compareTo 
//													 // PARA O ATRIBUTO nome, que é um String
//													 // e String implementa Comparable
//	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(nome);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Aluno other = (Aluno) obj;
//		return Objects.equals(nome, other.nome);
//	}
	
//	 public boolean equals(Object o) {
//		    Aluno a = (Aluno) o;
//		    return this.nome.equals(a.getNome());
//		  }
//
//		  public int hashCode() {
//		    return this.nome.hashCode();
//		  }
}
