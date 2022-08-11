package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedListListaAluno {
	
	public static void main(String[] args) {
		
		 List<String> lista = new LinkedList<String>();
		    lista.add("João da Silva"); 
		    lista.add("Antonio Sousa");
		    lista.add("Lúcia Ferreira");
		    System.out.println(lista);
		 // Foi inserido String, mas pode ser inserido qualquer objeto
		 // desde que seja respeitada a declaração  do tipo generics
		 // como foi visto
		    
		 // Colocando a lista  em Ordem ascendente
		    Collections.sort(lista);
		    System.out.println(" Lista ordenada " + lista);
		    
		   // Adicionando novos dados. Objeto Aluno ao invés de String.
		
//		        List<Aluno> lista = new ArrayList<Aluno>();
	//
//		        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
//		        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
//		        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
//		        lista.add(a);
//		        lista.add(b);
//		        lista.add(c);
//		        // Feito @Override toString em Aluno para a saida 
//		        //System da lista
//		        System.out.println(lista);
		    
		        
		        // alguns métodos muito utilizados no dia a dia.
		       String umAluno = lista.get(0);// recupera um objeto do ArrayList
		       System.out.println(" Um Aluno " + umAluno);	
		       
		       lista.addAll(lista);//adiciona outras listas na já existente
		       
		       boolean contem = lista.contains("João da Silva");// Verifica se um determinado item 
		       System.out.println(" contem " + contem);			// está na lista.
		       
		       lista.remove(0);
		       System.out.println(" Lista sem um item " + lista);
		       
		       lista.clear();// //Remove todos os elementos da lista
		       System.out.println(" Lista vazia " + lista);
		
	}

}
