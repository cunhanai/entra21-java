/*
 * Conta Corrente Teste
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * Crie uma classe de testes para testar a classe ContaCorrente.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.testes;

import com.cunhanai.entra21.java.oop.lista2metodos.ContaCorrente;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		
		// PRIMEIRO TESTE - CONTA ESPECIAL
		ContaCorrente contaEsp = new ContaCorrente();
		contaEsp.numero = 12345;
		contaEsp.agencia = 321;
		contaEsp.saldo = 200;
		contaEsp.especial = true;
		contaEsp.limite = 400;
		
		System.out.println("Saldo inicial da conta: " + contaEsp.consultarSaldo());
		if (!contaEsp.sacar(300)) {
			System.out.println("Saldo insuficiente e cheque especial indisponível");
		}
		System.out.println("Saldo da conta apos tentar sacar 300: " + contaEsp.consultarSaldo());
		System.out.println("Limite restante da conta: " + contaEsp.limite);
		contaEsp.depositar(500);
		System.out.println("Saldo da conta apos depositar 500: " + contaEsp.consultarSaldo());
		contaEsp.sacar(100);
		System.out.println("Saldo da conta apos tentar sacar 100: " + contaEsp.consultarSaldo());
		if (!contaEsp.sacar(1000)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		
		System.out.println();
		
		// SEGUNDO TESTE - CONTA COMUM
		ContaCorrente contaCom = new ContaCorrente();
		contaCom.numero = 12345;
		contaCom.agencia = 321;
		contaCom.saldo = 200;
		contaCom.especial = false;
		contaCom.limite = 0;
		
		System.out.println("Saldo inicial da conta: " + contaCom.consultarSaldo());
		if (!contaCom.sacar(300)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		System.out.println("Saldo da conta apos tentar sacar 300: " + contaCom.consultarSaldo());
		System.out.println("Limite restante da conta: " + contaCom.limite);
		contaCom.depositar(500);
		System.out.println("Saldo da conta apos depositar 500: " + contaCom.consultarSaldo());
		if (!contaCom.sacar(100)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		System.out.println("Saldo da conta apos tentar sacar 100: " + contaCom.consultarSaldo());
		if (!contaCom.sacar(1000)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
	}

}
