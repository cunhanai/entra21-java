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

package com.cunhanai.entra21.java.lista8matrizes;

import java.util.Scanner;

public class Questao5AgendaMensal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][][] agenda = new String[12][][];
		int[] totDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int mes, dia, hora, opcao;
		
		// INICIALIZA UMA MATRIZ IRREGULAR A PARTIR DO TOTAL DE DIAS POR M�S INFORMADO
		// NA MATRIZ totDias
		for (int i = 0; i < agenda.length; i++) {
			agenda[i] = new String[totDias[i]][8];
		}
		
		// CRIA O LOOP PRINCIPAL
		loop1:
		while (true) {
			// IMPRIME O MENU
			System.out.println();
			System.out.println("========<VOC� DESEJA>========");
			System.out.println("| 1 - Adicionar compromisso |");
			System.out.println("| 2 - Consultar agenda      |");
			System.out.println("| 3 - Encerrar programa     |");
			System.out.println("=============================");
			opcao = sc.nextInt();
			
			System.out.println();
			
			// VERIFICA AS OP��ES DIGITADAS PELO USU�RIO
			if (opcao == 1) {
				loop2:
					while (true) {
						System.out.print("M�s do compromisso: ");
						mes = sc.nextInt();
						
						if (mes > 12 || mes < 1) {
							System.out.println("M�s inv�lido! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				
				loop2:
					while (true) {
						System.out.print("Dia do compromisso: ");
						dia = sc.nextInt();
						
						if (dia > agenda[mes-1].length || dia < 1) {
							System.out.println("Dia inv�lido! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				
				loop2:
					while (true) {
						System.out.print("Hora do compromisso: ");
						hora = sc.nextInt();
						
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inv�lida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				if (agenda[mes-1][dia-1][hora] == null) {
					System.out.println("Digite o compromisso:");
					agenda[mes-1][dia-1][hora] = sc.nextLine();
					agenda[mes-1][dia-1][hora] = sc.nextLine();
				}
				else {
					System.out.println("J� existe um compromisso agendado para esse m�s, dia e hora!");
					System.out.println("Compromisso: " + agenda[mes-1][dia-1][hora]);
				}
				
			}
			else if (opcao == 2) {
				loop2:
					while (true) {
						System.out.print("M�s do compromisso: ");
						mes = sc.nextInt();
						
						if (mes > 12 || mes < 1) {
							System.out.println("M�s inv�lido! Digite novamente.");
						}
						else {
							break loop2;
						}
					}
				
				loop2:
					while (true) {
						System.out.print("Dia do compromisso: ");
						dia = sc.nextInt();
						
						if (dia > agenda[mes-1].length || dia < 1) {
							System.out.println("Dia inv�lido! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				
				loop2:
					while (true) {
						System.out.print("Hora do compromisso: ");
						hora = sc.nextInt();
						
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inv�lida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				if (agenda[mes-1][dia-1][hora] == null) {
					System.out.printf("Nenhum compromisso agendado para o m�s %d, dia %d �s %d horas.", mes, dia, hora);
					System.out.println();
				}
				else {
					System.out.println(agenda[mes-1][dia-1][hora]);
				}
			}
			else if (opcao == 3) {
				System.out.println("Encerrando programa...");
				break loop1;
			}
			else {
				System.out.println("Op��o inv�lida! Digite uma das dispon�veis.");
				continue loop1;
			}
			
		}
		
		sc.close();
	}
}
