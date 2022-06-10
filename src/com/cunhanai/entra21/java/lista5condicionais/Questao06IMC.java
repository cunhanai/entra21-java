/*
 * Questao 06 IMC
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_6: O IMC – Índice de Massa Corporal é um critério
 * da Organização Mundial de Saúde para dar uma indicação
 * sobre a condição de peso de uma pessoa adulta. A fórmula é
 * IMC = peso/(altura)². Elabore um PROGRAMA que leia o peso
 * e a altura de um adulto e mostre sua condição.
 * 
 * IMC EM ADULTOS		CONDIÇÃO
 * Abaixo de 18,5		Abaixo do peso
 * Entre 18,5 e 25		Peso normal
 * Entre 25 e 30		Acima do peso
 * Acima de 30			Obeso
 */

package com.cunhanai.entra21.java.lista5condicionais;
import java.util.Scanner;

public class Questao06IMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		String condicao;
		Scanner sc = new Scanner(System.in);
		
		// PEDE O PESO E A ALTURA AO USUÁRIO
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		
		// SE A ALTURA FOR INFORMADA EM CENTÍMETROS, TRANFORMA ELA PARA METROS
		if (altura > 2) {
			altura = altura / 100;
		}
		
		imc = peso / (altura * altura); // CALCULA O IMC DA PESSOA
		
		// VERIFICA A CONDIÇÃO DA PESSOA COM BASE NO IMC
		if (altura <= 0 || peso <= 0) {
			// SE A ALTURA E O PESO FOREM NULOS, INFORMA AO USUÁRIO
			condicao = "inexistente. Por favor, digite valores acima de zero.";
		}
		else if (imc < 18.5) {
			condicao = "abaixo do peso";
		}
		else if (imc >= 18.5 && imc < 25) {
			condicao = "peso normal";
		}
		else if (imc >= 25 && imc <= 30) {
			condicao = "acima do peso";
		}
		else {
			condicao = "obeso";
		}
		
		// IMPRIME A CONDIÇÃO DO IMC DA PESSOA
		System.out.printf("Para %.1f kg e %.2f m, o IMC é de %.1f e a condição é %s.", peso, altura, imc, condicao);
		
		sc.close();
	}

}
