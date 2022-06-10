/*
 * Questao 6 Jogo Da Velha
 * @date 2022-06-09
 * @authors Ana Júlia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Questão_6: Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do 
 * jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informandoa posição 
 * onde deseja colocar a sua peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e determinar automaticamente 
 * quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar 
 * a situação do tabuleiro na tela.
 */

package com.cunhanai.entra21java.lista8matrizes;

import java.util.Scanner;

public class Questao6JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] tabuleiro = new char[3][3];
		int linha, coluna, opcao, count = 0;
		boolean jogadorX = true;
		boolean vencedor = false;
		boolean fim = false;
		
		System.out.println("# JOGO DA VELHA #");
		
		loop1:
		while (true) {
			System.out.println();
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.printf(" %C %s", tabuleiro[i][j], (j == 2 ? "" : "|"));
				}
				System.out.println(i == 2 ? "\n" : "\n-----------");
			}
			
			for (int i = 0; i < tabuleiro.length; i++) {
				if ((tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X')
						|| (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O')) {
					vencedor = true;
				}
				
				for (int j = 0; j < tabuleiro[i].length; j++) {
					if ((tabuleiro[0][j] == 'X' && tabuleiro[1][j] == 'X' && tabuleiro[2][j] == 'X')
							|| (tabuleiro[0][j] == 'O' && tabuleiro[1][j] == 'O' && tabuleiro[2][j] == 'O')) {
						vencedor = true;
					}
					else if ((tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
							|| (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')
							|| (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
							|| (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
						vencedor = true;
					}
				}
			}
			
			if (count == 9) {
				System.out.println("Deu velha! Ninguem venceu!");
				fim = true;
			}
			else if (vencedor) {
				System.out.printf("%n%s %s %s", "Jogador", (jogadorX ? "O" : "X"), "venceu!!\n");
				fim = true;
			}
			
			if (fim) {
				while (true) {					
					System.out.println("Deseja reiniciar a partida?\n");
					System.out.println("1 - Reiniciar");
					System.out.println("2 - Encerrar");
					opcao = sc.nextInt();
					
					if (opcao == 1) {
						tabuleiro = new char[3][3];
						count = 0;
						jogadorX = true;
						vencedor = false;
						fim = false;
						continue loop1;
					}
					else if (opcao == 2) {	
						System.out.println("Encerrando jogo...");
						break loop1;
					}
					else {
						System.out.println("Opção inválida! Por favor, escolha 1 ou 2!");
					}
				}
			}
			
			loop2:
			while (true) {
				System.out.printf("%n%s %S%n", "Vez do Jogador", (jogadorX ? "X" : "O"));
				System.out.print("Linha: ");
				linha = sc.nextInt();
				System.out.print("Coluna: ");
				coluna = sc.nextInt();
				
				if (linha > 2 || linha < 0 || coluna > 2 || coluna < 0) {
					System.out.println("Jogada inválida! Por favor, digite valores entre 0 e 2.");
				}
				else {
					break loop2;
				}
			}
			
			if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
				System.out.println("Jogada inválida! Posição já está ocupada!");
				continue;
			}
			
			
			if (jogadorX) {
				tabuleiro[linha][coluna] = 'X';
				count++;
				jogadorX = false;
			}
			else {
				tabuleiro[linha][coluna] = 'O';
				count++;
				jogadorX = true;
			}
			
		}
		
		sc.close();
	}

}
