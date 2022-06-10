/*
 * Questao 13 Triangulo
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_13: Faça um programa que leia três inteiros que representem os
 * lados de um triângulo. Primeiramente, verifique se os lados podem formar
 * um triângulo (a soma de dois lados não pode  ser  menor  que  o  terceiro 
 * lado).  Caso  possa  formar  um triângulo, indique se este é equilátero,
 * isósceles ou escaleno.
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao13Triangulo {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l1, l2, l3;
		boolean verif1, verif2, verif3;
		
		// PEDE OS LADOS DO TRIÂNGULO
		System.out.print("Lado 1: ");
		l1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		l2 = sc.nextDouble();
		System.out.print("Lado 3: ");
		l3 = sc.nextDouble();
		
		// VERIFICA SE OS LADOS FORMAM UM TRIÂNGULO
		verif1 = ((l1 + l2) > l3) ? true : false;
		verif2 = ((l2 + l3) > l1) ? true : false;
		verif3 = ((l1 + l3) > l2) ? true : false;
		
		if (verif1 && verif2 && verif3) {
			// SE SIM, IMPRIME O TIPO DE TRIÂNGULO
			if (l1 == l2 && l1 == l3) {
				System.out.println("Triângulo equilátero.");
			}
			else if (l1 == l2 || l1 == l3 || l2 == l3) {
				System.out.println("Triângulo isóceles.");
			}
			else {
				System.out.println("Triângulo escaleno.");
			}
		}
		else {
			// SE NÃO, INFORMA QUE NÃO É POSSÍVEL SE FORMAR UM TRIÂNGULO
			System.out.println("Não forma triângulo.");
		}
		
		sc.close();
	}

}
