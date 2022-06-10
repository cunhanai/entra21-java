/* 
 * Questao 02 Canculo Lanhouse
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_2: Escreva um algoritmo que receba como entrada o total de minutos
 * usados por um cliente e exiba o valor a ser pago por ele. Sabe-se que a 
 * lanhouse cobra R$ 2,30 por cada hora de acesso (Lembrete: 1 hora = 60 minutos).
 */

package com.cunhanai.entra21.java.lista1;
import java.util.Scanner;

public class Questao02CalculoLanhouse {
	public static void main(String[] args) {
		float cobranca, consumo, valorPago;
		cobranca = 2.3f;
		
		// PEDE O TOTAL DE MINUTOS CONSUMIDOS PELO CLIENTE NA LANHOUSE
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de minutos de consumo: ");
		consumo = sc.nextFloat();
		
		// CALCULA O VALOR A SER PAGO E O IMPRIME
		valorPago = (consumo / 60) * cobranca;
		System.out.println("O valor a ser pago é: " + valorPago);
		
		sc.close();
	}
}
