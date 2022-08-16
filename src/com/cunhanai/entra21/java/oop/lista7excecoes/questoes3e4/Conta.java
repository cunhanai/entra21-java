/**
 * Conta
 * @author Ana Julia da Cunha - Entra21
 * @date Agust, 2022
 * 	
 * 3. Suponha que o metodo "saca" da classe Conta vai ser rescrito de forma 
 * a lancar uma excecao criada por voce, cuja classe e ContaExcecao (extends 
 * Exception). A excecao e lancada sempre que o saldo da conta for inferior ao 
 * valor sacado. Implemente a classe ContaExcecao. Implemente o metodo saca 
 * que lanca a excecao. E rescreva o codigo da caixa com o devido tratamento da
 * excecao.
 */

package com.cunhanai.entra21.java.oop.lista7excecoes.questoes3e4;

public class Conta {

	// ATRIBUTOS DE INSTANCIA

	private String numConta;
	private String nomeCliente;
	private double saldo;
	private double limite;
	// CONSTRUTORES

	/**
	 * Construtor vazio da classe ContaBancaria.
	 */
	public Conta() {
	}

	// GETTERS E SETTERS

	/**
	 * @return the numConta
	 */
	public String getNumConta() {
		return numConta;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return the limite
	 */
	public double getLimite() {
		return limite;
	}

	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite) {
		this.limite = limite;
	}

	// METODOS

	/**
	 * Saca um valor na conta bancaria se a mesma possuir saldo suficiente.
	 * 
	 * @param valor precisa ser um <code>double</code> maior que 0 (zero).
	 * @return um <code>boolean</code> indicando se a transacao foi realizada.
	 */
	public void sacar(double valor) throws ContaExcecao {
		if (valor > 0 && valor <= this.saldo) {
			// Se o valor for maior que zero e menor ou igual ao saldo, o valor e sacado.
			this.saldo -= valor;
		} else {
			throw new ContaExcecao();
		}
	}

	/**
	 * Deposita um valor na conta bancaria.
	 * 
	 * @param valor precisa ser um <code>double</code>.
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "\n---------------------------" + "\nNome: " + this.nomeCliente + "\nNumero da conta: " + this.numConta
				+ "\nSaldo: " + this.saldo + "\nLimite: " + this.limite + "\n";
	}

}
