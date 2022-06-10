/*
 * Questao 08 Velocidade Media
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_8: Faça um algoritmo que leia o nome de um piloto, uma distância percorrida
 * em km e o tempo que o piloto levou para percorrê-la (em horas). O programa deve 
 * calcular a velocidade média (Velocidade = Distância / Tempo) em km/h, e exibir a 
 * seguinte frase: “A velocidade média de <nome do piloto> foi <velocidade media calculada> km/h”.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao08VelocidadeMedia {

	public static void main(String[] args) {
		double distancia, tempo, velocidade;
		String nomePiloto;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O NOME DO PILOTO, A DISTÂNCIA PERCORRIDA (EM HORAS) E O TEMPO QUE ELE LEVOU PARA PERCORRER
		System.out.print("Nome do piloto: ");
		nomePiloto = sc.nextLine();
		System.out.print("Distância (em horas): ");
		distancia = sc.nextDouble();
		System.out.print("Tempo: ");
		tempo = sc.nextDouble();
		
		// CALCULA A VELOCIDADE MÉDIA E A IMPRIME
		velocidade = distancia / tempo;
		System.out.println("A velocidade média de " + nomePiloto + " foi " + velocidade + "km/h");
		
		sc.close();
	}

}
