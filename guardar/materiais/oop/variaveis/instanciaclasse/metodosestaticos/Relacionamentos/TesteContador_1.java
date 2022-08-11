
package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

public class TesteContador {
	
	static void imprimirValor() {
		//System.out.println(Contador.obterValor());
	}

	public static void main(String[] args) {
		
		Contador cont = new Contador();
		cont.incrementar();
		System.out.println("Contador 1: "+ cont.obterValor());
		
		Contador cont2 = new Contador();
		cont2.incrementar();
		System.out.println("Contador 2: "+ cont2.obterValor());
		
		Contador cont3 = new Contador();
		cont3.incrementar();
		System.out.println("Contador 3: "+ cont3.obterValor());
		
		Contador cont4 = new Contador();
		cont4.incrementar();
		System.out.println("Contador 4: "+ cont4.obterValor());
		
		cont2.zerar();
		System.out.println("Contador 2: "+ cont2.obterValor());
		
		
		
		System.out.println();
//		imprimirValor();
//		
//		Contador.incrementar();
//		
//		imprimirValor();
//		
//		Contador.incrementar();
//		
//		imprimirValor();
//		
//		Contador.incrementar();
//		
//		imprimirValor();
//		
//		Contador.incrementar();
//		
//		imprimirValor();
//		
//		Contador.zerar();
//		
//		imprimirValor();
//		
		

	}

}
