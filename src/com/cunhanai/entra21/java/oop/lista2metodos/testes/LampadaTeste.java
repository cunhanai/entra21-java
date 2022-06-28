/*
 * Questao 1 Lampada Teste
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * Crie uma classe de testes para testar a classe lampada.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.testes;

import com.cunhanai.entra21.java.oop.lista2metodos.Lampada;

public class LampadaTeste {
	
	public static void main(String[] args) {
		Lampada lampadaLED = new Lampada();
		lampadaLED.marca = "Philips";
		lampadaLED.tipo = "LED";
		lampadaLED.cor = "branca";
		lampadaLED.formato = "bulbo";
		lampadaLED.potencia = 60;
		lampadaLED.ligada = false;
		
		lampadaLED.mudarEstado(); // liga
		System.out.println(lampadaLED.mostrarEstado());
		
		lampadaLED.mudarEstado(); // desliga
		System.out.println(lampadaLED.mostrarEstado());
		
		lampadaLED.mudarEstado(); // liga
		System.out.println(lampadaLED.mostrarEstado());
		
		lampadaLED.mudarEstado(); // desliga
		System.out.println(lampadaLED.mostrarEstado());
	}

}
