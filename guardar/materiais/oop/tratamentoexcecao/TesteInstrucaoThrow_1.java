package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

public class TesteInstrucaoThrow {
	private static void aumentarLetras() throws Exception //lan�ando exce��o
	  {
	    String frase = null;
	    String novaFrase = null;
	    try
	    {
	      novaFrase = frase.toUpperCase();
	    }
	    catch(NullPointerException e)
	    {
	      throw new Exception(e);
	    }
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	  }
	  public static void main(String args[])
	  {
	    try
	    {
	      aumentarLetras();
	    }
	    catch(Exception e)
	    {
	      System.out.println("Ocorreu uma exce��o ao " +
	      "executar o m�todo aumentarLetras() "+e);
	    }
	  }
}
