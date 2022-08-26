package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class CodigoGenerico<T,U> {
	
	private T codParte1;
	private U codParte2;
	//private T codigo;
	  
	   public CodigoGenerico(T parte1, U parte2) {
	        this.codParte1 = parte1;
	        this.codParte2 = parte2;
	    }

	public T getCodParte1() {
		return codParte1;
	}

	public void setCodParte1(T codParte1) {
		this.codParte1 = codParte1;
	}

	public U getCodParte2() {
		return codParte2;
	}

	public void setCodParte2(U codParte2) {
		this.codParte2 = codParte2;
	}
	   

	    @Override
	    public String toString() {
	        return "" + this.getCodParte1() + this.getCodParte2();
	    }

}
