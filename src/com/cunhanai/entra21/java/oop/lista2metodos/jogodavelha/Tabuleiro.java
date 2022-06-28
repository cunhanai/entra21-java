/**
 * Jogo Da Velha
 * @date 2022-06-28
 * @author Ana Julia da Cunha - Entra21
 * 
 * 6. Reescreva o exercicio 7 da aula de Matrizes (Jogo da Velha). 
 * Desenvolva uma classe para representar o Jogo da Velha. Desenvolva 
 * uma classe para testar o Jogo.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.jogodavelha;

import java.util.Scanner;

public class Tabuleiro {
	
	char[][] tabuleiro = new char[3][3]; // tabuleiro do jogo
	int opcao; // opção para reiniciar ou encerrar partida
	int count = 0; // conta quantas posições já foram preenchidas
	public boolean jogadorX = true; // verifica se o jogador X é o jogador da vez
	boolean fim = false; // verifica se o jogo está finalizado ou em execução
	boolean vencedor = false; // verifica se há vencedor
	
	/**
	 * Imprime tabuleiro do Jogo da Velha.
	 */
	public void imprimirTabuleiro() {
		System.out.println("# JOGO DA VELHA #\n");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.printf(" %C %s", tabuleiro[i][j], (j == 2 ? "" : "|"));
			}
			System.out.println(i == 2 ? "\n" : "\n-----------");
		}
	}
	
	public boolean verificarJogada(int linha, int coluna) {
		if (linha > 3 || linha < 1 || coluna > 3 || coluna < 1) {
			// SE A LINHA OU A COLUNA FOR MAIOR 3 OU MENOR QUE 1, A JOGADA É INVÁLIDA
			return false;
		}
		else if (tabuleiro[linha-1][coluna-1] == 'X' || tabuleiro[linha-1][coluna-1] == 'O') {
			// SE A POSIÇÃO EM QUE DESEJA COLOCAR JÁ ESTIVER OCUPADA, A JOGADA É INVÁLIDA
			return false;
			
		}
		else {
			// SE A JOGADA FOR VÁLIDA
			return true;
		}
	}
	
	public void adicionarJogadas(int linha, int coluna) {
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
	
	/**
	 * Verifica se ha vencedor.
	 * @return <code>boolean</code> indicando se ha ou nao vencedor.
	 */
	boolean verificarVencedor() {
		for (int i = 0; i < tabuleiro.length; i++) {
			// SE UMA LINHA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
			if ((tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X')
					|| (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O')) {
				return true;
			}
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// SE UMA COLUNA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
				if ((tabuleiro[0][j] == 'X' && tabuleiro[1][j] == 'X' && tabuleiro[2][j] == 'X')
						|| (tabuleiro[0][j] == 'O' && tabuleiro[1][j] == 'O' && tabuleiro[2][j] == 'O')) {
					return true;
				}
				// SE UMA DIAGONAL ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', HÁ VENCEDOR
				else if ((tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')
						|| (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')
						|| (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')
						|| (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Verifica se o jogo acabou, seja por algum jogador vencer, ou pela quantidade de jogadas acabar.
	 * @return <code>boolean</code> caso o jogo esteja finalizado
	 */
	boolean verificarFim() {
		if (verificarVencedor()) {
			System.out.printf("%n%s %s %s", "Jogador", (jogadorX ? "O" : "X"), "venceu!!\n");
			encerrarJogo();
			return true;
		}
		else if (count == 9) {
			System.out.println("Deu velha! Ninguem venceu!");
			encerrarJogo();
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Reseta todos os dados do jogo.
	 */
	void zerarJogo() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = 0;				
			}
		}
		count = 0;
		jogadorX = true;
	}
	
	/**
	 * Encerra ou reinicia partida
	 * @return <code>boolean</code> se a partida foi encerrada ou não.
	 */
	public boolean encerrarJogo() {
		Scanner sc = new Scanner(System.in);
		if (verificarFim()) {
			while (true) {	
				// IMPRIME UM MENU DE OPÇÕES E PEDE A OPÇÃO DO USUÁRIO
				System.out.println("Deseja reiniciar a partida?\n");
				System.out.println("1 - Reiniciar");
				System.out.println("2 - Encerrar");
				opcao = sc.nextInt();
				sc.close();
				
				if (opcao == 1) {
					// SE A OPÇÃO FOR 1, RESETA TODOS OS DADOS E REINICIA O LOOP
					zerarJogo();
					return false;
				}
				else if (opcao == 2) {
					// SE A OPÇÃO FOR 2, ENCERRA O LOOP PRINCIPAL
					System.out.println("Encerrando jogo...");
					return true;
				}
				else {
					// SE NENHUMA DAS OPÇÕES DIGITADA FOR VÁLIDA, INFORMA AO USUÁRIO E PEDE NOVAMENTE
					System.out.println("Opção inválida! Por favor, escolha 1 ou 2!");
					return false;
				}
			}
		}
		sc.close();
		return false;
	}
}
