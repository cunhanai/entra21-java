package materiais.oop.tratamentoexcecao;

public class TesteComandoFinally {
	public static void main(String args[])
	  {
	    String frase = null;
	    String novaFrase = null;
	    try
	    {
	      //System.exit(0); não executa finally
	      novaFrase = frase.toUpperCase();// 
	     // int num = 8/0;// teste não tratando a exceção
	    
	 
	    }
	    catch(NullPointerException e)
	    {
	      System.out.println("A frase inicial está nula, para" +
	      " solucionar tal  problema, foi lhe atribuito um valor default.");
	      frase = "Frase vazia";
	      //System.exit(0); não executa finally
	    }
	    finally // é sempre executado. E OPCIONAL
	    {
	      novaFrase = frase.toUpperCase();
	      //System.out.println("Teste no finally não tratando a execeção");
	    }
	    System.out.println("Frase antiga: "+frase);
	    System.out.println("Frase nova: "+novaFrase);
	  }
	}
