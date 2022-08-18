package com.entra21.cursojavamanha.oop.listaexercicios.tratamentoexcecoes;

public class TesteException {

	public static void main(String[] args) {

		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do main");

	}
	
	static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo 1");

	}
	
	static void metodo2() {
		System.out.println("Incio do metodo2");
		int[] array = new int[10];
		for ( int i =0; i <= 15;i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}

}
