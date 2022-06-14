package com.cunhanai.entra21.java.logica.lista6repeticao;

public class Questao10NumMaior1000 {
	
	/*
	 * Questão 10 - Escreva um PROGRAMA que encontre o quinto número maior que 1000, cuja 
	 * divisão por 11 tenha resto 5
	 */
	
	public static void main(String[] args) {
		int num = 0, n = 1001;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1000; j < n; j++) {
				if ((j % 11) == 5) {
					num = j;
				}
				else {
					n += 1;
				}
			}
		}
		System.out.println("O 5° número é: " + num);
	}

}
