/*
 * Questao 2 Conta Corrente
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * 2.Cria uma classe para representar uma conta corrente que possui um número, um 
 * saldo, um status que informa se ela é especial ou não, um limite. Desenvolva 
 * métodos para realizar saque (verificando se o cliente pode realizar saques), 
 * despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque 
 * especial ou não. Desenvolva um programa para testar essa classe.
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class Questao2ContaCorrente {
	
	public int numero; // numero da conta
	public int agencia; // agencia da conta
	public double saldo; // saldo da conta
	public boolean especial; // se a conta e especial ou nao
	public double limite; // limite do credito do cheque especial
	
	/*
	 * Saca o dinhei
	 */
	public boolean sacar(double valor) {
		// SE O SALDO FOR MAIOR OU IGUAL AO VALOR QUE DESEJA SACAR
		if (saldo >= valor) {
			saldo -= valor;
			return true;			
		}
		// SE O VALOR FOR MENOR DO QUE O SALDO O CHEQUE ESPECIAL ESTIVER DISPONIVEL
		else if (verificarChequeEspecial(valor)) {
			double aux = valor;
			valor -= saldo;
			limite -= valor;
			saldo -= aux;
			return true;
		}
		// SE NAO, NAO HA OPERCAO
		else {
			return false;
		}
	}
	
	/*
	 * Deposita o dinheiro na conta corrente, somando o saldo atual
	 * com o valor depositado.
	 * @param valor a quantia a ser depositada.
	 * @return o novo saldo em <code>double</code>.
	 */
	public double depositar(double valor) {
		return saldo += valor;
	}
	
	/*
	 * Informa o saldo atual na conta corrente.
	 * @return o valor do saldo em <code>double</code>.
	 */
	public double consultarSaldo() {
		return saldo;
	}
	
	/*
	 * Verifica se o cliente esta usando cheque especial.
	 * @param valor o valor a ser sacado.
	 * @return <code>boolean</code> informando se esta ou nao usando cheque especial.
	 */
	public boolean verificarChequeEspecial(double valor) {
		if (saldo < valor && especial && limite > valor) {
			return true;
		}
		else {
			return false;
		}
	}
}
