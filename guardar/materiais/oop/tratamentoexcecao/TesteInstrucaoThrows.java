package materiais.oop.tratamentoexcecao;

public class TesteInstrucaoThrows {
	
	 private static void aumentarLetras() throws NullPointerException //lançando excessão
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
	    catch(NullPointerException e)// TRATANDO A EXCEÇÃO LANÇADA NO METODO aumentarLetras
	    {
	      System.out.println("Ocorreu um " +
	      "NullPointerException ao executar o método aumentarLetras() "+e);
	    }
	  }

}
