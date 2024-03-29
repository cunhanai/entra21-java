/**
 * Conta Corrente Teste
 * @date 2022-07-01
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classe ContaCorrente, do exercicio 2.
 */


package com.cunhanai.entra21.java.oop.lista3opp.testes;

import com.cunhanai.entra21.java.oop.lista3opp.ContaCorrente;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
		
		// PRIMEIRO TESTE - CONTA ESPECIAL
		ContaCorrente contaEsp = new ContaCorrente(12345, 321, -20, true, 2000); // CONSTRUTOR QUE DEFINE O LIMITE

		System.out.println("Saldo inicial da conta: " + contaEsp.getSaldo());
		if (!contaEsp.sacar(300)) {
			System.out.println("Saldo insuficiente e cheque especial indispon�vel");
		}
		System.out.println("Saldo da conta apos tentar sacar 300: " + contaEsp.getSaldo());
		System.out.println("Limite restante da conta: " + contaEsp.limite);
		contaEsp.depositar(500);
		System.out.println("Saldo da conta apos depositar 500: " + contaEsp.getSaldo());
		contaEsp.sacar(100);
		System.out.println("Saldo da conta apos tentar sacar 100: " + contaEsp.getSaldo());
		if (!contaEsp.sacar(1000)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		
		System.out.println();
		
		// SEGUNDO TESTE - CONTA COMUM
		ContaCorrente contaCom = new ContaCorrente(12346, 321, 200, false); // CONSTRUTOR QUE N�O DEFINE LIMITE
		
		System.out.println("Saldo inicial da conta: " + contaCom.getSaldo());
		if (!contaCom.sacar(300)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		System.out.println("Saldo da conta apos tentar sacar 300: " + contaCom.getSaldo());
		System.out.println("Limite restante da conta: " + contaCom.limite);
		contaCom.depositar(500);
		System.out.println("Saldo da conta apos depositar 500: " + contaCom.getSaldo());
		if (!contaCom.sacar(100)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
		System.out.println("Saldo da conta apos tentar sacar 100: " + contaCom.getSaldo());
		if (!contaCom.sacar(1000)) {
			System.out.println("Saldo insuficiente e cheque especial indisponivel!");
		}
	}

}
