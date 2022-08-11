package com.cunhanai.entra21.java.avancado.lambda;

import java.util.Scanner;

public class TesteLambdaCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			double n1, n2;
			int opcao;
			boolean flag;
			
			System.out.println("Numero 1: ");
			n1 = sc.nextDouble();
			
			System.out.println("Numero 2: ");
			n2 = sc.nextDouble();
			
			System.out.println("Escolha a opcao:"
					+ "\n1 - " + OpcoesMenu.SOMAR
					+ "\n2 - " + OpcoesMenu.SUBTRAIR
					+ "\n3 - " + OpcoesMenu.MULTIPLICAR
					+ "\n4 - " + OpcoesMenu.DIVIDIR
					+ "\n5 - " + OpcoesMenu.SAIR);
			opcao = sc.nextInt();
			
			flag = FazerOperacao(opcao, n1, n2);
			
			if (flag == true) {
				break;
			}
			
		} while (true);

		sc.close();
	}
	
	public static boolean FazerOperacao(int opcao, double n1, double n2) {
		
		boolean t = true;
		
		switch (opcao) {
		case 1:
			double soma = Calculadora.calcular(n1, n2, (x, y) -> x + y);
			System.out.println(soma);
			break;
		case 2:
			double subtrair = Calculadora.calcular(n1, n2, (x, y) -> x - y);
			System.out.println(subtrair);
			break;
		case 3:
			double multiplicar = Calculadora.calcular(n1, n2, (x, y) -> x * y);
			System.out.println(multiplicar);
			break;
		case 4:
			double dividir = Calculadora.calcular(n1, n2, (x, y) -> x / y);
			System.out.println(dividir);
			break;
		case 0:
			t = false;
			break;
		}
			return t;
	}

}
