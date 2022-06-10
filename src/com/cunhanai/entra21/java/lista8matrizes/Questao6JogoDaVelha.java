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

package com.cunhanai.entra21.java.lista8matrizes;

import java.util.Scanner;

public class Questao6JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] tabuleiro = new char[3][3]; // tabuleiro do jogo
		int linha, coluna; // posição de cada jogada
		int opcao; // opção para reiniciar ou encerrar partida
		int count = 0; // conta quantas posições já foram preenchidas
		boolean jogadorX = true; // verifica se o jogador X é o jogador da vez
		boolean fim = false; // verifica se o jogo está finalizado ou em execução
		boolean vencedor = false; // verifica se há vencedor
		
		System.out.println("# JOGO DA VELHA #");
		
		// CRIA O LOOP PRINCIPAL
		loop1:
		while (true) {
			// IMPRIME O TABULEIRO DO JOGO DA VELHA 
			System.out.println();
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {
					System.out.printf(" %C %s", tabuleiro[i][j], (j == 2 ? "" : "|"));
				}
				System.out.println(i == 2 ? "\n" : "\n-----------");
			}
			
			// VERIFICA SE HÁ VENCEDOR
			for (int i = 0; i < tabuleiro.length; i++) {
				// SE UMA LINHA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
				if ((tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X')
						|| (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O')) {
					vencedor = true;
				}
				
				for (int j = 0; j < tabuleiro[i].length; j++) {
					// SE UMA COLUNA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
					if ((tabuleiro[0][j] == 'X' && tabuleiro[1][j] == 'X' && tabuleiro[2][j] == 'X')
							|| (tabuleiro[0][j] == 'O' && tabuleiro[1][j] == 'O' && tabuleiro[2][j] == 'O')) {
						vencedor = true;
					}
					// SE UMA DIAGONAL ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
					else if ((tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
							|| (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')
							|| (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
							|| (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
						vencedor = true;
					}
				}
			}
			
			// VERIFICA SE HÁ VENCEDOR OU SE ACABARAM-SE AS JOGADAS E IMPRIME O RESULTADO 
			if (vencedor) {
				System.out.printf("%n%s %s %s", "Jogador", (jogadorX ? "O" : "X"), "venceu!!\n");
				fim = true;
			}
			else if (count == 9) {
				System.out.println("Deu velha! Ninguem venceu!");
				fim = true;
			}
			
			// VERIFICA SE O JOGO ACABOU
			if (fim) {
				while (true) {	
					// IMPRIME UM MENU DE OPÇÕES E PEDE A OPÇÃO DO USUÁRIO
					System.out.println("Deseja reiniciar a partida?\n");
					System.out.println("1 - Reiniciar");
					System.out.println("2 - Encerrar");
					opcao = sc.nextInt();
					
					if (opcao == 1) {
						// SE A OPÇÃO FOR 1, RESETA TODOS OS DADOS E REINICIA O LOOP
						tabuleiro = new char[3][3];
						count = 0;
						jogadorX = true;
						vencedor = false;
						fim = false;
						continue loop1;
					}
					else if (opcao == 2) {
						// SE A OPÇÃO FOR 2, ENCERRA O LOOP PRINCIPAL
						System.out.println("Encerrando jogo...");
						break loop1;
					}
					else {
						// SE NENHUMA DAS OPÇÕES DIGITADA FOR VÁLIDA, INFORMA AO USUÁRIO E PEDE NOVAMENTE
						System.out.println("Opção inválida! Por favor, escolha 1 ou 2!");
					}
				}
			}
			
			// JOGADAS DO USUÁRIO
			loop2:
			while (true) {
				// PEDE AO USUÁRIO DA VEZ A POSIÇÃO DE SUA JOGADA 
				System.out.printf("%n%s %S%n", "Vez do Jogador", (jogadorX ? "X" : "O"));
				System.out.print("Linha: ");
				linha = sc.nextInt();
				System.out.print("Coluna: ");
				coluna = sc.nextInt();
				
				// VERIFICA SE A JOGADA É VÁLIDA
				if (linha > 3 || linha < 1 || coluna > 3 || coluna < 1) {
					// SE A LINHA OU A COLUNA FOR MAIOR 3 OU MENOR QUE 1, A JOGADA É INVÁLIDA
					System.out.println("Jogada inválida! Por favor, digite valores entre 0 e 2.");
				}
				else if (tabuleiro[linha-1][coluna-1] == 'X' || tabuleiro[linha-1][coluna-1] == 'O') {
					// SE A POSIÇÃO EM QUE DESEJA COLOCAR JÁ ESTIVER OCUPADA, A JOGADA É INVÁLIDA
					System.out.println("Jogada inválida! Posição já está ocupada!");
				}
				else {
					// SE A JOGADA FOR VÁLIDA, QUEBRA O LOOP DA VERIFICAÇÃO
					break loop2;
				}
			}
			
			// ADICIONA AS JOGADAS NO TABULEIRO
			if (jogadorX) {
				// SE O JOGADOR FOR X:
				tabuleiro[linha-1][coluna-1] = 'X'; // ADICIONA UM X NA POSIÇÃO INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSIÇÕES OCUPADAS
				jogadorX = false; // DEFINE QUE O PRÓXIMO JOGADOR SERÁ O
			}
			else {
				// SE O JOGADOR FOR O:
				tabuleiro[linha-1][coluna-1] = 'O'; // ADICIONA UM O NA POSIÇÃO INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSIÇÕES OCUPADAS
				jogadorX = true; // DEFINE QUE O PRÓXIMO JOGADOR SERÁ 
			}
			
		}
		
		sc.close();
	}

}
