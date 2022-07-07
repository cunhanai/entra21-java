/**
 * Interface
 * @author Ana Julia da Cunha - Entra21
 * @date 2022-07-07
 * 
 * Interface (classe de "teste") para a classe JogoDaVelha
 */

package com.cunhanai.entra21.java.oop.lista3opp.jogodavelha;

import java.util.Scanner;

public class Interface {

	public static void main(String[] args) {
		// pegar o jogador quando for instanciar a classe JogoDaVelha

		Scanner sc = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		int opcao, linha, coluna, encerrar;

		// INICIALIZA O LOOP PRINCIPAL
		while (true) {
			jogo.imprimirTabuleiro();

			// VERIFICA SE O JOGO ACABOU
			if (jogo.verificarFim()) {			
				do {					
					opcao = sc.nextInt(); // PEGA A OPCAO DE INICIO OU ENCERRAMENTO 
					encerrar = jogo.encerrarJogo(opcao); // PEGA O RETORNO DO METODO
				} while (encerrar == 1); // SE O RETORNO DER 1 (JOGADA INVALIDA), O LOOP CONTINUA

				if (encerrar == -1) {
					// SE O RETORNO FOR -1, ENCERRA O JOGO.
					break;
				} else if (encerrar == -2) {
					// SE O RETORNO FOR -1, O JOGO REINICIA
					continue;
				}

			}

			// PEGA O JOGADOR DA VEZ (X OU Y)
			if (jogo.isJogadorX()) {
				System.out.println("Vez do X\n");
			} else {
				System.out.println("Vez do O\n");
			}

			// PEGA A LINHA E A COLUNA DA JOGADA
			System.out.println("Linha: ");
			linha = sc.nextInt();
			System.out.println("Coluna: ");
			coluna = sc.nextInt();

			// VERIFICA SE A JOGADA E INVALIDA
			if (!jogo.adicionarJogadas(linha, coluna)) {
				System.out.println("Jogada inválida! Jogue novamente.");

				sc.close(); // FECHA O SCANNER
			}
		}

	}

}
