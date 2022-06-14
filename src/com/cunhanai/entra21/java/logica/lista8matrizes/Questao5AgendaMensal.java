/*
 * Questao 5 Agenda Mensal
 * @date 2022-06-07
 * @authors Ana J�lia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Quest�o_5: Modifique o programa anterior (quest�o 4) de maneira a guardar os compromissos 
 * de todo o ano, organizados por m�s, dia e hora (s� 8 horas por dia).
 */

package com.cunhanai.entra21.java.logica.lista8matrizes;

import java.util.Scanner;

public class Questao5AgendaMensal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][][] agenda = new String[12][][]; // matriz que armazena os compromissos
		int[] totDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // quantidade de dias em cada m�s
		int opcao; // op��o digitada pelo usu�rio
		int mes, dia, hora; // data e hora informada pelo usu�rio para registro dos compromossos
		
		// INICIALIZA UMA MATRIZ IRREGULAR A PARTIR DO TOTAL DE DIAS POR M�S INFORMADO
		// NA MATRIZ totDias
		for (int i = 0; i < agenda.length; i++) {
			agenda[i] = new String[totDias[i]][8];
		}
		
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
				// SE A OP��O FOR 1, ADICIONA UM COMPROMISSO NA AGENDA
				loop2:
					// PEDE O M�S DO OCOMPROMISSO
					while (true) {
						System.out.print("M�s do compromisso: ");
						mes = sc.nextInt();
						
						// VERIFICA SE O M�S � V�LIDO
						if (mes > 12 || mes < 1) {
							System.out.println("M�s inv�lido! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
					while (true) {
						System.out.print("Dia do compromisso: ");
						dia = sc.nextInt();
						
						// VERIFICA SE O DIA � V�LIDO
						if (dia > agenda[mes-1].length || dia < 1) {
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
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inv�lida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				// VERIFICA SE N�O H� NENHUM COMPROMISSO AGENDADO PARA A DATA E HORA ESPECIFICADA
				if (agenda[mes-1][dia-1][hora] == null) {
					// SE FOR V�LIDO, PEDE O COMPROMISSO E O ADICIONA NA MATRIZ
					System.out.println("Digite o compromisso:");
					agenda[mes-1][dia-1][hora] = sc.nextLine();
					agenda[mes-1][dia-1][hora] = sc.nextLine();
				}
				else {
					// SE N�O FOR, N�O PERMITE ADICIONAR E INFORMA O COMPROMISSO J� EXISTENTE
					System.out.println("J� existe um compromisso agendado para esse m�s, dia e hora!");
					System.out.println("Compromisso: " + agenda[mes-1][dia-1][hora]);
				}
				
			}
			else if (opcao == 2) {
				// SE A OP��O FOR 2, CONSULTA A AGENDA
				
				// PEDE O MES DO COMPROMISSO
				loop2:
					while (true) {
						System.out.print("M�s do compromisso: ");
						mes = sc.nextInt();
						
						// VERIFICA SE O M�S � V�LIDO
						if (mes > 12 || mes < 1) {
							System.out.println("M�s inv�lido! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				
				// PEDE O DIA DO COMPROMISSO
				loop2:
					while (true) {
						System.out.print("Dia do compromisso: ");
						dia = sc.nextInt();
						
						// VERIFICA SE O DIA � V�LIDO
						if (dia > agenda[mes-1].length || dia < 1) {
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
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inv�lida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				// VERIFICA SE H� UM COMPROMISSO AGENDADO PARA AQUELE DIA E HOR�RIO
				if (agenda[mes-1][dia-1][hora] == null) {
					// SE N�O HOUVER, INFORMA AO USU�RIO
					System.out.printf("Nenhum compromisso agendado para o m�s %d, dia %d �s %d horas.", mes, dia, hora);
					System.out.println();
				}
				else {
					// SE HOUVER, IMPRIME-O
					System.out.println(agenda[mes-1][dia-1][hora]);
				}
			}
			else if (opcao == 3) {
				// SE A OP��O FOR 3, ENCERRA O PROGRAMA
				System.out.println("Encerrando programa...");
				break loop1;
			}
			else {
				// SE NENHUMA DAS OP��ES FOR V�LIDA, INFORMA AO USU�RIO E REINICIA O LOOP PRINCIPAL
				System.out.println("Op��o inv�lida! Digite uma das dispon�veis.");
				continue loop1;
			}
			
		}
		
		sc.close();
	}
}
