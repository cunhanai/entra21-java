/*
 * Questao 07 Desconto
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_7: Natália abriu uma loja de bijuterias recentemente
 * e as vendas vão muito bem. Pensando em atrair uma clientela
 * ainda maior, ela deseja oferecer um desconto de 10% para os
 * clientes que gastarem R$ 100 ou mais e pagarem em dinheiro.
 * Escreva um programa que receba como entrada o valor do
 * produto comprado e a forma de pagamento escolhida (dinheiro
 * ou cheque). calcule o desconto devido (caso necessário), e
 * exiba o valor final a ser pago.
 * 
 * Lembrete: 10% de um valor = (10/100) * valor
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao07Desconto {
	
	public static void main(String[] args) {
		double valor, valorFinal, desconto = 0.1;
		int formaPagamento;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O VALOR DA COMPRA AO USUÁRIO
		System.out.print("Valor: ");
		valor = sc.nextDouble();
		
		// PEDE A FORMA DE PAGAMENTO AO USUÁRIO
		System.out.println("Forma de pagamento");
		System.out.println("\n[1] Cartão");
		System.out.println("[2] Boleto");
		System.out.println("[3] Dinheiro");
		System.out.println("[4] Pix");
		System.out.println("[5] Transferência");
		System.out.print("\nDigite a letra da forma de pagamento: ");
		formaPagamento = sc.nextInt();
		
		// VERIFICA SE O VALOR E O TIPO DE PAGAMENTO SÃO VÁLIDOS PARA RECEBER O DESCONTO E IMPRIME O VALOR FINAL
		if ((formaPagamento == 1 ) && valor >= 100) {
			valorFinal = valor - (valor * desconto);
			System.out.printf("%n%s %n%s %,.2f","Desconto: 10%", "Valor final: R$", valorFinal);
		}
		else if (formaPagamento > 5) {
			System.out.println("Forma de pagamento inválida!");
		}
		else {
			System.out.printf("%n%s %n%s %,.2f", "Esta compra não possui desconto.", "Valor final: R$", valor);
		}
		
		sc.close();
	}
}
