package com.entra21.cursojavamanha.oop.listaexercicios.tratamentoexcecoes;

public class ContaExcecao extends Exception {
	
	@Override
	public String getMessage() {
		return " Saldo negativo";
	}

}
