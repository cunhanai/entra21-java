package com.cunhanai.entra21.java.avancado.lambda;

public enum OpcoesMenu {

	SOMAR(1), SUBTRAIR(2), MULTIPLICAR(3), DIVIDIR(4), SAIR(5);

	private final int valor;

	private OpcoesMenu(int valorOpcao) {
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
}
