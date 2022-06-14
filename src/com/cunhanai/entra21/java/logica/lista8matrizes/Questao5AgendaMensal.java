/*
 * Questao 5 Agenda Mensal
 * @date 2022-06-07
 * @authors Ana Júlia da Cunha - Entra21
 * 			Gabriel Rover - Entra21
 * 			Lucas Felipe Martins dos Santos - Entra21
 * 
 * Questão_5: Modifique o programa anterior (questão 4) de maneira a guardar os compromissos 
 * de todo o ano, organizados por mês, dia e hora (só 8 horas por dia).
 */

package com.cunhanai.entra21.java.logica.lista8matrizes;

import java.util.Scanner;

public class Questao5AgendaMensal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][][] agenda = new String[12][][]; // matriz que armazena os compromissos
		int[] totDias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // quantidade de dias em cada mês
		int opcao; // opção digitada pelo usuário
		int mes, dia, hora; // data e hora informada pelo usuário para registro dos compromossos
		
		// INICIALIZA UMA MATRIZ IRREGULAR A PARTIR DO TOTAL DE DIAS POR MÊS INFORMADO
		// NA MATRIZ totDias
		for (int i = 0; i < agenda.length; i++) {
			agenda[i] = new String[totDias[i]][8];
		}
		
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
				// SE A OPÇÃO FOR 1, ADICIONA UM COMPROMISSO NA AGENDA
				loop2:
					// PEDE O MÊS DO OCOMPROMISSO
					while (true) {
						System.out.print("Mês do compromisso: ");
						mes = sc.nextInt();
						
						// VERIFICA SE O MÊS É VÁLIDO
						if (mes > 12 || mes < 1) {
							System.out.println("Mês inválido! Digite novamente.");
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
						
						// VERIFICA SE O DIA É VÁLIDO
						if (dia > agenda[mes-1].length || dia < 1) {
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
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inválida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				// VERIFICA SE NÃO HÁ NENHUM COMPROMISSO AGENDADO PARA A DATA E HORA ESPECIFICADA
				if (agenda[mes-1][dia-1][hora] == null) {
					// SE FOR VÁLIDO, PEDE O COMPROMISSO E O ADICIONA NA MATRIZ
					System.out.println("Digite o compromisso:");
					agenda[mes-1][dia-1][hora] = sc.nextLine();
					agenda[mes-1][dia-1][hora] = sc.nextLine();
				}
				else {
					// SE NÃO FOR, NÃO PERMITE ADICIONAR E INFORMA O COMPROMISSO JÁ EXISTENTE
					System.out.println("Já existe um compromisso agendado para esse mês, dia e hora!");
					System.out.println("Compromisso: " + agenda[mes-1][dia-1][hora]);
				}
				
			}
			else if (opcao == 2) {
				// SE A OPÇÃO FOR 2, CONSULTA A AGENDA
				
				// PEDE O MES DO COMPROMISSO
				loop2:
					while (true) {
						System.out.print("Mês do compromisso: ");
						mes = sc.nextInt();
						
						// VERIFICA SE O MÊS É VÁLIDO
						if (mes > 12 || mes < 1) {
							System.out.println("Mês inválido! Digite novamente.");
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
						
						// VERIFICA SE O DIA É VÁLIDO
						if (dia > agenda[mes-1].length || dia < 1) {
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
						if (hora > 7 || hora < 0) {
							System.out.println("Hora inválida! Digite novamente.");
							System.out.println();
						}
						else {
							break loop2;
						}
					}
				System.out.println();
				
				// VERIFICA SE HÁ UM COMPROMISSO AGENDADO PARA AQUELE DIA E HORÁRIO
				if (agenda[mes-1][dia-1][hora] == null) {
					// SE NÃO HOUVER, INFORMA AO USUÁRIO
					System.out.printf("Nenhum compromisso agendado para o mês %d, dia %d às %d horas.", mes, dia, hora);
					System.out.println();
				}
				else {
					// SE HOUVER, IMPRIME-O
					System.out.println(agenda[mes-1][dia-1][hora]);
				}
			}
			else if (opcao == 3) {
				// SE A OPÇÃO FOR 3, ENCERRA O PROGRAMA
				System.out.println("Encerrando programa...");
				break loop1;
			}
			else {
				// SE NENHUMA DAS OPÇÕES FOR VÁLIDA, INFORMA AO USUÁRIO E REINICIA O LOOP PRINCIPAL
				System.out.println("Opção inválida! Digite uma das disponíveis.");
				continue loop1;
			}
			
		}
		
		sc.close();
	}
}
