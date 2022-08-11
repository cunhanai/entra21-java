package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ExemploHashSetListaAluno {

	public static void main(String[] args) {
		 
		 //criando um conjunto HashSet
		Set<Aluno> conjunto = new HashSet<Aluno>();
	    
		//  COM OBJETO ALUNO
	    Aluno a = new Aluno("João da Silva", "Linux básico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    
	    conjunto.add(a);
	    conjunto.add(b);
	    conjunto.add(c);
	    conjunto.add(d);
	    
//	    System.out.println(conjunto.add(a));
//	    System.out.println(conjunto.add(b));;
//	    System.out.println(conjunto.add(c));
//	    System.out.println(conjunto.add(d));
	    
	    System.out.println(conjunto);    

//		 // TIRANDO DUPLICADOS de array de String COM HashSet
//	    System.out.println(" // TIRANDO DUPLICADOS de array de String transformado em List COM HashSet");
//		 String[] nomes = {"João da Silva", "Antonio Sousa","Lúcia Ferreira", "Antonio Sousa"};
//		 List<String> list = Arrays.asList(nomes);
//		 
//		 System.out.printf("Lista antes com item duplicado: %s\n", list);
//
//		 System.out.println();
//		 
//		imprimeNaoDuplicados(list);
	    
	}
	
	
	
	public static void imprimeNaoDuplicados(Collection<String> valores) {
		
		Set<String> conjunto = new HashSet<String>(valores);
		
		System.out.println("Lista depois sem duplicados: ");
		
		for(String valor : conjunto)
			System.out.printf("%s, ", valor);
		
		System.out.println();
	
	}

}
