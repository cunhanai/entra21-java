/**
 * Jogo Da Velha
 * @author Ana Julia da Cunha - Entra21
 * @date 2022-06-30
 * 
 * 6. Reescreva o exercicio 7 da aula de Matrizes (Jogo da Velha). 
 * Desenvolva uma classe para representar o Jogo da Velha. Desenvolva 
 * uma classe para testar o Jogo.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();
		int opcao, linha, coluna, encerrar;
		
		// INICIALIZA O LOOP PRINCIPAL
		while (true) {
			tab.imprimirTabuleiro();
			
			// VERIFICA SE O JOGO ACABOU
			if (tab.verificarFim()) {
				// PEGA OPCAO DE REINICIO OU DE ENCERRAMENTO
				opcao = sc.nextInt();
				encerrar = tab.encerrarJogo(opcao);
				
				if (encerrar == -1) {
					break;
				}else if (encerrar == -2) {
					continue;
				}
				
			}
			
			// PEGA O JOGADOR DA VEZ (X OU Y)
			if (tab.getJogador() == true) {
				System.out.println("Vez do X\n");
			}else {
				System.out.println("Vez do O\n");
			}
			
			// PEGA A LINHA E A COLUNA DA JOGADA
			System.out.println("Linha: ");
			linha = sc.nextInt();
			System.out.println("Coluna: ");
			coluna = sc.nextInt();
			
			// VERIFICA SE A JOGADA E INVALIDA
			if (!tab.adicionarJogadas(linha, coluna)) {
				System.out.println("Jogada inválida! Jogue novamente.");
				
			sc.close(); // FECHA O SCANNER
			}
		}
		
	}

}
