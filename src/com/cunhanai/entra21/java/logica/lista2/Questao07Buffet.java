/*
 * Questao 07 Buffet
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_7: Um restaurante self-service cobra R$ 20 por quilo nas refeicoes. Sabendo 
 * que, na hora de determinar o valor da refeicao, deve ser desconsiderado o peso do 
 * prato vazio (230 gramas), escreva um programa que receba como entrada o peso total 
 * do prato de um cliente em gramas e exiba o preço cobrado.
 * (Lembrete: 1 quilo = 1000 gramas)
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao07Buffet {

	
	public static void main(String[] args) {
		double pesoPrato, pesoComida, precoKg, total;
		pesoPrato = 230;
		precoKg = 20;
		
		// PEDE O PESO DA REFEIÇÃO CONTANDO COM O PESO DO PRATO AO USUÁRIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Peso da refeicao (contando o peso do prato): ");
		pesoComida = (sc.nextDouble() - pesoPrato) / 1000;
		
		// CALCULA O VALOR A SER PAGO E O IMPRIME
		total = pesoComida * precoKg;
		System.out.println("Peso: " + pesoComida + " kg\nValor a pagar: " + total);
		
		sc.close();
	}

}

