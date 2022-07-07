/**
 * Lampada Teste
 * @date 2022-07-05
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classe Lampada, do exercicio 1.
 */

package com.cunhanai.entra21.java.oop.lista3opp.testes;

import com.cunhanai.entra21.java.oop.lista3opp.Lampada;

public class LampadaTeste {

	public static void main(String[] args) {
		Lampada lampada = new Lampada(true); // LAMPADA INSTANCIADA COM O CONSTRUTOR MAIS SIMPLES 
		Lampada led = new Lampada("LED", 1000, false); // LAMPADA INSTANCIADA COM UM CONSTRUTOR MENOS COMPLETO
		
		lampada.mudarEstado(); // DESLIGA A LAMPADA
		led.mudarEstado(); // LIGA A LAMPADA LED
		
		// MOSTRA O ESTADO
		System.out.println("Lampada esta " + (lampada.isLigada()? "ligada": "desligada"));
		System.out.println("LED esta " + (led.isLigada()? "ligada": "desligada"));
	}

}
