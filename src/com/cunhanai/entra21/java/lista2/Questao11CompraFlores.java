/*
 * Questao 11 Compra Flores
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_11: O aniversário da mãe de Maria Clara está chegando e ela deseja presenteá-la
 * com flores. Maria Clara pesquisou preços e descobriu que uma rosa custa R$ 2,80, e que 
 * uma tulipa custa R$4,20. Agora, ela quer fazer algumas simulações para decidir quantas 
 * flores pode comprar com seu salário. Escreva um programa que receba como entrada uma 
 * quantidade de rosas e uma quantidade de tulipas e exiba o valor total necessário para 
 * comprá-las.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao11CompraFlores {

	public static void main(String[] args) {
		int qtdeRosas, qtdeTulipas;
		double valorRosas, valorTulipas, precoRosas, precoTulipas;
		Scanner sc = new Scanner(System.in);
		
		valorRosas = 2.8;
		valorTulipas = 4.2;
		
		// PEDE AO USUÁRIO A QUANTIDADE DE ROSAS E TULIPAS QUE PRETENDE COMPRAR
		System.out.print("Quantidade de rosas: ");
		qtdeRosas = sc.nextInt();
		System.out.print("Quantidade de tulipas: ");
		qtdeTulipas = sc.nextInt();
		
		// CALCULA O PREÇO DAS ROSAS E DAS TULIPAS
		precoRosas = qtdeRosas * valorRosas;
		precoTulipas = qtdeTulipas * valorTulipas;
		
		// IMPRIME OS VALORES
		System.out.println("Preço das rosas: R$ " + precoRosas);
		System.out.println("Preço das tulipas: R$ " + precoTulipas);
		
		sc.close();
	}

}



/*
Algoritmo "ex 11 - quantas flores comprar"
Var
qtdeRosas: inteiro
qtdeTulipas: inteiro
totalRosas: real
totalTulipas: real

Inicio
escreva("Digite a quantidade de rosas: ")
leia(qtdeRosas)
escreva("Digite a quantidade de tulipas: ")
leia(qtdeTulipas)

totalRosas <- qtdeRosas * 2.8
totalTulipas <- qtdeTulipas * 4.2

escreval("Total de Rosas: R$ ", totalRosas)
escreval("Total de Tulipas: R$ ", totalTulipas)
Fimalgoritmo
*/