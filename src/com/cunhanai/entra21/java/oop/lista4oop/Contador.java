/**
 * Contador
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 1. Escreva uma classe chamada Contador, que tem um atributo estatico que e incrementado sempre que a classe for instanciada. Crie metodos 
 * para zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar essa classe.
 */

package com.cunhanai.entra21.java.oop.lista4oop;

public class Contador {
	
	private static int contador;
	
	public Contador() {
		incrementar(); //INCREMENTA O ATRIBUTO ESTATICO SEMPRE QUE A CLASSE E INSTANCIADA
	}
	
	/**
	 * Retorna o valor do contador.
	 * @return o valor do contador em <code>int</code>.
	 */
	public static int getContador() {
		return Contador.contador;
	}

	/**
	 * Zera o valor do contador.
	 */
	public static void zerar() {
		Contador.contador = 0;
	}
	
	/**
	 * Incrementa mais um no valor do contador.
	 */
	public void incrementar() {
		Contador.contador++;
	}
}
