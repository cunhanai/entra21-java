package materiais.oop.tratamentoexcecao;

public class SemLetraBException extends Exception {
	
	@Override
	  public String getMessage(){
	    return "N�o existe letra B em sua frase";
	  }

}
