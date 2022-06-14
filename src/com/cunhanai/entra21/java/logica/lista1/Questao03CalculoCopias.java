/*
 * Questao 03 Calculo Copias
 * @date Maio 2022
 * @author Ana Julia da Cunha
 * 
 * Questao_3: Sabendo que a Copiadora da Faculdade Mauricio de Nassau cobra R$ 0,08 
 * por cada copia feita, escreva um programa que receba como entrada a quantidade de
 * folhas de um livro e exiba o valor total a ser pago para copia-lo.
 * (Lembrete: cada folha corresponde a duas paginas, frente e verso).
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista1;
import java.util.Scanner;

public class Questao03CalculoCopias {
	
	public static void main(String[] args) {
		double qtdeFolhas, total, valorCopia = 0.08;
		int frenteVerso = 2;
		
		// PEDE A QUANTIDADE DE FOLHAS A SER IMPRESSA AO USUARIO
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de folhas: ");
		qtdeFolhas = sc.nextDouble();
		
		// CALCULA O VALOR A SER PAGO E O IMPRIME
		total = qtdeFolhas * valorCopia * frenteVerso;
		System.out.println("Valor a ser pago: R$ " + total);
		
		sc.close();
	}
}
