package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

public class TesteSemLetraBException {

	public static void main(String[] args){
		
		 String frase = "Sou um teste!";
		    if(!frase.contains("b") || !frase.contains("B"))
		    throw new SemLetraBException();
	}

}
