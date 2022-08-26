
package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do Curso");
		String nome =scan.nextLine();
		
		System.out.println("Entre com o horario do Curso");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do Professor");
		String nomeProfessor = scan.nextLine(); 
		
		System.out.println("Entre com o departameto do Professor");
		String depProfessor = scan.nextLine(); 
		
		System.out.println("Entre com o email do Professor");
		String emailProfessor = scan.nextLine(); 
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor =new Professor();
		professor.setNome(nomeProfessor);
		professor.setDepartamento(depProfessor);
		professor.setEmail(emailProfessor);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[2];
		
		for(int i = 0;i < 2; i++) {
			System.out.print("Entre com o nome do Aluno: " + (i + 1));
			String nomeAluno = scan.nextLine();
			System.out.print("Entre com o matricula do Aluno: " + (i + 1));
			String matricula = scan.nextLine();
			
			double[] notas = new double[2];
			for (int j = 0; j<2;j++) {
				System.out.println("Entre com a nota " + (j + 1) + " do Aluno(a): " + nomeAluno);
				notas[j] = scan.nextDouble();
				scan.nextLine();
				
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		
			
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
	}

}
