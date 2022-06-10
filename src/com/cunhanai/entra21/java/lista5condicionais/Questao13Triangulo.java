/*
 * Questao 13 Triangulo
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_13: Fa�a um programa que leia tr�s inteiros que representem os
 * lados de um tri�ngulo. Primeiramente, verifique se os lados podem formar
 * um tri�ngulo (a soma de dois lados n�o pode  ser  menor  que  o  terceiro 
 * lado).  Caso  possa  formar  um tri�ngulo, indique se este � equil�tero,
 * is�sceles ou escaleno.
 */

package com.cunhanai.entra21.java.lista5condicionais;

import java.util.Scanner;

public class Questao13Triangulo {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l1, l2, l3;
		boolean verif1, verif2, verif3;
		
		// PEDE OS LADOS DO TRI�NGULO
		System.out.print("Lado 1: ");
		l1 = sc.nextDouble();
		System.out.print("Lado 2: ");
		l2 = sc.nextDouble();
		System.out.print("Lado 3: ");
		l3 = sc.nextDouble();
		
		// VERIFICA SE OS LADOS FORMAM UM TRI�NGULO
		verif1 = ((l1 + l2) > l3) ? true : false;
		verif2 = ((l2 + l3) > l1) ? true : false;
		verif3 = ((l1 + l3) > l2) ? true : false;
		
		if (verif1 && verif2 && verif3) {
			// SE SIM, IMPRIME O TIPO DE TRI�NGULO
			if (l1 == l2 && l1 == l3) {
				System.out.println("Tri�ngulo equil�tero.");
			}
			else if (l1 == l2 || l1 == l3 || l2 == l3) {
				System.out.println("Tri�ngulo is�celes.");
			}
			else {
				System.out.println("Tri�ngulo escaleno.");
			}
		}
		else {
			// SE N�O, INFORMA QUE N�O � POSS�VEL SE FORMAR UM TRI�NGULO
			System.out.println("N�o forma tri�ngulo.");
		}
		
		sc.close();
	}

}
