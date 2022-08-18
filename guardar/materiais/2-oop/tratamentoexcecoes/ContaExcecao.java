package materiais.oop.tratamentoexcecoes;

public class ContaExcecao extends Exception {
	
	@Override
	public String getMessage() {
		return " Saldo negativo";
	}

}
