package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao07NumerosEntre100e200 {
	
	/*
	 * Questão 7 - Faça um programa que leia vários números e informe quantos desses 
	 * números entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o programa
	 * deverá encerrar sua execução.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		int between = 0;
		
		while (true) {
			System.out.print("Digite um número: ");
			num = sc.nextDouble();
			
			if (num == 0) {
				break;
			}
			else if (num >= 100 && num <= 200) {
				++between;
			}
		}
		if (between != 0) {
			System.out.printf("%s digitados %d %s entre 100 e 200.", (between > 1)? "Foram" : "Foi", between, (between > 1)? "números" : "número");
		}
		else {
			System.out.println("Não foram digitados números entre 100 e 200.");
		}
		
		sc.close();
	}

}
