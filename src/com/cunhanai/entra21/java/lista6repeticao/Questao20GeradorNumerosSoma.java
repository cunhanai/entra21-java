package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao20GeradorNumerosSoma {

	/*
	 * Quest�o 20 � Altere o programa anterior para mostrar no final a soma dos n�meros.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, aux, sum = 0;
		String token;
		
		System.out.println("Digite dois n�meros inteiros.");
		System.out.print("Primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		System.out.printf("%nOs n�meros compreendidos no intervalo de %d e %d s�o: ", num1, num2);
		for (int i = num1+1; i < num2; i++) {
			token = (i == (num2-1)) ? "." : ", " ;
			System.out.print(i + token);
			
			sum += i;
		}
		
		System.out.printf("%n%s: %d", "A soma de todos os n�meros �", sum);
		sc.close();
	}

}
