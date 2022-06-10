/*
 * Questao 09 Churrasco
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_9: Lucas resolveu organizar um churrasco para comemorar seu aniversário. A estimativa
 * é que cada pessoa consuma 500 gramas de carne e 6 latas de cerveja. Pelas pesquisas que ele fez
 * no supermercado de seu bairro, o quilo de carne custará R$ 18 e cada cerveja sairá por R$ 1,70. 
 * Escreva um programa que receba como entrada a quantidade de pessoas que irão para o churrasco e
 * exiba o valor total que ele gastará com carne e cerveja.
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
		
		// PEDE A QUANTIDADE DE PESSOAS AO USUÁRIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de pessoas: ");
		qtdePessoas = sc.nextInt();
		
		// CALCULA O VALOR DA CARNE E DA CERVEJA
		calculoCarne = (consumoCarne / 1000) * precoQuiloCarne * qtdePessoas;
		calculoCerveja = consumoCerveja * precoCerveja * qtdePessoas;
		
		// IMPRIME OS VALORES CALCULADOS
		System.out.println("A carne sairá entorno de R$ " + calculoCarne);
		System.out.println("A cerveja sairá entorno de R$ " + calculoCerveja);
		
		sc.close();
	}

}
