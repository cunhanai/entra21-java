/*
 * Questao 11 Compra Flores
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_11: O anivers�rio da m�e de Maria Clara est� chegando e ela deseja presente�-la
 * com flores. Maria Clara pesquisou pre�os e descobriu que uma rosa custa R$ 2,80, e que 
 * uma tulipa custa R$4,20. Agora, ela quer fazer algumas simula��es para decidir quantas 
 * flores pode comprar com seu sal�rio. Escreva um programa que receba como entrada uma 
 * quantidade de rosas e uma quantidade de tulipas e exiba o valor total necess�rio para 
 * compr�-las.
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
		
		// PEDE AO USU�RIO A QUANTIDADE DE ROSAS E TULIPAS QUE PRETENDE COMPRAR
		System.out.print("Quantidade de rosas: ");
		qtdeRosas = sc.nextInt();
		System.out.print("Quantidade de tulipas: ");
		qtdeTulipas = sc.nextInt();
		
		// CALCULA O PRE�O DAS ROSAS E DAS TULIPAS
		precoRosas = qtdeRosas * valorRosas;
		precoTulipas = qtdeTulipas * valorTulipas;
		
		// IMPRIME OS VALORES
		System.out.println("Pre�o das rosas: R$ " + precoRosas);
		System.out.println("Pre�o das tulipas: R$ " + precoTulipas);
		
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