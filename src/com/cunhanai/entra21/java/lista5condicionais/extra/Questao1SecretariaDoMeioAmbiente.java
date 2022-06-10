/*
 * Questao1SecretariaDoMeioAmbiente
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao 1 - A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
 * ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de
 * 0 (zero) at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem
 * suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a
 * suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem serem notificados a
 * paralisarem suas atividades. Fa�a um algoritmo que leia o �ndice de polui��o medido e emita a 
 * notifica��o adequada aos diferentes grupos de empresas.
 */

package com.cunhanai.entra21.java.lista5condicionais.extra;

import java.util.Scanner;

public class Questao1SecretariaDoMeioAmbiente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double indice = 0;
		boolean controle = true, aceitavel;
		String grupos = "";
		
		// PEDE O �NDICE DE POLUI��O AO USU�RIO
		while (controle) {
			System.out.print("Digite o �ndice de polui��o: ");
			indice = sc.nextDouble();
			
			// VERIFICA SE O �NDICE � V�LIDO
			if (indice >= 0 && indice <= 0.5) {
				// SE SIM, QUEBRA O LOOP
				break;
			}
			else {
				// SE N�O, CONTINUA E PEDE NOVAMENTE O �NDICE DE POLUI��O
				System.out.println("O �ndice m�nimo de polui��o � 0 (zero) e o m�ximo � 0,5!");
				System.out.println("Por favor, digite um valor v�lido.\n");
			}
		}
		
		// VERIFICA O �NDICE V�LIDO E SE OS GRUPOS SER�O DISPENSADOS
		if (indice >= 0.5) {
			// SE FOR MAIOR OU IGUAL A 0.5, AS IND�STRIAS DE TODOS OS GRUPOS S�O DISPENSADAS
			aceitavel = false;
			grupos = "de todos os grupos";
		}
		else if (indice >= 0.4) {
			// SE FOR MAIOR OU IGUAL A 0.4, E MENOR QUE 0.5, AS IND�STRIAS DO 1� E 2� GRUPO S�O DISPENSADAS
			aceitavel = false;
			grupos = "do 1� e 2� grupo";
		}
		else if (indice >= 0.3) {
			// SE FOR MAIOR OU IGUAL A 0.3, E MENOR QUE 0.4, AS IND�STRIAS DO 1� GRUPO S�O DISPENSADAS
			aceitavel = false;
			grupos = "do 1� grupo";
		}
		else {
			// SE O �NDICE DE POLUI��O FOR ACEIT�VEL, NENHUMA DAS IND�STRIAS S�O DISPENSADAS
			aceitavel = true;
		}
		
		// VERIFICA SE O �NDICE � ACET�VEL OU N�O E IMPRIME O RESULTADO
		if (aceitavel) {
			System.out.println("Os n�veis de polui��o est�o aceit�veis.");
		}
		else {
			System.out.printf("%nO �ndice de polu���o est� em %.2f, intimamos as ind�strias %s a suspenderem suas atividades!", indice, grupos);
		}
		
		sc.close();
	}

}
