/*
 * Questao 15 Area Quadrado
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_15: Faça um algoritmo em que o operador informando o lado de um quadrado 
 * obtenha como resultado a área do mesmo
 */

package com.cunhanai.entra21.java.lista3;
import java.util.Scanner;
import java.lang.Math;

public class Questao15AreaQuadrado {
	
	public static void main(String[] args) {
		double lado, area;
		
		// PEDE AO USUÁRIO A ÁREA DO QUADRADO
		Scanner sc = new Scanner(System.in);
		System.out.print("Área do quadrado: ");
		lado = sc.nextDouble();
		
		// CALCULA A ÁREA E O IMPRIMA
		area = Math.pow(lado, 2);
		System.out.println("Área: " + area);
		
		sc.close();
	}
}
