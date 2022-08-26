package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

import java.util.Scanner;

public class TesteTrataExcecao {
	
	public static void main(String args[])
	{
		 String frase = null;
		  String novaFrase = null;
		  try
		  {
		    novaFrase = frase.toUpperCase();
		  }
		  catch(NullPointerException e) //CAPTURA DA POSS�VEL EXCE��O.
		  {
		    //TRATAMENTO DA EXCE��O
		    System.out.println("A frase inicial est� nula," +
		    			"para solucional tal o problema, foi lhe atribuito um valor default.");
		    frase = "Frase vazia";
		    novaFrase = frase.toUpperCase();
		  }
		  System.out.println("Frase antiga: "+frase);
		  System.out.println("Frase nova: "+novaFrase);
	  
	 
	}

}
