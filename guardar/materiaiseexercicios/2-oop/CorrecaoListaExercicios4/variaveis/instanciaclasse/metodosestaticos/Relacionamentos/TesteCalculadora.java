package com.entra21.cursojavamanha.oop.listaexercicios.variaveis.instanciaclasse.metodosestaticos.Relacionamentos;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imprimirNaTela(Calculadora.soma(2, 5));
		imprimirNaTela(Calculadora.subtrair(1, 6));
		imprimirNaTela(Calculadora.multiplicar(2, 2));
		imprimirNaTela(Calculadora.dividir(4, 2));
		imprimirNaTela(Calculadora.potencia(2.0, 4.0));

	}
	
	static void imprimirNaTela(int num) {
		
		System.out.println(num);
		
	}
	
	static void imprimirNaTela(double num) {
		
		System.out.println(num);
	}

}
