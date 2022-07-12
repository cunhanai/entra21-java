/**
 * Agenda
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 4. Escreva uma classe Agenda, que contem varios contatos do tipo Contato. Cada contato possui nome, telefone e email. A Agenda tambem 
 * possui um nome. Crie um programa teste que peça para o usuario entrar com o nome da Agenda e em seguida 3 contatos. Crie metodos que retornem uma 
 * String com a informação de cada contato e tambem de todos os contatos da agenda.
 */

package com.cunhanai.entra21.java.oop.lista4oop.questao4;

import java.util.Arrays;

public class Agenda {

	private String nomeAgenda;
	private Contato[] contatos;

	public Agenda(String nomeAgenda, Contato[] contatos) {
		this.nomeAgenda = nomeAgenda;
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "AGENDA: " + nomeAgenda + "\n\n" + Arrays.toString(contatos);
	}

}
