package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class TesteCodigoProdutoExercicio2 {

	public static void main(String[] args) {
	
	// USANDO Codigo e ProdutoGenerico EXERCICIO 2
	ProdutoGenerico<Codigo> prod1 = new ProdutoGenerico<>(new Codigo("IMP", 34));//“IMP34”, “SEC1413”, 
	System.out.println(prod1.toString2());
	
	ProdutoGenerico<Codigo> prod2 = new ProdutoGenerico<>(new Codigo("SEC", 1413));//“IMP34”, “SEC1413”, 
	System.out.println(prod2.toString2());	
	
	}
}
