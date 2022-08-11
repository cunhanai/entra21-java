package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class ValorMonetario<T> {
	
	private Double valorM;
	//private String simbolo;
	
	public ValorMonetario(Double valorM) {
		this.valorM = valorM;
	}

	public Double getValorM() {
		return valorM;
	}

	public void setValorM(Double valorM) {
		this.valorM = valorM;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "R$" + valorM;
	}

}
