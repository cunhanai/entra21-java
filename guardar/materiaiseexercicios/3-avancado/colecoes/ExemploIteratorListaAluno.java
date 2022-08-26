package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class ExemploIteratorListaAluno {
	
	public static void main(String[] args) {
	    List<Aluno> lista = new ArrayList<Aluno>();

	    Aluno a = new Aluno("João da Silva", "Linux básico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    lista.add(a);
	    lista.add(b);
	    lista.add(c);
	    lista.add(d);
	    System.out.println(lista);
	    Aluno aluno;
	    Iterator<Aluno> itr = lista.iterator();
	    while (itr.hasNext()) {
	      aluno = itr.next();
	      System.out.println(aluno.getNome());
	    }
	  }

}
