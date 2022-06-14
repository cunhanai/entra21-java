/* 
 * Questao 02 Canculo Lanhouse
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_2: Escreva um algoritmo que receba como entrada o total de minutos
 * usados por um cliente e exiba o valor a ser pago por ele. Sabe-se que a 
 * lanhouse cobra R$ 2,30 por cada hora de acesso (Lembrete: 1 hora = 60 minutos).
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista1;
import java.util.Scanner;

public class Questao02CalculoLanhouse {
	public static void main(String[] args) {
		float COBRANCA = 2.3f; // VALOR COBRADO PELA LANHOUSE POR HORA
		float consumo, valorPago;
		
		// PEDE O TOTAL DE MINUTOS CONSUMIDOS PELO CLIENTE NA LANHOUSE
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de minutos de consumo: ");
		consumo = sc.nextFloat();
		
		// CALCULA O VALOR A SER PAGO E O IMPRIME
		valorPago = (consumo / 60) * COBRANCA;
		System.out.println("Valor a ser pago: " + valorPago);
		
		sc.close();
	}
}
