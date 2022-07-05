package com.cunhanai.entra21.java.oop.lista3opp.testes;

import com.cunhanai.entra21.java.oop.lista3opp.Lampada;

public class LampadaTeste {

	public static void main(String[] args) {
		Lampada lampada = new Lampada(true);
		Lampada led = new Lampada("LED", 1000, false);
		
		lampada.mudarEstado();
		led.mudarEstado();
		
		System.out.println("Lampada esta " + (lampada.isLigada()? "ligada": "desligada"));
		System.out.println("LED esta " + (led.isLigada()? "ligada": "desligada"));
	}

}
