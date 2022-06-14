/*
 * Questao 08 Velocidade Media
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_8: Faca um algoritmo que leia o nome de um piloto, uma distancia percorrida
 * em km e o tempo que o piloto levou para percorre-la (em horas). O programa deve 
 * calcular a velocidade media (Velocidade = Distancia / Tempo) em km/h, e exibir a 
 * seguinte frase: “A velocidade media de <nome do piloto> foi <velocidade media calculada> km/h”.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao08VelocidadeMedia {

	public static void main(String[] args) {
		double distancia, tempo, velocidade;
		String nomePiloto;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O NOME DO PILOTO, A DISTANCIA PERCORRIDA (EM HORAS) E O TEMPO QUE ELE LEVOU PARA PERCORRER
		System.out.print("Nome do piloto: ");
		nomePiloto = sc.nextLine();
		System.out.print("Distancia (em horas): ");
		distancia = sc.nextDouble();
		System.out.print("Tempo: ");
		tempo = sc.nextDouble();
		
		// CALCULA A VELOCIDADE MEDIA E A IMPRIME
		velocidade = distancia / tempo;
		System.out.println("A velocidade media de " + nomePiloto + " foi " + velocidade + "km/h");
		
		sc.close();
	}

}
