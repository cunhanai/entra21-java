package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

public class Contador {
	
	private static int cont;
	
	public  void incrementar() {
		//Contador.cont++; pode mas não tem necessidade
		cont++;
	}
		
	
	public  void zerar() {
		cont = 0;
	}

	
	public int obterValor() {
		return cont;
	}
	
//	public static void incrementar() {
//		//Contador.cont++; pode mas não tem necessidade
//		cont++;
//	}
//		
//	
//	public static void zerar() {
//		cont = 0;
//	}
//
//	
//	public static int obterValor() {
//		return cont;
//	}
//	
	
}
