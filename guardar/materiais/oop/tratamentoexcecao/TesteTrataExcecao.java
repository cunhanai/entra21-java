package materiais.oop.tratamentoexcecao;

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
		  catch(NullPointerException e) //CAPTURA DA POSSÍVEL EXCEÇÃO.
		  {
		    //TRATAMENTO DA EXCEÇÃO
		    System.out.println("A frase inicial está nula," +
		    			"para solucional tal o problema, foi lhe atribuito um valor default.");
		    frase = "Frase vazia";
		    novaFrase = frase.toUpperCase();
		  }
		  System.out.println("Frase antiga: "+frase);
		  System.out.println("Frase nova: "+novaFrase);
	  
	 
	}

}
