/*
 * Questao 09 Churrasco
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_9: Lucas resolveu organizar um churrasco para comemorar seu aniversario. A estimativa
 * e que cada pessoa consuma 500 gramas de carne e 6 latas de cerveja. Pelas pesquisas que ele fez
 * no supermercado de seu bairro, o quilo de carne custara R$ 18 e cada cerveja saira por R$ 1,70. 
 * Escreva um programa que receba como entrada a quantidade de pessoas que irao para o churrasco e
 * exiba o valor total que ele gastara com carne e cerveja.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao09Churrasco {

	public static void main(String[] args) {
		int qtdePessoas, consumoCerveja;
		double consumoCarne, precoQuiloCarne, precoCerveja, calculoCarne, calculoCerveja;

		consumoCarne = 500;
		consumoCerveja = 6;
		precoQuiloCarne = 18;
		precoCerveja = 1.7;
		
		// PEDE A QUANTIDADE DE PESSOAS AO USUARIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de pessoas: ");
		qtdePessoas = sc.nextInt();
		
		// CALCULA O VALOR DA CARNE E DA CERVEJA
		calculoCarne = (consumoCarne / 1000) * precoQuiloCarne * qtdePessoas;
		calculoCerveja = consumoCerveja * precoCerveja * qtdePessoas;
		
		// IMPRIME OS VALORES CALCULADOS
		System.out.println("A carne saira entorno de R$ " + calculoCarne);
		System.out.println("A cerveja saira entorno de R$ " + calculoCerveja);
		
		sc.close();
	}

}
