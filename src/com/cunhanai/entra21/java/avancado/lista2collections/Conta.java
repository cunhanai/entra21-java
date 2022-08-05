package com.cunhanai.entra21.java.avancado.lista2collections;

public abstract class Conta {

	private int numero;
	private double saldo;
	private String nome;

	public Conta() {
	}

	public Conta(int numero, double saldo, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.nome = nome;
	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Numero da conta: " + numero + "\nSaldo: " + saldo + "\nNome: " + nome;
	}

}
