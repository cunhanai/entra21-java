/*
 * Questao 18 Negociacao Acoes
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao_18: Negocia��o de A��es
 * No m�s passado, Jos� comprou e vendeu algumas a��esdas Lojas Pedroso S.A., conforme detalhado abaixo:
 * 
 * 		a. No total, foram compradas 1000 a��es. Naquele momento, Jos� pagou R$ 32,87 por cada a��o;
 * 		b. Pela transa��o que efetuou, Jos� teve que pagar uma taxa de corretagem de 2% sobre o valor pago pelas a��es;
 * 		c. Duas semanas depois, Jos� vendeu todas as a��es que adquirira por R$33,92 cada uma;
 * 		d. Para poder efetuar a venda, Jos� teve que pagar novamente uma comiss�o de 2% do valor da transa��o.
 * 
 * Crie um algoritmo que imprima na tela as seguintes informa��es:
 * 
 * 		a. A quantia que Jos� pagou pelas a��es;
 * 		b. O valor da comiss�o que Jos� pagou ao seu corretor quando ele comprou as a��es;
 * 		c. A quantia pela qual Jos� vendeu as a��es;
 * 		d. A quantia de comiss�o que Jos� pagou ao seu corretor quando ele vendeu as a��es;
 * 		e. Mostre a quantia que Jos� ganhou ao vender as a��es e pagar o corretor.
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
		
		valorCompra = qtdeAcoes * valorAcaoCompra; // CALCULA O VALOR DE COMPRA DAS A��ES
		comissaoCompra = valorCompra * TAXA; // CALCULA A COMISS�O PAGA AO CORRETOR NA COMPRA
		gastosCompra = valorCompra + comissaoCompra; // CALCULA OS GASTOS TOTAIS DA COMPRA
		
		valorVenda = qtdeAcoes * valorAcaoVenda; // CALCULA O VALOR DE VENDA DAS A��ES
		comissaoVenda = valorVenda * TAXA; // CALCULA A COMISS�O PAGA AO CORRETOR NA VENDA
		lucro = valorVenda - (gastosCompra + comissaoVenda); // CALCULA O LUCRO QUE JOS� OBTEVE COM ESSAS TRANSA��ES 
		
		// IMPRIME AS QUANTIAS PAGAS E VENDIDAS POR JOS� PELAS A��ES
		System.out.println("Quantia que Jos� pagou pelas a��es: R$ " + valorCompra);
		System.out.println("Valor de comiss�o pago ao corretor na compra: R$ " + comissaoCompra);
		System.out.println("Quantia que Jos� vendeu as a��es: R$ " + valorVenda);
		System.out.println("Valor de comiss�o pago ao corretor na venda: R$ " + comissaoVenda);
		
		// IMPRIME O LUCRO OU PREJU�ZO DE JOS�
		if (lucro > 0) {
			// SE O VALOR ARMAZENADO EM lucro FOR POSITIVO, IMPRIME O VALOR COMO LUCRO
			System.out.println("Jos� obteve um lucro de: R$ " + lucro);
		}
		else {
			// SE O VALOR FOR NEGATIVO, MUDA-SE O SINAL DO RESULTADO E O IMPRIME COMO PREJU�ZO
			prejuizo = lucro * (-1);
			System.out.println("Jos� obteve um preju�zo de: R$ " + prejuizo);
		}
	}
}
