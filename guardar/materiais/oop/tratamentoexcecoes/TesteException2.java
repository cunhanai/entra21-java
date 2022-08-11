package com.entra21.cursojavamanha.oop.listaexercicios.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TesteException2 {

	public static void main(String[] args) {
		
		do {
			try {
				Scanner teclado = new Scanner(System.in);
				System.out.println(" Eu sei dividir");
				
				System.out.println("Informe o primeiro valor: ");
				int x = teclado.nextInt();
				
				System.out.println("Informe o segundo valor: ");
				int y = teclado.nextInt();
				double r = (x / y);
				
				System.out.println(" Resultado da divisão e " + r);	
			}
			catch(ArithmeticException e) {
				System.out.println(" Divisao por ZERO tente novamente"); 
			}
			catch(InputMismatchException e) {
				System.out.println("Você deve entrar com inteiro. Tente novamente");
			}
			
			
		}while(true);

	}
	
	
}
