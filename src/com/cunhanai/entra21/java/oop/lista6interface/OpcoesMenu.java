package com.cunhanai.entra21.java.oop.lista6interface;

public enum OpcoesMenu {

	CADASTRAR_PROJETOS(1), INSERIR_PROFESSORES(2), INSERIR_ALUNOS(3), SAIR(5);

	private final int opcao;

	private OpcoesMenu(int opcao) {
		this.opcao = opcao;
	}

	/**
	 * @return the opcao
	 */
	public int getOpcao() {
		return opcao;
	}

}
