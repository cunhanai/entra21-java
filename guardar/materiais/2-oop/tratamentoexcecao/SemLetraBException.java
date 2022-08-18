package materiais.oop.tratamentoexcecao;

public class SemLetraBException extends Exception {
	
	@Override
	  public String getMessage(){
	    return "Não existe letra B em sua frase";
	  }

}
