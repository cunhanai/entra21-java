package com.cunhanai.entra21.java.avancado.lista1generic;

public class Codigo {

	public String codigo;
	
	public Codigo(String setor, int sequencial) {
		this.codigo = setor + sequencial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo;
	}
	
	// grupo 4: ana j (lider), ana pradela, lucas, claudia, wesley
}
