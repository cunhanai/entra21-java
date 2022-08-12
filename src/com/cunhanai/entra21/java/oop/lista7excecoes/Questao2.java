package com.cunhanai.entra21.java.oop.lista7excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x, y;

		System.out.println("Eu sei dividir");

		do {
			try {
				System.out.println("Informe o primeiro valor: ");
				x = teclado.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("O valor digitado nao e um numero inteiro. Por favor, digite novamente.");
			}
		} while (true);

		do {
			try {
				System.out.println("informe o segundo valor: ");
				y = teclado.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("O valor digitado nao e um numero. Por favor, digite novamente.");
			}
		} while (true);

		double r = (x / y);

		System.out.println("Resultado da divisao: " + r);
	}
}
