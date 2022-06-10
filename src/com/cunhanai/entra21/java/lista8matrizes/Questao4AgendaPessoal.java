/*
 * Questao 4 Agenda Pessoal
 * @date 2022-06-07
 * @authors Ana J�lia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Quest�o_4: Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do m�s deve
 * conter 24 horas inteiras, onde para cada uma destas 24 horas podemos associar um tarefa espec�fica (compromisso agendado). 
 * O programa deve ter um menu onde o usu�rio indica o dia do m�s que deseja agendar compromisso, a hora e em seguida entrando 
 * com o compromisso, ou ent�o, o usu�rio pode tamb�m consultar a  agenda, fornecendo o dia e a hora para obter o compromisso 
 * armazenado. Dica. Usar estrutura de repeti��o para escolha no Menu.
 */

package com.cunhanai.entra21.java.lista8matrizes;

import java.util.Scanner;

public class Questao4AgendaPessoal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] agenda = new String[30][24];
		int dia, hora, opcao;
		
		// CRIA O LOOP PRINCIPAL
		loop1:
		while (true) {
			
			// IMPRIME O MENU E RECEBE A OP��O VIA TECLADO
			System.out.println();
			System.out.println("========<VOC� DESEJA>========");
			System.out.println("| 1 - Adicionar compromisso |");
			System.out.println("| 2 - Consultar agenda      |");
			System.out.println("| 3 - Encerrar programa     |");
			System.out.println("=============================");
			opcao = sc.nextInt();
			
			System.out.println();
			
			// VERIFICA AS OP��ES
			if (opcao == 1) {
				// SE A OP��O FOR 1, ADICIONA UM COMPROMISSO
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Dia do compromisso: ");
					dia = sc.nextInt();
					
					// VERIFICA SE O DIA � V�LIDO OU N�O
					if (dia > 30 || dia < 1) {
						System.out.println("Dia inv�lido! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				
				// PEDE A HORA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Hora do compromisso: ");
					hora = sc.nextInt();
					
					// VERIFICA SE A HORA � V�LIDA OU N�O
					if (hora > 23 || hora < 0) {
						System.out.println("Hora inv�lida! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				System.out.println();
				
				// VERIFICA SE N�O H� NENHUM COMPROMISSO AGENDADO PARA AQUELE DIA E HOR�RIO
				if (agenda[dia-1][hora] == null) {
					// SE FOR V�LIDO, PEDE O COMPROMISSO E O ADICIONA NA MATRIZ
					System.out.println("Digite o compromisso:");
					agenda[dia-1][hora] = sc.nextLine();
					agenda[dia-1][hora] = sc.nextLine();
				}
				else {
					// SE N�O FOR, N�O PERMITE ADICIONAR E INFORMA O COMPROMISSO J� EXISTENTE
					System.out.println("J� existe um compromisso agendado para esse dia e hora!");
					System.out.println("Compromisso: " + agenda[dia-1][hora]);
				}
				
			}
			else if (opcao == 2) {
				// SE A OP��O FOR 2, CONSULTA A AGENDA
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Dia do compromisso: ");
					dia = sc.nextInt();
					
					// VERIFICA SE O DIA � V�LIDO OU N�O
					if (dia > 30 || dia < 1) {
						System.out.println("Dia inv�lido! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				
				// PEDE A HORA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Hora do compromisso: ");
					hora = sc.nextInt();
					
					// VERIFICA SE A HORA � V�LIDA OU N�O
					if (hora > 23 || hora < 0) {
						System.out.println("Hora inv�lida! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				System.out.println();
				
				// VERIFICA SE H� UM COMPROMISSO AGENDADO PARA AQUELE DIA E HOR�RIO
				if (agenda[dia-1][hora] == null) {
					// SE N�O HOUVER, INFORMA AO USU�RIO
					System.out.printf("Nenhum compromisso agendado para o dia %d �s %d horas.", dia, hora);
					System.out.println();
				}
				else {
					// SE HOUVER, IMPRIME-O
					System.out.println(agenda[dia-1][hora]);
				}
			}
			else if (opcao == 3) {
				// SE A OP��O FOR 3, ENCERRA O PROGRAMA
				System.out.println("Encerrando programa...");
				break loop1;
			}
			else {
				// SE NENHUMA DAS OP��ES FOR V�LIDA, INFORMA AO USU�RIO E REINICIA O LOOP
				System.out.println("Op��o inv�lida! Digite uma das dispon�veis.");
				continue loop1;
			}
			
		}
		
		sc.close();
	}

}
