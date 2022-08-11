package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class TesteExercico4 {

	public static void main(String[] args) {
		
		CodigoGenerico<String, Integer> cod = new CodigoGenerico<>("TEN", 3534);
		ValorMonetario<Double> valorM = new ValorMonetario<>(153.50);
		
		ProdutoGenerico2<CodigoGenerico<String, Integer>, ValorMonetario<Double>> prod3 = new ProdutoGenerico2<>(cod, "Tenis", valorM);
		System.out.println(prod3.toString());
	
	}

}
