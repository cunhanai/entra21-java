/*
 * Conta Corrente
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * 2.Cria uma classe para representar uma conta corrente que possui um n�mero, um 
 * saldo, um status que informa se ela � especial ou n�o, um limite. Desenvolva 
 * m�todos para realizar saque (verificando se o cliente pode realizar saques), 
 * despositar dinheiro, consultar saldo e verificar se o cliente est� usando cheque 
 * especial ou n�o. Desenvolva um programa para testar essa classe.
 * 
 * OBS.: PROF HELOISA, COMO COLOQUEI OS TESTES EM OUTRO PACKAGE, ESTAVA DANDO ERRO COM
 * A VISIBILIDADE DAS VARIAVEIS, ENTAO O ECLIPSE DISSE PARA EU MUDAR TODOS OS ATRIBUTOS
 * E METODOS PARA PUBLIC
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class ContaCorrente {
	
	public int numero; // numero da conta
	public int agencia; // agencia da conta
	public double saldo; // saldo da conta
	public boolean especial; // se a conta e especial ou nao
	public double limite; // limite do credito do cheque especial
	
	/**
	 * Saca o dinheiro se tiver saldo dispon�vel na conta, se n�o tiver, verifica
	 * se a conta � especial e se o cliente tem limite para sacar do cheque especial
	 * caso tenha.
	 * @param valor a quantia a ser depositada.
	 * @return um <code>boolean</code> indicando se foi possivel ou nao sacar o valor desejado.
	 */
	public boolean sacar(double valor) {
		// SE O SALDO FOR MAIOR OU IGUAL AO VALOR QUE DESEJA SACAR
		if (saldo >= valor) {
			saldo -= valor;
			return true;			
		}
		// SE O VALOR FOR MAIOR DO QUE O SALDO O CHEQUE ESPECIAL ESTIVER DISPONIVEL
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
	
	/**
	 * Deposita o dinheiro na conta corrente, somando o saldo atual
	 * com o valor depositado.
	 * @param valor a quantia a ser depositada.
	 * @return o novo saldo em <code>double</code>.
	 */
	public void depositar(double valor) {
		saldo += valor;
	}
	
	/**
	 * Informa o saldo atual na conta corrente.
	 * @return o valor do saldo em <code>double</code>.
	 */
	public double consultarSaldo() {
		return saldo;
	}
	
	/**
	 * Verifica se o cliente possui uma conta especial e se pode usar o cheque especial
	 * caso seja.
	 * @param valor o valor a ser sacado.
	 * @return <code>boolean</code> informando se esta ou nao usando cheque especial.
	 */
	public boolean verificarChequeEspecial(double valor) {
		return (saldo < valor && especial && limite >= valor);
	}
}
