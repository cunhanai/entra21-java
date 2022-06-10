package lista7arrays;

import java.util.Scanner;

public class Questao17LocacaoDVDs {

	/*
	 * Questão 17 - Escreva um programa que receba o nome de cinco clientes e armazene-os em 
	 * um vetor. Em um segundo vetor, armazene a quantidade de DVDs locados em 2022 por cada 
	 * um dos cinco clientes. Sabe-se que, para cada dez locações, o cliente tem direito a uma 
	 * locação grátis. O programa deverá mostrar todos os nomes dos clientes com a quantidade de 
	 * locação grátis que ele tem direito.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdeClientes = 5, qtdeLocGratis;
		String[] nome = new String[qtdeClientes];
		int[] qtdeDVDs = new int[qtdeClientes];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Nome do %dº cliente: ", i+1);
			nome[i] = sc.next();
			System.out.print("Quantidade de DVDs locados: ");
			qtdeDVDs[i] = sc.nextInt();
		}
		
		for (int i = 0; i < qtdeDVDs.length; i++) {
			qtdeLocGratis = (int)(qtdeDVDs[i] / 10);
			System.out.printf("%n%S tem direito a %d locações grátis.", nome[i], qtdeLocGratis);
		}
		
		sc.close();
	}

}
