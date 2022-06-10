/*
 * Questao 08 Velocidade Media
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_8: Fa�a um algoritmo que leia o nome de um piloto, uma dist�ncia percorrida
 * em km e o tempo que o piloto levou para percorr�-la (em horas). O programa deve 
 * calcular a velocidade m�dia (Velocidade = Dist�ncia / Tempo) em km/h, e exibir a 
 * seguinte frase: �A velocidade m�dia de <nome do piloto> foi <velocidade media calculada> km/h�.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao08VelocidadeMedia {

	public static void main(String[] args) {
		double distancia, tempo, velocidade;
		String nomePiloto;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O NOME DO PILOTO, A DIST�NCIA PERCORRIDA (EM HORAS) E O TEMPO QUE ELE LEVOU PARA PERCORRER
		System.out.print("Nome do piloto: ");
		nomePiloto = sc.nextLine();
		System.out.print("Dist�ncia (em horas): ");
		distancia = sc.nextDouble();
		System.out.print("Tempo: ");
		tempo = sc.nextDouble();
		
		// CALCULA A VELOCIDADE M�DIA E A IMPRIME
		velocidade = distancia / tempo;
		System.out.println("A velocidade m�dia de " + nomePiloto + " foi " + velocidade + "km/h");
		
		sc.close();
	}

}
