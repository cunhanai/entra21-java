/**
 * Tabuleiro
 * @author Ana Julia da Cunha - Entra21
 * @date 2022-06-30
 * 
 * 6. Reescreva o exercicio 7 da aula de Matrizes (Jogo da Velha). 
 * Desenvolva uma classe para representar o Jogo da Velha. Desenvolva 
 * uma classe para testar o Jogo.
 */

package com.cunhanai.entra21.java.oop.lista2metodos.jogodavelha;

public class Tabuleiro {

	char[][] tabuleiro = new char[3][3];
	int count = 0;
	public boolean jogadorX = true;
	
	/**
	 * Imprimir tabuleiro do jogo na tela.
	 */
	public void imprimirTabuleiro() {
		System.out.println("\n# JOGO DA VELHA #\n");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.printf(" %C %s", tabuleiro[i][j], (j == 2 ? "" : "|"));
			}
			System.out.println(i == 2 ? "\n" : "\n-----------");
		}
	}
	
	/**
	 * Pega o estado do jogador X.
	 * @return retorna <code>true</code> se o jogador X for o jogador da vez, <code>false</code> se nao.
	 */
	public boolean getJogador() {
		return jogadorX;
	}
	
	/**
	 * Adiciona uma jogada ao tabuleiro.
	 * @param linha da jogada.
	 * @param coluna da jogada.
	 * @return um <code>boolean</code> se a jogada foi adicionada ou se a jogada não foi.
	 */
	public boolean adicionarJogadas(int linha, int coluna) {
		if (verificarJogada(linha, coluna)) {
			if (getJogador()) {
				// SE O JOGADOR FOR X:
				tabuleiro[linha-1][coluna-1] = 'X'; // ADICIONA UM X NA POSIÇÃO INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSIÇÕES OCUPADAS
				jogadorX = false; // DEFINE QUE O PRÓXIMO JOGADOR SERÁ O
				return true;
			}
			else {
				// SE O JOGADOR FOR O:
				tabuleiro[linha-1][coluna-1] = 'O'; // ADICIONA UM O NA POSIÇÃO INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSIÇÕES OCUPADAS
				jogadorX = true; // DEFINE QUE O PRÓXIMO JOGADOR SERÁ
				return true;
			}  
			
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * Verifica se a jogada e valida ou invalida.
	 * @param linha
	 * @param coluna
	 * @return <code>true</code> se for valida ou <code>false</code> se nao for.
	 */
	boolean verificarJogada(int linha, int coluna) {
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
		// VERIFICA SE HA VENCEDOR
		if (verificarVencedor()) {
			System.out.printf("%n%s %s %s", "Jogador", (jogadorX ? "O" : "X"), "venceu!!\n");
			imprimirMenuFim();
			return true;
		}
		// VERIFICA SE DEU VELHA
		else if (count == 9) {
			System.out.println("Deu velha! Ninguem venceu!");
			imprimirMenuFim();
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	* Imprime o menu final para encerrar ou reiniciar a partida.
	*/
	void imprimirMenuFim() {
		// IMPRIME UM MENU DE OPÇÕES E PEDE A OPÇÃO DO USUÁRIO
		System.out.println("\nDeseja reiniciar a partida?\n");
		System.out.println("1 - Reiniciar");
		System.out.println("2 - Encerrar");
	}
	
	/**
	 * Encerra ou reinicia partida
	 * @return <code>boolean</code> se a partida foi encerrada ou não.
	 */
	public int encerrarJogo(int opcao) {
		if (verificarFim()) {	
			if (opcao == 1) {
				// SE A OPÇÃO FOR 1, RESETA TODOS OS DADOS E REINICIA O LOOP
				zerarJogo();
				return -2;
			}
			else if (opcao == 2) {
				// SE A OPÇÃO FOR 2, ENCERRA O LOOP PRINCIPAL
				System.out.println("Encerrando jogo...");
				return -1;
			}
			else {
				// SE NENHUMA DAS OPÇÕES DIGITADA FOR VÁLIDA, INFORMA AO USUÁRIO E PEDE NOVAMENTE
				System.out.println("\nOpção inválida! Por favor, escolha 1 ou 2!");
				return 1;
			}
			
		}
		return 0;
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
}
