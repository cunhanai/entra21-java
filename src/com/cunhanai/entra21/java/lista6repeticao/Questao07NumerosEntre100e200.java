package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao07NumerosEntre100e200 {
	
	/*
	 * Quest�o 7 - Fa�a um programa que leia v�rios n�meros e informe quantos desses 
	 * n�meros entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o programa
	 * dever� encerrar sua execu��o.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		int between = 0;
		
		while (true) {
			System.out.print("Digite um n�mero: ");
			num = sc.nextDouble();
			
			if (num == 0) {
				break;
			}
			else if (num >= 100 && num <= 200) {
				++between;
			}
		}
		if (between != 0) {
			System.out.printf("%s digitados %d %s entre 100 e 200.", (between > 1)? "Foram" : "Foi", between, (between > 1)? "n�meros" : "n�mero");
		}
		else {
			System.out.println("N�o foram digitados n�meros entre 100 e 200.");
		}
		
		sc.close();
	}

}
