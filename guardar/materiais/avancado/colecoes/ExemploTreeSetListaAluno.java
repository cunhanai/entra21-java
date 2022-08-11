package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetListaAluno {
	
	public static void main(String[] args) {
		 
		 //criando um conjunto TreeSet
		TreeSet<Aluno> tree = new TreeSet<Aluno>();// PRECISA IMPLEMENTAR Comparable
												  // E SOBRESCREVER O METODO compareTo()
	    
		//  COM OBJETO ALUNO
	    Aluno a = new Aluno("João da Silva", "Linux básico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    
	    tree.add(a);
	    tree.add(b);
	    tree.add(c);
	    tree.add(d);
	    
//	    System.out.println(conjunto.add(a));
//	    System.out.println(conjunto.add(b));;
//	    System.out.println(conjunto.add(c));
//	    System.out.println(conjunto.add(d));
	    
	    System.out.println(tree);  // Já vem classificado e sem duplicados  

	}

}
