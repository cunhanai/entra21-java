/**
 * Contador Teste
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classe Contador do exercicio 1.
 */

package com.cunhanai.entra21.java.oop.lista4oop.testes;

import com.cunhanai.entra21.java.oop.lista4oop.Contador;

public class ContadorTeste {

	public static void main(String[] args) {
		Contador contador1 = new Contador();
		System.out.println(Contador.getContador());
		
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		Contador contador4 = new Contador();
		Contador contador5 = new Contador();
		System.out.println(Contador.getContador());
		
		Contador.zerar();
		System.out.println(Contador.getContador());
	}

}
