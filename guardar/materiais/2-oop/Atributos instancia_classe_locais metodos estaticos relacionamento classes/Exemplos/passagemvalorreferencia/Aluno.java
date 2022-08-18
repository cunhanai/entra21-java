package com.entra21.cursojavamanha.oop.exerciciospratica.passagemvalorreferencia;

public class Aluno {
	
		private String nome;
		private String matricula;
		private String nomeCurso;
		private String[] nomeDisciplina;
		private double[][] notasDisciplina;
		
		
		
		public Aluno() {
			nomeDisciplina = new String[3];
			notasDisciplina = new double[3][4];
			
		}
		
		public Aluno(String nome, String matricula, String nomeCurso) {
	
			this.nomeDisciplina = new String[3];
			this.notasDisciplina = new double[3][4];
			this.nome = nome;
			this.matricula = matricula;
			this.nomeCurso = nomeCurso;
		}
		
		public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplina, double[][] notasDisciplina) {
		
			this.nomeDisciplina = new String[3];
			this.notasDisciplina = new double[3][4];
			this.nome = nome;
			this.matricula = matricula;
			this.nomeCurso = nomeCurso;
			this.nomeDisciplina = nomeDisciplina;
			this.notasDisciplina = notasDisciplina;
			
		}


		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMatricula() {
			return this.matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getNomeCurso() {
			return this.nomeCurso;
		}

		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}

		public String[] getNomeDisciplina() {
			
			return this.nomeDisciplina;
		}
		

		public void setNomeDisciplina(int pos, String nomeDisciplina) {
			this.nomeDisciplina[pos] = nomeDisciplina;
			
			
		}
		

		public double[][] getNotasDisciplina() {
			return this.notasDisciplina;
		}

		public void setNotasDisciplina(double notasDisciplina, int posi, int posij) {
			
			 this.notasDisciplina[posi][posij] = notasDisciplina;
			
		}
		

		public void mostrarInfo() {
			System.out.println("Nome: " + nome);
			System.out.println("Matricula: " + matricula);
			System.out.println("Nome do Curso: " + nomeCurso);
			
			for( int i =0 ; i < this.notasDisciplina.length;i++) {
				System.out.println("Notas da disciplina:" + this.nomeDisciplina[i]);
				for( int j =0 ; j < this.notasDisciplina[i].length;j++) {
					System.out.print(this.notasDisciplina[i][j] + " ");	
				}
				System.out.println();
			}
			
			for( int i =0 ; i < this.nomeDisciplina.length;i++) {
				if(verificarAprovado(i)) {
					System.out.println("Disciplina " + nomeDisciplina[i] + "- foi aprovado ");
				}
				else {
					System.out.println("Disciplina " + nomeDisciplina[i] + "- foi reprovado ");
				}
			}
		}
		
		boolean verificarAprovado(int indice) {
			
			if( obterMedia(indice) >= 7) {
				return true;
			}
			return false;
		}
		
		private double obterMedia(int indice) {
			double soma =0;
			for( int i =0 ; i < notasDisciplina[indice].length;i++) {
				soma += notasDisciplina[indice][i];
			}
			double media = soma / 4;
			return media;
			
		}
		//@overrider
		public String toString() {
			return "Aluno [nome= " + nome + ", matricula= " + matricula + ", curso= " + nomeCurso + "]"; 
			
		}

}
