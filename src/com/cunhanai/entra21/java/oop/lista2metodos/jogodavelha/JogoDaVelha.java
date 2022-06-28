package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();
		int opcao, linha, coluna, encerrar;
		
		while (true) {
			tab.imprimirTabuleiro();
			if (tab.verificarFim()) {
				opcao = sc.nextInt();
				encerrar = tab.encerrarJogo(opcao);
				
				if (encerrar == -1) {
					break;
				}else if (encerrar == -2) {
					continue;
				}
				
			}
			
			if (tab.getJogador() == true) {
				System.out.println("Vez do X\n");
			}else {
				System.out.println("Vez do O\n");
			}
			
			System.out.println("Linha: ");
			linha = sc.nextInt();
			System.out.println("Coluna: ");
			coluna = sc.nextInt();
			
			if (tab.adicionarJogadas(linha, coluna) == 1) {
				System.out.println("Jogada inválida!");
			}
		}
		
	}

}
