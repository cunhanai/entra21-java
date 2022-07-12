package com.entra21.cursojavamanha.oop.exerciciospratica.variaveis.instanciaclassemetodosestaticos;

public class EscopoAtributosLocais {
	 private int valor; // colorcode da IDE identifica atributo de instancia azul

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	 
	 public int calculaValor(int valor) {
		 valor = valor + 10;
		 
		 return valor;// colorcode atributo do médoto cinza
		
	 }
	 
	 public int teste() {
		 
		 int valor = 5;
		 if(true) {
			 valor--;
		 }
		 
		 this.valor = valor; //this.valor referencia valor global/atributo de instancia
		//esse código alteraria valor atributo de instancia
		 return valor;
	 }
	 //3º
	 public void outroTeste() {
		 for(int i = 0; i<10; i++) {
			 System.out.println(i);
		 }
		// i++ // erro compilação
	
		 int j;
		 for(j = 0; j<10; j++) {
			 System.out.println(j);
		 }
		 
		 System.out.println(j); // j tem valor 10 
	 }
	 
	 //4º
	 public void maisUmTeste() {
		 
		 boolean flag = true;
		 if(flag) {
			 int umaVariavel = 10;
			 umaVariavel++;
			 System.out.println(umaVariavel); 
		 }
		 
		// System.out.println(umaVariavel); // erro de compilacao
		 
	 }
	 
}
