/**
 * Teste - Questao 3 e 4
 * @author Ana Julia da Cunha - Entra21
 * @date Agust, 2022
 * 	
 * 3. Suponha que o metodo "saca" da classe Conta vai ser rescrito de forma 
 * a lancar uma excecao criada por voce, cuja classe e ContaExcecao (extends 
 * Exception). A excecao e lancada sempre que o saldo da conta for inferior ao 
 * valor sacado. Implemente a classe ContaExcecao. Implemente o metodo saca 
 * que lanca a excecao. E rescreva o codigo da caixa com o devido tratamento da
 * excecao.
 * 
 * 4. Retomando o exercicio anterior, suponha que quando lancada a excecao 
 * ContaExcecao, atraves do objeto excecao instanciado, seja possivel recuperar 
 * o saldo da pessoa. Como voce implementaria isso? Mostre tudo que deve ser 
 * modificado/acrescentado no exercicio para que isto funcione.
 */

package com.cunhanai.entra21.java.oop.lista7excecoes.questoes3e4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		// INSTANCIANDO
		Scanner sc = new Scanner(System.in);
		Conta minhaConta = new Conta();
		
		// ATRIBUINDO CARACTERISTICAS DO OBJETO
		minhaConta.setNomeCliente("Heloisa");
		minhaConta.setNumConta("1234");
		minhaConta.depositar(100);
		minhaConta.setLimite(100);
		
		System.out.println("Saldo atual: " + minhaConta.getSaldo() + "\n");
		
		// EXECUTANDO TESTE
		try {
			System.out.println("Quantidade que deseja sacar:");
			double valor = sc.nextDouble();
			minhaConta.sacar(valor);
			System.out.println("Saque realizado com sucesso!");
		} catch (ContaExcecao e) {
			System.out.println("\n" + e);
			System.out.println("\nPor favor, deposite um valor:");
			double valor = sc.nextDouble();
			minhaConta.depositar(valor);
		} finally {
			System.out.println(minhaConta);
		}
		
		// FECHANDO SCANNER
		sc.close();
	}

}
