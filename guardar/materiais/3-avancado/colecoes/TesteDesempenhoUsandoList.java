package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;


import java.util.*;

public class TesteDesempenhoUsandoList {
	
	public static void main(String[] args) {
	    final int MAX = 20000;
	    long tInicio = System.currentTimeMillis();
	   // List<Integer> lista = new ArrayList<Integer>();
	    List<Integer> lista = new LinkedList<Integer>();
	    for (int i = 0; i < MAX; i++) {
	      lista.add(i);
	    }

	    for (int i = 0; i < MAX; i++) {
	      lista.contains(i);
	    }
	    long tFim = System.currentTimeMillis();
	    System.out.println("Tempo total: " + (tFim - tInicio));
	  }
}
