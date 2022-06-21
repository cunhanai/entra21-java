/*
 * Questao 1 Lampada
 * @date 2022-06-21
 * @author Ana Julia da Cunha - Entra21
 * 
 * 1. Escreva uma classe para representar uma lâmpada que está à venda em 
 * um supermercado.
 */

package com.cunhanai.entra21.java.oop.lista1classeseatributos;

public class Questao1Lampada {
	
	int CODIGO; // codigo da lampada no banco de dados
	float preco; // preco da lampada
	int estoque; // quantidade de lampadas em estoque
	String marca; // marca da lampada
	String modelo; // modelo da lampada
	String tipo; // tipo de lampada (LED, flourescente, incandescente, filamento etc.)
	String formato; // formato de lampada (bolinha, bulbo, espiral, vela etc.)
	String cor; // cor da luz
	int vidaUtil; // vida util da lampada em horas
	int potencia; // potencia da lampada em W
	String tensao; // tensao eletrica (bivolt, autovolt)
	int fluxoLuminoso; // o quanto a lampada ilumina
}
