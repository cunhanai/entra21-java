package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

public class Codigo {
	
//	private String cod;
//	private long sequencial;
	private String codigo;
	  
	   public Codigo(String cod, long sequencial) {
//	        this.cod= cod;
//	        this.sequencial = sequencial;
	        codigo = cod + Long.valueOf(sequencial).toString();
	    }

//	public T getCodParte1() {
//		return codParte1;
//	}
//
//	public void setCodParte1(T codParte1) {
//		this.codParte1 = codParte1;
//	}
//
//	public U getCodParte2() {
//		return codParte2;
//	}

//	public void setCodParte2(U codParte2) {
//		this.codParte2 = codParte2;
//	}
	   

	    @Override
	    public String toString() {
	        return "" + codigo;
	    }

}
