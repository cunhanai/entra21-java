/*
 * Questao 04 Celsius To Fahrenheit
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_4: Faça um algoritmo que receba uma temperatura em graus Celsius e
 * apresente-a em graus Fahrenheit, de acordo com a formula: F = (1.8 * C) + 32.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao04CelsiusToFahrenheit {
	
	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		// PEDE A TEMPERATURA EM GRAUS CELSIUS
		Scanner sc = new Scanner(System.in);
		System.out.print("Graus Celsius (ºC): ");
		celsius = sc.nextDouble();
		
		// CALCULA A TEMPERATURA EM FAHRENHEIT E A IMPRIME
		fahrenheit = (1.8 * celsius) + 32;
		System.out.println(fahrenheit + "F");
		
		sc.close();
	}
}

