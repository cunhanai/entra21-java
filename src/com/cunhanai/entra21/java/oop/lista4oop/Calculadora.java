/**
 * Calculadora
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 2. Escreva uma classe Calculadora que tenha os seguintes metodos: somar, subtrair, multiplicar, dividir (dois numeros), elevar a potência 
 * n. Desenvolva um programa para testar essa classe.
 */

package com.cunhanai.entra21.java.oop.lista4oop;

public class Calculadora {

	public Calculadora() {

	}

	/**
	 * Soma dois numeros.
	 * 
	 * @param numero1 a ser somado.
	 * @param numero2 a ser somado.
	 * @return a soma em <code>double</code>.
	 */
	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}

	/**
	 * Subtrai dois numeros.
	 * 
	 * @param numero1 que sera subtraido.
	 * @param numero2 quantidade a subtrair.
	 * @return a subtracao de numero1-numero2 <code>double</code>.
	 */
	public static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}

	/**
	 * Multiplica dois numeros.
	 * 
	 * @param numero1 a ser multiplicado.
	 * @param numero2 a ser multiplicado.
	 * @return o produto em <code>double</code>.
	 */
	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	/**
	 * Divide dois numeros.
	 * 
	 * @param numero1 dividendo.
	 * @param numero2 divisoir.
	 * @return o quociente de numero1/numero2 em <code>double</code>.
	 */
	public static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	/**
	 * Eleva um numero a uma determinada potencia.
	 * 
	 * @param numero base.
	 * @param n      potencia.
	 * @return o resultado da potenciacao em <code>double</code>.
	 */
	public static double elevarPotencia(double numero, int n) {
		double resultado = numero;
		for (int i = 1; i < n; i++) {
			resultado *= numero;
		}
		return resultado;
	}
}
