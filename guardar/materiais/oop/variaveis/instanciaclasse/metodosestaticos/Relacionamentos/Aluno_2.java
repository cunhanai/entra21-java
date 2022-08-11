package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;

	
	
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
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
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
	
	public double obterMedia() {
		int soma = 0;
		for(double nota : notas) {
			soma += nota;
		}
		return soma/4;
	}
	
	

}
