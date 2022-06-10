/*
 * Questao 4 Agenda Pessoal
 * @date 2022-06-07
 * @authors Ana Júlia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Questão_4: Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve
 * conter 24 horas inteiras, onde para cada uma destas 24 horas podemos associar um tarefa específica (compromisso agendado). 
 * O programa deve ter um menu onde o usuário indica o dia do mês que deseja agendar compromisso, a hora e em seguida entrando 
 * com o compromisso, ou então, o usuário pode também consultar a  agenda, fornecendo o dia e a hora para obter o compromisso 
 * armazenado. Dica. Usar estrutura de repetição para escolha no Menu.
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
			
			// IMPRIME O MENU E RECEBE A OPÇÃO VIA TECLADO
			System.out.println();
			System.out.println("========<VOCÊ DESEJA>========");
			System.out.println("| 1 - Adicionar compromisso |");
			System.out.println("| 2 - Consultar agenda      |");
			System.out.println("| 3 - Encerrar programa     |");
			System.out.println("=============================");
			opcao = sc.nextInt();
			
			System.out.println();
			
			// VERIFICA AS OPÇÕES
			if (opcao == 1) {
				// SE A OPÇÃO FOR 1, ADICIONA UM COMPROMISSO
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Dia do compromisso: ");
					dia = sc.nextInt();
					
					// VERIFICA SE O DIA É VÁLIDO OU NÃO
					if (dia > 30 || dia < 1) {
						System.out.println("Dia inválido! Digite novamente.");
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
					
					// VERIFICA SE A HORA É VÁLIDA OU NÃO
					if (hora > 23 || hora < 0) {
						System.out.println("Hora inválida! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				System.out.println();
				
				// VERIFICA SE NÃO HÁ NENHUM COMPROMISSO AGENDADO PARA AQUELE DIA E HORÁRIO
				if (agenda[dia-1][hora] == null) {
					// SE FOR VÁLIDO, PEDE O COMPROMISSO E O ADICIONA NA MATRIZ
					System.out.println("Digite o compromisso:");
					agenda[dia-1][hora] = sc.nextLine();
					agenda[dia-1][hora] = sc.nextLine();
				}
				else {
					// SE NÃO FOR, NÃO PERMITE ADICIONAR E INFORMA O COMPROMISSO JÁ EXISTENTE
					System.out.println("Já existe um compromisso agendado para esse dia e hora!");
					System.out.println("Compromisso: " + agenda[dia-1][hora]);
				}
				
			}
			else if (opcao == 2) {
				// SE A OPÇÃO FOR 2, CONSULTA A AGENDA
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
				while (true) {
					System.out.print("Dia do compromisso: ");
					dia = sc.nextInt();
					
					// VERIFICA SE O DIA É VÁLIDO OU NÃO
					if (dia > 30 || dia < 1) {
						System.out.println("Dia inválido! Digite novamente.");
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
					
					// VERIFICA SE A HORA É VÁLIDA OU NÃO
					if (hora > 23 || hora < 0) {
						System.out.println("Hora inválida! Digite novamente.");
						System.out.println();
					}
					else {
						break loop2;
					}
				}
				System.out.println();
				
				// VERIFICA SE HÁ UM COMPROMISSO AGENDADO PARA AQUELE DIA E HORÁRIO
				if (agenda[dia-1][hora] == null) {
					// SE NÃO HOUVER, INFORMA AO USUÁRIO
					System.out.printf("Nenhum compromisso agendado para o dia %d às %d horas.", dia, hora);
					System.out.println();
				}
				else {
					// SE HOUVER, IMPRIME-O
					System.out.println(agenda[dia-1][hora]);
				}
			}
			else if (opcao == 3) {
				// SE A OPÇÃO FOR 3, ENCERRA O PROGRAMA
				System.out.println("Encerrando programa...");
				break loop1;
			}
			else {
				// SE NENHUMA DAS OPÇÕES FOR VÁLIDA, INFORMA AO USUÁRIO E REINICIA O LOOP
				System.out.println("Opção inválida! Digite uma das disponíveis.");
				continue loop1;
			}
			
		}
		
		sc.close();
	}

}
