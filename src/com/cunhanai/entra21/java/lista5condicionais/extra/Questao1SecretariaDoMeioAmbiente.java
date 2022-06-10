/*
 * Questao1SecretariaDoMeioAmbiente
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao 1 - A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
 * indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de
 * 0 (zero) até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem
 * suas atividades, se o índice crescer para 0,4 as industrias do 1° e 2° grupo são intimadas a
 * suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem serem notificados a
 * paralisarem suas atividades. Faça um algoritmo que leia o índice de poluição medido e emita a 
 * notificação adequada aos diferentes grupos de empresas.
 */

package com.cunhanai.entra21.java.lista5condicionais.extra;

import java.util.Scanner;

public class Questao1SecretariaDoMeioAmbiente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double indice = 0;
		boolean controle = true, aceitavel;
		String grupos = "";
		
		// PEDE O ÍNDICE DE POLUIÇÃO AO USUÁRIO
		while (controle) {
			System.out.print("Digite o índice de poluição: ");
			indice = sc.nextDouble();
			
			// VERIFICA SE O ÍNDICE É VÁLIDO
			if (indice >= 0 && indice <= 0.5) {
				// SE SIM, QUEBRA O LOOP
				break;
			}
			else {
				// SE NÃO, CONTINUA E PEDE NOVAMENTE O ÍNDICE DE POLUIÇÃO
				System.out.println("O índice mínimo de poluição é 0 (zero) e o máximo é 0,5!");
				System.out.println("Por favor, digite um valor válido.\n");
			}
		}
		
		// VERIFICA O ÍNDICE VÁLIDO E SE OS GRUPOS SERÃO DISPENSADOS
		if (indice >= 0.5) {
			// SE FOR MAIOR OU IGUAL A 0.5, AS INDÚSTRIAS DE TODOS OS GRUPOS SÃO DISPENSADAS
			aceitavel = false;
			grupos = "de todos os grupos";
		}
		else if (indice >= 0.4) {
			// SE FOR MAIOR OU IGUAL A 0.4, E MENOR QUE 0.5, AS INDÚSTRIAS DO 1º E 2º GRUPO SÃO DISPENSADAS
			aceitavel = false;
			grupos = "do 1° e 2° grupo";
		}
		else if (indice >= 0.3) {
			// SE FOR MAIOR OU IGUAL A 0.3, E MENOR QUE 0.4, AS INDÚSTRIAS DO 1º GRUPO SÃO DISPENSADAS
			aceitavel = false;
			grupos = "do 1° grupo";
		}
		else {
			// SE O ÍNDICE DE POLUIÇÃO FOR ACEITÁVEL, NENHUMA DAS INDÚSTRIAS SÃO DISPENSADAS
			aceitavel = true;
		}
		
		// VERIFICA SE O ÍNDICE É ACETÁVEL OU NÃO E IMPRIME O RESULTADO
		if (aceitavel) {
			System.out.println("Os níveis de poluição estão aceitáveis.");
		}
		else {
			System.out.printf("%nO índice de poluíção está em %.2f, intimamos as indústrias %s a suspenderem suas atividades!", indice, grupos);
		}
		
		sc.close();
	}

}
