/*
 * Questao 18 Negociacao Acoes
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_18: Negociação de Ações
 * No mês passado, José comprou e vendeu algumas açõesdas Lojas Pedroso S.A., conforme detalhado abaixo:
 * 
 * 		a. No total, foram compradas 1000 ações. Naquele momento, José pagou R$ 32,87 por cada ação;
 * 		b. Pela transação que efetuou, José teve que pagar uma taxa de corretagem de 2% sobre o valor pago pelas ações;
 * 		c. Duas semanas depois, José vendeu todas as ações que adquirira por R$33,92 cada uma;
 * 		d. Para poder efetuar a venda, José teve que pagar novamente uma comissão de 2% do valor da transação.
 * 
 * Crie um algoritmo que imprima na tela as seguintes informações:
 * 
 * 		a. A quantia que José pagou pelas ações;
 * 		b. O valor da comissão que José pagou ao seu corretor quando ele comprou as ações;
 * 		c. A quantia pela qual José vendeu as ações;
 * 		d. A quantia de comissão que José pagou ao seu corretor quando ele vendeu as ações;
 * 		e. Mostre a quantia que José ganhou ao vender as ações e pagar o corretor.
 */

package com.cunhanai.entra21.java.logica.lista3;

public class Questao18NegociacaoAcoes {
	public static void main(String[] args) {
		double TAXA, valorAcaoCompra, valorAcaoVenda, valorCompra, valorVenda, comissaoCompra;
		double comissaoVenda, gastosCompra, lucro, prejuizo;
		int qtdeAcoes = 1000;
		TAXA = 0.02;
		valorAcaoCompra = 32.87;
		valorAcaoVenda = 33.92;
		
		valorCompra = qtdeAcoes * valorAcaoCompra; // CALCULA O VALOR DE COMPRA DAS AÇÕES
		comissaoCompra = valorCompra * TAXA; // CALCULA A COMISSÃO PAGA AO CORRETOR NA COMPRA
		gastosCompra = valorCompra + comissaoCompra; // CALCULA OS GASTOS TOTAIS DA COMPRA
		
		valorVenda = qtdeAcoes * valorAcaoVenda; // CALCULA O VALOR DE VENDA DAS AÇÕES
		comissaoVenda = valorVenda * TAXA; // CALCULA A COMISSÃO PAGA AO CORRETOR NA VENDA
		lucro = valorVenda - (gastosCompra + comissaoVenda); // CALCULA O LUCRO QUE JOSÉ OBTEVE COM ESSAS TRANSAÇÕES 
		
		// IMPRIME AS QUANTIAS PAGAS E VENDIDAS POR JOSÉ PELAS AÇÕES
		System.out.println("Quantia que José pagou pelas ações: R$ " + valorCompra);
		System.out.println("Valor de comissão pago ao corretor na compra: R$ " + comissaoCompra);
		System.out.println("Quantia que José vendeu as ações: R$ " + valorVenda);
		System.out.println("Valor de comissão pago ao corretor na venda: R$ " + comissaoVenda);
		
		// IMPRIME O LUCRO OU PREJUÍZO DE JOSÉ
		if (lucro > 0) {
			// SE O VALOR ARMAZENADO EM lucro FOR POSITIVO, IMPRIME O VALOR COMO LUCRO
			System.out.println("José obteve um lucro de: R$ " + lucro);
		}
		else {
			// SE O VALOR FOR NEGATIVO, MUDA-SE O SINAL DO RESULTADO E O IMPRIME COMO PREJUÍZO
			prejuizo = lucro * (-1);
			System.out.println("José obteve um prejuízo de: R$ " + prejuizo);
		}
	}
}
