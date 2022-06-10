package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao20GeradorNumerosSoma {

	/*
	 * Questão 20 – Altere o programa anterior para mostrar no final a soma dos números.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aux, sum = 0;
		String token;
		
		System.out.println("Digite dois números inteiros.");
		System.out.print("Primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.printf("%nOs números compreendidos no intervalo de %d e %d são: ", num1, num2);
		for (int i = num1+1; i < num2; i++) {
			token = (i == (num2-1)) ? "." : ", " ;
			System.out.print(i + token);
			
			sum += i;
		}
		
		System.out.printf("%n%s: %d", "A soma de todos os números é", sum);
		sc.close();
	}

}
