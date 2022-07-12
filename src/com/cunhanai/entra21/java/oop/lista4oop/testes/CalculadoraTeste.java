/**
 * Calculadora
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classer Calculadora do exercicio 2.
 */

package com.cunhanai.entra21.java.oop.lista4oop.testes;

import com.cunhanai.entra21.java.oop.lista4oop.Calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		System.out.println("Soma: " + Calculadora.somar(6, 3));		
		System.out.println("Subtracao: " + Calculadora.subtrair(6, 3));		
		System.out.println("Multiplicar: " + Calculadora.multiplicar(6, 3));		
		System.out.println("Dividir: " + Calculadora.dividir(6, 3));		
		System.out.println("Potenciacao: " + Calculadora.elevarPotencia(6, 3));		
	}

}
