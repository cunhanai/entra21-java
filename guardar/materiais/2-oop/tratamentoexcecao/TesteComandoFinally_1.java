package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

public class TesteComandoFinally {
	public static void main(String args[])
	  {
	    String frase = null;
	    String novaFrase = null;
	    try
	    {
	      //System.exit(0); n�o executa finally
	      novaFrase = frase.toUpperCase();// 
	     // int num = 8/0;// teste n�o tratando a exce��o
	    
	 
	    }
	    catch(NullPointerException e)
	    {
	      System.out.println("A frase inicial est� nula, para" +
	      " solucionar tal  problema, foi lhe atribuito um valor default.");
	      frase = "Frase vazia";
	      //System.exit(0); n�o executa finally
	    }
	    finally // � sempre executado. E OPCIONAL
	    {
	      novaFrase = frase.toUpperCase();
	      //System.out.println("Teste no finally n�o tratando a exece��o");
	    }
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	  }
	}
