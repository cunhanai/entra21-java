package com.entra21.cursojavamanha.oop.exerciciospratica.tratamentoexcecao;

public class SemLetraBException extends Exception {
	
	@Override
	  public String getMessage(){
	    return "N�o existe letra B em sua frase";
	  }

}
