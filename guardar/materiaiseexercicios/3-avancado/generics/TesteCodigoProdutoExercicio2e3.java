package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class TesteCodigoProdutoExercicio2e3 {

	public static void main(String[] args) {
	
	// USANDO Codigo e ProdutoGenerico EXERCICIO 2
	ProdutoGenerico<Codigo> prod1 = new ProdutoGenerico<>(new Codigo("IMP", 34));//“IMP34”, “SEC1413”, 
	System.out.println(prod1.toString2());
	
	ProdutoGenerico<Codigo> prod2 = new ProdutoGenerico<>(new Codigo("SEC", 1413));//“IMP34”, “SEC1413”, 
	System.out.println(prod2.toString2());	
	
	// USANDO CodigoGenerico e ProdutoGenerico EXERCICIO 3
	// Pode usar ProdutoGenerico das duas formas abaixo
	CodigoGenerico<String, Integer> cod = new CodigoGenerico<>("ABC", 1234);
	ProdutoGenerico<CodigoGenerico<String,Integer>> prod3 = new ProdutoGenerico<>(cod, "Sandalia", 23.50);
	//ProdutoGenerico<CodigoGenerico<String, Integer>> prod3 = new ProdutoGenerico<>(new CodigoGenerico<>("ABCE", 2345), "Sandalia", 23.50);
	System.out.println(prod3.toString());
	}

}
