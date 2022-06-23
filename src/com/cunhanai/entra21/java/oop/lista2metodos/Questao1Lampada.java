/*
 * Questao 1 Lampada
 * @date 2022-06-23
 * @author Ana Julia da Cunha - Entra21
 * 
 * 1.Escreva uma classe para representar uma lâmpada. 
 * Desenvolva métodos para ligar, desligar, mostrarEstado e mudarEstado da lâmpada.
 * 
 * OBS.: PROF HELOISA, COMO COLOQUEI OS TESTES EM OUTRO PACKAGE, ESTAVA DANDO ERRO COM
 * A VISIBILIDADE DAS VARIAVEIS, ENTAO O ECLIPSE DISSE PARA EU MUDAR TODOS OS ATRIBUTOS
 * E METODOS PARA PUBLIC
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class Questao1Lampada {
	
	public String marca; // marca da lampada
	public String tipo; // tipo de lampada (LED, flourescente, incandescente, filamento etc.)
	public String formato; // formato de lampada (bolinha, bulbo, espiral, vela etc.)
	public String cor; // cor da luz
	public int potencia; // potencia da lampada em W
	public boolean ligada; // se a lampada esta ligada ou desligada
	
	/*
	 * Obtem o estado da lampada.
	 * @return um <code>boolean</code> especificando se esta ligada ou desligada.
	 */
	public boolean getEstado() {
		return ligada;
	}
	
	/*
	 * Liga a lampada.
	 * @return um <code>boolean</code> especificando que a lampada ligou
	 */
	public boolean ligarLampada() {
		return true;			
		
	}
	
	/*
	 * Liga a lampada.
	 * @return um <code>boolean</code> especificando que a lampada desligou
	 */
	public boolean desligarLampada() {
		return false;
		
	}
	
	/*
	 * Muda o status da lampada automaticamente, se esta ligada, desliga, se esta desligada, liga
	 */
	public void mudarEstado() {
		if (getEstado()) {
			ligada = desligarLampada();
		}
		else {
			ligada = ligarLampada();
		}
	}
	
	/*
	 * Mostra o estado da lampada no console.
	 */
	public String mostrarEstado() {
		return "Estado da lampada: " + (getEstado()? "ligada" : "desligada");
	}
}
