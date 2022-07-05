package com.cunhanai.entra21.java.oop.lista3construtores;

public class ContaCorrente {
	
	public int numero; // numero da conta
	public int agencia; // agencia da conta
	public double saldo; // saldo da conta
	public boolean especial; // se a conta e especial ou nao
	public double limite = 0; // limite do credito do cheque especial
	
	public ContaCorrente(int numero, int agencia, double saldo, boolean especial) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
	}
	public ContaCorrente(int numero, int agencia, double saldo, boolean especial, double limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}
	
	
}
