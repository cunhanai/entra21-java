/**
 * Contato
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 4. Escreva uma classe Agenda, que contem varios contatos do tipo Contato. Cada contato possui nome, telefone e email. A Agenda tamb�m 
 * possui um nome. Crie um programa teste que pe�a para o usu�rio entrar com o nome da Agenda e em seguida 3 contatos. Crie m�todos que retornem uma 
 * String com a informa��o de cada contato e tamb�m de todos os contatos da agenda.
 */

package com.cunhanai.entra21.java.oop.lista4oop.questao4;

public class Contato {

	private String nome;
	private int telefone;
	private String email;

	public Contato(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email + "\n";
	}
	
	
}
