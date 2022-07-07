/**
 * Lampada
 * @date 2022-07-05
 * @author Ana Julia da Cunha - Entra21
 * 
 * 1.Escreva uma classe para representar uma lampada. Desenvolva metodos para ligar, desligar, mostrarEstado e mudarEstado da lampada.
 */

package com.cunhanai.entra21.java.oop.lista3opp;

public class Lampada {

	public String marca; // marca da lampada
	public String tipo; // tipo de lampada (LED, flourescente, incandescente, filamento etc.)
	public String formato; // formato de lampada (bolinha, bulbo, espiral, vela etc.)
	public String cor; // cor da luz
	public int potencia; // potencia da lampada em W
	public boolean ligada; // se a lampada esta ligada ou desligada

	public Lampada(String marca, String tipo, String formato, String cor, int potencia, boolean ligada) {
		this.marca = marca;
		this.tipo = tipo;
		this.formato = formato;
		this.cor = cor;
		this.potencia = potencia;
		this.ligada = ligada;
	}
	
	public Lampada(String tipo, int potencia, boolean ligada) {
		this.tipo = tipo;
		this.potencia = potencia;
		this.ligada = ligada;
	}
	
	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	/**
	 * Liga a lampada.
	 * @return um <code>boolean</code> especificando que a lampada ligou
	 */
	private boolean ligarLampada() {
		return true;			
		
	}
	
	/**
	 * Desliga a lampada.
	 * @return um <code>boolean</code> especificando que a lampada desligou
	 */
	private boolean desligarLampada() {
		return false;
		
	}
	
	/**
	 * Muda o status da lampada automaticamente, se esta ligada, desliga, se esta desligada, liga
	 */
	public void mudarEstado() {
		if (isLigada()) {
			setLigada(desligarLampada()); // DESLIGA A LAMPADA
		}
		else {
			setLigada(ligarLampada()); // LIGA A LAMPADA
		}
	}
}
