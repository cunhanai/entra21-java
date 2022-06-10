/*
 * Questao 16 Lucro Despesa
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_16: Faça um algoritmo em que o usuário irá fornecer a receita e as
 * despesas de uma empresa e obtenha como resultado o lucro e o percentual das 
 * despesas em relação a receita
 */

package com.cunhanai.entra21.java.lista3;
import java.util.Scanner;

public class Questao16LucroDespesa {

	public static void main(String[] args) {
		double receita, despesas, lucro, percentual;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O VALOR DAS RECEITAS EDAS DESPESAS
		System.out.print("Valor da receita: R$ ");
		receita = sc.nextDouble();
		System.out.print("Valor das despesas: R$ ");
		despesas = sc.nextDouble();
		
		// CALCULA O LUCRO, O PERCENTUAL DE DESPESAS E OS IMPRIME
		lucro = receita - despesas;
		percentual = (despesas * 100) / receita;
		System.out.println("Lucro: R$ " + lucro);
		System.out.println("Percentual de despesas: " + percentual + "%");
		
		sc.close();
	}

}
