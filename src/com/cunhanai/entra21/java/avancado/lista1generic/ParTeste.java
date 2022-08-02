package com.cunhanai.entra21.java.avancado.lista1generic;

public class ParTeste {

	public static void main(String[] args) {
		
		// ATRIBUTOS
		String nomeAluno = "Ana";
		double notaAluno = 10;
		int codFunc = 12345;
		String nomeFunc = "Heloisa";
		float x = 1.23f;
		float y = 3;
		
		// TESTES
		Par<String, Double> par1 = new Par<String, Double>(nomeAluno, notaAluno);
		Par<Integer, String> par2 = new Par<Integer,String>(codFunc, nomeFunc);
		Par<Float, Float> par3 = new Par<Float, Float>(x, y);

		// PRINTS
		System.out.println(par1);
		System.out.println(par2);
		System.out.println(par3);
	}

}
