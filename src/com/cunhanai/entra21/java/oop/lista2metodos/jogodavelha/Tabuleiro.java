package jogodavelha;

public class Tabuleiro {

	char[][] tabuleiro = new char[3][3];
	int count = 0;
	public boolean jogadorX = true;
	
	public void imprimirTabuleiro() {
		System.out.println("\n# JOGO DA VELHA #\n");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.printf(" %C %s", tabuleiro[i][j], (j == 2 ? "" : "|"));
			}
			System.out.println(i == 2 ? "\n" : "\n-----------");
		}
	}
	
	public boolean getJogador() {
		return jogadorX;
	}
	
	public int adicionarJogadas(int linha, int coluna) {
		if (verificarJogada(linha, coluna)) {
			if (getJogador()) {
				// SE O JOGADOR FOR X:
				tabuleiro[linha-1][coluna-1] = 'X'; // ADICIONA UM X NA POSI��O INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSI��ES OCUPADAS
				jogadorX = false; // DEFINE QUE O PR�XIMO JOGADOR SER� O
				return 0;
			}
			else {
				// SE O JOGADOR FOR O:
				tabuleiro[linha-1][coluna-1] = 'O'; // ADICIONA UM O NA POSI��O INFORMADA
				count++; // ADICIONA +1 A CONTAGEM DE POSI��ES OCUPADAS
				jogadorX = true; // DEFINE QUE O PR�XIMO JOGADOR SER�
				return 0;
			}  
			
		}
		else {
			return 1;
		}
		
	}
	
	boolean verificarJogada(int linha, int coluna) {
		if (linha > 3 || linha < 1 || coluna > 3 || coluna < 1) {
			// SE A LINHA OU A COLUNA FOR MAIOR 3 OU MENOR QUE 1, A JOGADA � INV�LIDA
			return false;
		}
		else if (tabuleiro[linha-1][coluna-1] == 'X' || tabuleiro[linha-1][coluna-1] == 'O') {
			// SE A POSI��O EM QUE DESEJA COLOCAR J� ESTIVER OCUPADA, A JOGADA � INV�LIDA
			return false;
			
		}
		else {
			// SE A JOGADA FOR V�LIDA
			return true;
		}
	}
	
	
	/**
	 * Verifica se ha vencedor.
	 * @return <code>boolean</code> indicando se ha ou nao vencedor.
	 */
	boolean verificarVencedor() {
		for (int i = 0; i < tabuleiro.length; i++) {
			// SE UMA LINHA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', H� VENCEDOR
			if ((tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X')
					|| (tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O')) {
				return true;
			}
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// SE UMA COLUNA ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', H� VENCEDOR
				if ((tabuleiro[0][j] == 'X' && tabuleiro[1][j] == 'X' && tabuleiro[2][j] == 'X')
						|| (tabuleiro[0][j] == 'O' && tabuleiro[1][j] == 'O' && tabuleiro[2][j] == 'O')) {
					return true;
				}
				// SE UMA DIAGONAL ESTIVER EXCLUSIVAMENTE PREENCHIDA COM 'X' OU 'O', H� VENCEDOR
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
			imprimirMenuFim();
			return true;
		}
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
	 * @return <code>boolean</code> se a partida foi encerrada ou n�o.
	 */
	public int encerrarJogo(int opcao) {
		if (verificarFim()) {	
			if (opcao == 1) {
				// SE A OP��O FOR 1, RESETA TODOS OS DADOS E REINICIA O LOOP
				zerarJogo();
				return -2;
			}
			else if (opcao == 2) {
				// SE A OP��O FOR 2, ENCERRA O LOOP PRINCIPAL
				System.out.println("Encerrando jogo...");
				return -1;
			}
			else {
				// SE NENHUMA DAS OP��ES DIGITADA FOR V�LIDA, INFORMA AO USU�RIO E PEDE NOVAMENTE
				System.out.println("\nOp��o inv�lida! Por favor, escolha 1 ou 2!");
				return 1;
			}
			
		}
		return 0;
	}
	
	void imprimirMenuFim() {
		// IMPRIME UM MENU DE OP��ES E PEDE A OP��O DO USU�RIO
		System.out.println("\nDeseja reiniciar a partida?\n");
		System.out.println("1 - Reiniciar");
		System.out.println("2 - Encerrar");
	}
}
