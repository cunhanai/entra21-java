/**
 * Questao 1 - Lista 7 de OOP: Tratamento de Excecoes
 * @author Ana Julia da Cunha - Entra21
 * @date Agust, 2022
 * 
 * 1. O codigo abaixo lança uma exceção (propositalmente) e interrompe sua execucao.
 * Utilizando o tratamento de excecoes, corrija a classe com o objetivo de nao parar sua execucao.
 * OBS:: A Exception lancada e ArrayIndexOutOfBoundsException.
 */

package com.cunhanai.entra21.java.oop.lista7excecoes;

public class Questao1 {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");

		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			try {
				array[i] = i;
				System.out.println(i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro!! Estourou o tamanho do array!");
				System.out.println("Erro: " + e);
				System.out.println("Consertando erro...");

				int[] arrayAux = array;
				array = new int[16];
				for (int j = 0; j < arrayAux.length; j++) {
					array[j] = arrayAux[j];
				}
				i--;

			}
		}

		System.out.println("fim do metodo2");
	}

}
