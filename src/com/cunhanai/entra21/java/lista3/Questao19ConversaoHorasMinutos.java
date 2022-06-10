/*
 * Questao 19 Conversao Horas Minutos
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questao_19: Faça um algoritmo que informando uma hora qualquer, retorne quantos minutos 
 * e segundos correspondem a hora informada.
 */

package com.cunhanai.entra21.java.lista3;
import java.util.Scanner;

public class Questao19ConversaoHorasMinutos {

	public static void main(String[] args) {
		int hora, minuto, segundo;
		Scanner sc = new Scanner(System.in);
		
		// PEDE UMA HORA QUALQUER AO USUÁRTIO EM FORMATO DE HORA
		System.out.print("Digite uma hora qualquer: ");
		hora = sc.nextInt();
		
		// CALCULA A QUANTIDADE DE MINUTOS E HORAS CORRESPONDENTES A ESSA HORA E OS IMPRIME
		minuto = hora * 60;
		segundo = hora * 3600;
		System.out.println(hora + " hora(s) corresponde a " + minuto + " minutos e " + segundo + " segundo");
		
		sc.close();
	}

}
