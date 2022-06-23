/*
 * Questao 1 Conta Corrente Teste
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * Crie uma classe de testes para testar a conta corrente da questao 2.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.testes;

import com.cunhanai.entra21.java.oop.lista2metodos.Questao2ContaCorrente;

public class Questao2ContaCorrenteTeste {

	public static void main(String[] args) {
		Questao2ContaCorrente contaEsp = new Questao2ContaCorrente();
		
		// PRIMEIRO TESTE
		contaEsp.numero = 12345;
		contaEsp.agencia = 321;
		contaEsp.saldo = 200;
		contaEsp.especial = true;
		contaEsp.limite = 400;
		
		System.out.println("Saldo da conta: " + contaEsp.consultarSaldo());
		contaEsp.sacar(300);
		System.out.println("Saldo da conta: " + contaEsp.consultarSaldo());
		System.out.println("Limite restante da conta: " + contaEsp.limite);
	}

}
