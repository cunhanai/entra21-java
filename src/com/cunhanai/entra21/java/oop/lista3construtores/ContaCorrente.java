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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	/**
	 * Saca o dinheiro se tiver saldo disponível na conta, se não tiver, verifica
	 * se a conta é especial e se o cliente tem limite para sacar do cheque especial
	 * caso tenha.
	 * @param valor a quantia a ser depositada.
	 * @return um <code>boolean</code> indicando se foi possivel ou nao sacar o valor desejado.
	 */
	public boolean sacar(double valor) {
		// SE O SALDO FOR MAIOR OU IGUAL AO VALOR QUE DESEJA SACAR
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;	
		}
		// SE O VALOR FOR MAIOR DO QUE O SALDO O CHEQUE ESPECIAL ESTIVER DISPONIVEL
		else if (verificarChequeEspecial(valor)) {
			double aux = valor;
			valor -= getSaldo();
			this.limite -= valor;
			this.saldo -= aux;
			return true;
		}
		// SE NAO, NAO HA OPERCAO
		else {
			return false;
		}
	}
	
	/**
	 * Deposita o dinheiro na conta corrente, somando o saldo atual
	 * com o valor depositado.
	 * @param valor a quantia a ser depositada.
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Verifica se o cliente possui uma conta especial e se pode usar o cheque especial
	 * caso seja.
	 * @param valor o valor a ser sacado.
	 * @return <code>boolean</code> informando se esta ou nao usando cheque especial.
	 */
	public boolean verificarChequeEspecial(double valor) {
		return (getSaldo() < valor && isEspecial() && getLimite() >= valor);
	}
}
