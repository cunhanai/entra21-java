package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListListaAluno {

	public static void main(String[] args) {

		demonstraArrayListString();
		
		//demonstraArrayListAluno();
		       
	}
	
	public static void demonstraArrayListString() {

		 List<String> lista = new ArrayList<String>();
		    // adicionando itens na lista
		    lista.add("João da Silva"); 
		    lista.add("Antonio Sousa");
		    lista.add("Lúcia Ferreira");
		    System.out.println(lista);
		    		    
		 // Pode ser adicionado assim também UTILIZANDO FOR APRIMORADO
//		    String[] nomes = {"João da Silva", "Antonio Sousa","Lúcia Ferreira"};
//		    System.out.println("LISTA COM FOR EATCH");
//		    for(String nome: nomes)
//		    	lista.add(nome);
//		    System.out.println(lista);  
//		    
//		    //também Gera saida do conteudo da lista 
//		    for(int i = 0; i < lista.size(); i++) {
//		    	System.out.printf("%s, " , lista.get(i));
//		    	
//		    }
		    // Colocando a lista nomes String  em Ordem crescente
//		    Collections.sort(lista);
//		    System.out.println("Lista crescente " + lista);
		    
		    // Colocando a lista nomes String em Ordem decrescente
//		    Collections.sort(lista, Collections.reverseOrder() );
//		    System.out.println("Lista decrescente " + lista);
		    
		    System.out.println(); 
		    
		    // alguns métodos muito utilizados no dia a dia.
	        
//			 // Método que retorna o tamanho da lista2
//			    int tamanho = lista.size();
//			    System.out.println(" Tamanho da Lista: " + tamanho);
//			 
//			 // recupera um objeto do ArrayList
//		       String umAluno = lista.get(0).toString();
//		       System.out.println(" Um Aluno: " + umAluno);	
//		       
//		     // Verifica se um determinado item está na lista.
//		       boolean contem = lista.contains("Antonio Sousa"); 
//		       System.out.println(" contem: " + contem);			
//		   
//		    //Remove um elemento da lista
//		       lista.remove(0);
//		       System.out.println(" Lista sem um item: " + lista);
//		       
//		   //adiciona outras listas na já existente
//			    lista.addAll(lista);
//			    System.out.println(" Lista com outras listas: " + lista);
//		       
//		    //Remove todos os elementos da lista   
//		       lista.clear();
//		       System.out.println(" Lista vazia: " + lista);
		
	}

	
	public static void demonstraArrayListAluno() {
		
		 // Adicionando novos dados. Objeto Aluno ao invés de String.
		
        List<Aluno> lista2 = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista2.add(a);
        lista2.add(b);
        lista2.add(c);
       
        System.out.println(lista2);	    
    
//	 // Colocando a lista de objetos Aluno em Ordem crescente 
//     // precisa implementar Comparable sobrescrever o METODO compareTo()
//	    Collections.sort(lista2);
//	    System.out.println(" Lista crescente" + lista2);
// 
//	 // Colocando a lista de objetos Aluno  em Ordem decrescente
	    Collections.sort(lista2, Collections.reverseOrder() );
	    System.out.println(" Lista decrescente" + lista2);
	
//      // alguns métodos muito utilizados no dia a dia.
//        
//	 // Método que retorna o tamanho da lista2
//	    int tamanho = lista2.size();
//	    System.out.println(" Tamanho da Lista: " + tamanho);
//	 
//	 // recupera um objeto do ArrayList
//       String umAluno = lista2.get(0).toString();
//       System.out.println(" Um Aluno: " + umAluno);	
//       
//     // Verifica se um determinado item está na lista.
//       boolean contem = lista2.contains(c); 
//       System.out.println(" contem: " + contem);			
//   
//    //Remove um elemento da lista
//       lista2.remove(0);
//       System.out.println(" Lista sem um item: " + lista2);
//       
//   //adiciona outras listas na já existente
//	    lista2.addAll(lista2);
//	    System.out.println(" Lista com outras listas: " + lista2);
//       
//    //Remove todos os elementos da lista   
//       lista2.clear();
//       System.out.println(" Lista vazia: " + lista2);
	}
}
