/*
 * Questao 04 Celsius To Fahrenheit
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_4: Faça um algoritmo que receba uma temperatura em graus Celsius e
 * apresente-a em graus Fahrenheit, de acordo com a fórmula: ºF = (1.8ºC) +32.
 */

package com.cunhanai.entra21.java.lista2;
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
		System.out.println(fahrenheit + "ºF");
		
		sc.close();
	}
}

