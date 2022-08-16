/**
 * Questao 2 - Lista 7 de OOP: Tratamento de Excecoes
 * @author Ana Julia da Cunha - Entra21
 * @date Agust, 2022
 * 
 * 2. Nesta questao voce deve identificar as partes problematicas do codigo e 
 * reescreve-lo utilizando tratamento de excecoes. Ou seja, devem ser identificadas 
 * todas as excecoes que podem ser levantadas e, para cada uma, deve ser dado 
 * o tratamento adequado que, nesse exercicio, significa alertar o usuario quanto 
 * ao problema. Entretanto, nesse programa a leitura dos valores deve ser feita, 
 * mesmo que para isso o usuario tenha que tentar informar varias vezes os valores 
 * na mesma execucao do programa.
 */

package com.cunhanai.entra21.java.oop.lista7excecoes;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int x, y;

		System.out.println("Eu sei dividir");

		do {
			try {
				System.out.println("Informe o primeiro valor: ");
				x = Integer.parseInt(teclado.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("O valor digitado nao e um numero inteiro. Por favor, digite novamente.");
			}
		} while (true);

		do {
			try {
				System.out.println("informe o segundo valor: ");
				y = Integer.parseInt(teclado.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("O valor digitado nao e um numero. Por favor, digite novamente.");
			} catch (ArithmeticException e) {
				System.out.println("Divisao nao pode ser por ZERO!! Por favor, digite outro numero!");
			}
		} while (true);

		double r = (x / y);

		System.out.println("Resultado da divisao: " + r);
	}
}
