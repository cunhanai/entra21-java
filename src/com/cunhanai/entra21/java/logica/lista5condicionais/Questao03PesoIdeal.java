/*
 * Questao 03 Peso Ideal
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_3: Tendo como dados de entrada a altura e o sexo de  uma  pessoa, construa 
 * um PROGRAMA que  calcule  seu peso ideal, utilizando as seguintes fórmulas:
 * 
 * 		Para homens: (72.7*alt)-58;
 * 		Para mulheres: (62.1*alt)-44.7;
 */

package com.cunhanai.entra21.java.logica.lista5condicionais;

import java.util.Scanner;

public class Questao03PesoIdeal {
	
	public static void main(String[] args) {
		double pesoIdeal = 0, altura;
		int sexo;
		boolean controle = false;
		Scanner sc = new Scanner(System.in);
		
		// PEDE A ALTURA E O SEXO DO USUÁRIO
		System.out.print("Digite a altura: ");
		altura = sc.nextDouble();
		System.out.printf("%n%s%n%s%n%n", "[1] Feminino", "[2] Masculino");
		System.out.print("Digite o número correspondente ao o sexo: ");
		sexo = sc.nextInt();
		
		// CALCULA O PESO IDEAL DE ACORDO COM O SEXO
		switch (sexo) {
		case 1:
			pesoIdeal = (62.1 * altura) - 44.7;
			controle = true;
			break;
		case 2:
			pesoIdeal = (72.7 * altura) - 58;
			controle = true;
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		// SE ESTIVER TUDO CERTO COM O CÓDIGO, IMPRIME A ALTURA IDEAL DA PESSOA
		if (controle) {
			System.out.printf("Para altura de %.2f e sexo %s, o peso ideal é de %.1f kg.", altura, ((sexo == 1) ? "feminino":"masculino"), pesoIdeal);
		}
		
		sc.close();
	}
}
