/**
 * Conta Excecao
 * @author Ana Julia da Cunha - Entra21
 * @date Agust, 2022
 * 	
 * 3. Suponha que o metodo "saca" da classe Conta vai ser rescrito de forma 
 * a lancar uma excecao criada por voce, cuja classe e ContaExcecao (extends 
 * Exception). A excecao e lancada sempre que o saldo da conta for inferior ao 
 * valor sacado. Implemente a classe ContaExcecao. Implemente o metodo saca 
 * que lanca a excecao. E rescreva o codigo da caixa com o devido tratamento da
 * excecao.
 */

package com.cunhanai.entra21.java.oop.lista7excecoes.questoes3e4;

public class ContaExcecao extends Exception {

	@Override
	public String getMessage() {
		return "\nSALDO INFERIOR AO VALOR SACADO!!";
	}

}
