package materiais.oop.tratamentoexcecao;

public class TesteTrataExcecoes {

	public static void main(String[] args) {
		
		String frase = null;
	    String novaFrase = null;
	    novaFrase = frase.toUpperCase();
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
		
		
	
//		  try
//		  {
//		    novaFrase = frase.toUpperCase();
//		  }
//		  catch(NullPointerException e) //CAPTURA DA POSS�VEL exce��o.
//		  {
//		    //TRATAMENTO DA exce��o
//		    System.out.println("A frase inicial est� nula,"
//		    + "para solucional tal o problema, foi lhe atribuito um valor default.");
//		    frase = "Frase vazia";
//		    novaFrase = frase.toUpperCase();
//		  }
//		  System.out.println("Frase antiga: "+frase);
//		  System.out.println("Frase nova: "+novaFrase);

	}

}
