/*
 * Questao 09 Churrasco
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_9: Lucas resolveu organizar um churrasco para comemorar seu anivers�rio. A estimativa
 * � que cada pessoa consuma 500 gramas de carne e 6 latas de cerveja. Pelas pesquisas que ele fez
 * no supermercado de seu bairro, o quilo de carne custar� R$ 18 e cada cerveja sair� por R$ 1,70. 
 * Escreva um programa que receba como entrada a quantidade de pessoas que ir�o para o churrasco e
 * exiba o valor total que ele gastar� com carne e cerveja.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao09Churrasco {

	public static void main(String[] args) {
		int qtdePessoas, consumoCerveja;
		double consumoCarne, precoQuiloCarne, precoCerveja, calculoCarne, calculoCerveja;

		consumoCarne = 500;
		consumoCerveja = 6;
		precoQuiloCarne = 18;
		precoCerveja = 1.7;
		
		// PEDE A QUANTIDADE DE PESSOAS AO USU�RIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de pessoas: ");
		qtdePessoas = sc.nextInt();
		
		// CALCULA O VALOR DA CARNE E DA CERVEJA
		calculoCarne = (consumoCarne / 1000) * precoQuiloCarne * qtdePessoas;
		calculoCerveja = consumoCerveja * precoCerveja * qtdePessoas;
		
		// IMPRIME OS VALORES CALCULADOS
		System.out.println("A carne sair� entorno de R$ " + calculoCarne);
		System.out.println("A cerveja sair� entorno de R$ " + calculoCerveja);
		
		sc.close();
	}

}
