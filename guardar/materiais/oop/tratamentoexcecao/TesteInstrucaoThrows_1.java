package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

public class TesteInstrucaoThrows {
	
	 private static void aumentarLetras() throws NullPointerException //lan�ando excess�o
	  {
	    String frase = null;
	    String novaFrase = null;
	    novaFrase = frase.toUpperCase();
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	  }

	  public static void main(String args[])
	  {
	    try
	    {
	      aumentarLetras();
	    }
	    catch(NullPointerException e)// TRATANDO A EXCE��O LAN�ADA NO METODO aumentarLetras
	    {
	      System.out.println("Ocorreu um " +
	      "NullPointerException ao executar o m�todo aumentarLetras() "+e);
	    }
	  }

}
