package com.cunhanai.entra21.java.avancado.lista1generic;

public class Par<T, U> {
	
	public T p1;
	public U p2;
	
	public Par(T p1, U p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public T getP1() {
		return p1;
	}

	public void setP1(T p1) {
		this.p1 = p1;
	}

	public U getP2() {
		return p2;
	}

	public void setP2(U p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Par: " + p1 + " e " + p2;
	}
	
	
}
