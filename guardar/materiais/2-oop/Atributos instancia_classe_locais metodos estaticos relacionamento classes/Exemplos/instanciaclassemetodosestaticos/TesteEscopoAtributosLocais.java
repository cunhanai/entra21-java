package com.entra21.cursojavamanha.oop.exerciciospratica.variaveis.instanciaclassemetodosestaticos;

public class TesteEscopoAtributosLocais {

	public static void main(String[] args) {
		
		EscopoAtributosLocais escopo = new EscopoAtributosLocais();
		escopo.setValor(10);
		
		System.out.println(escopo.getValor()); // 10
		//1º
		//System.out.println(escopo.calculaValor(20)); // 20 ou 30?
		
		//System.out.println(escopo.getValor()); // 10 ou 20?
		//2º 
		//System.out.println(escopo.teste()); //4 ou 9?
		
		//System.out.println(escopo.getValor());

	}

}
