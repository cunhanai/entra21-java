package materiais.oop.tratamentoexcecao;

public class TesteSemLetraBException {

	public static void main(String[] args){
		
		 String frase = "Sou um teste!";
		    if(!frase.contains("b") || !frase.contains("B"))
		    throw new SemLetraBException();
	}

}
