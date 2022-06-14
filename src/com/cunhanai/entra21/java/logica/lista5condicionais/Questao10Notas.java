/*
 * Questao 10 Notas
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao 10 - Suponha que um caixa disponha apenas de notas de 1, 10 e 100.
 * Considerando que alguém está pagando uma compra. Escreva um Programa que mostre
 * o número mínimo de cada nota que o caixa deve fornecer como troco. O programa 
 * receberá como entrada o Valor da Compra e Valor do pagamento, ambos os valores são inteiro.
 * Caso o valor do pagamento seja inferior ao valor da compra o cálculo não será efetuado
 * deverá imprimir a seguinte mensagem: “Pagamento Negado”. Por Exemplo:
 * 
 * 		valor da compra = 725
 * 		valor do pagamento = 1.000
 * 		Troco = 275
 * 
 * Neste caso deve exibir 2 notas de R$ 100, 7 notas de R$ 10 E 5 NOTAS DE R$ 1
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao10Notas {

	public static void main(String[] args) {
		int $1, $10, $100, valorCompra, valorPagamento, troco, moduloCem, centena, dezena, unidade;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O VALOR TOTAL DA COMPRA E O VALOR PAGO
		System.out.print("Valor da compra: ");
		valorCompra = sc.nextInt();
		System.out.print("Valor do pagamento: ");
		valorPagamento = sc.nextInt();
		
		// VERIFICA SE O VALOR PAGO É MENOR QUE O VALOR DA COMPRA
		if (valorPagamento < valorCompra) {
			// SE SIM, O PAGAMENTO É NEGADO
			System.out.println("Pagamento Negado");
		}
		else {
			// SE NÃO, É CALCULADO O TROCO
			troco = valorPagamento - valorCompra;
			
			// CALCULA O VALOR DO TROCO EM NOTAS DE R$ 100
			moduloCem = troco % 100;
			centena = troco - moduloCem; 
			$100 = (troco >= 100) ? centena / 100 : 0;
			
			// CALCULA O VALOR DO TROCO EM NOTAS DE R$ 10
			dezena = moduloCem - (moduloCem % 10);
			$10 = (dezena >= 10) ? dezena / 10 : 0;
			
			// CALCULA O VALOR DO TROCO EM NOTAS DE R$ 1
			unidade = troco - centena - dezena;
			$1 = (unidade >= 1) ? unidade : 0;
			
			// IMPRIME O VALOR DO TROCO E A QUANTIDADE DE NOTAS DE CADA VALOR A SER DADA
			System.out.printf("%n%s R$ %,d","Troco =", troco);
			System.out.printf("%n%,d %s", $100, "notas de R$ 100");
			System.out.printf("%n%,d %s", $10, "notas de R$ 10");
			System.out.printf("%n%,d %s", $1, "notas de R$ 1");
		}
		
		sc.close();
	}

}
