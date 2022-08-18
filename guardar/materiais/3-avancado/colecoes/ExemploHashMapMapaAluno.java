package com.entra21.cursojavamanha.javaavancado.exerciciospratica.colecoes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploHashMapMapaAluno {
	
	public static void main(String[] args) {
	
		System.out.println("****** USANDO HashMap");
		Map<String, Aluno> mapa = new HashMap<String, Aluno>();
//		System.out.println("******* USANDO TreeMap");
//	    Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
	   

	    Aluno a = new Aluno("Jo�o da Silva", "Linux b�sico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("L�cia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0);
//	    Aluno e = new Aluno("L�cia Ferreira", "Internet", 0);
	    
	    mapa.put("Jo�o da Silva", a); // Chave: nome do Aluno, Valor: Objeto Aluno
	    mapa.put("Antonio Sousa", b);
	    mapa.put("L�cia Ferreira", c);
	    mapa.put("Benedito Silva", d);
	    System.out.println(mapa);
	    System.out.println(" Pega um " + mapa.get("L�cia Ferreira"));

	    Collection<Aluno> alunos = mapa.values();
	    Collection<String> keys = mapa.keySet();
	    
	    for (String s : keys) {
		      System.out.println("Key:" + s);
		}
	    System.out.println();
	    
	    for (Aluno s : alunos) {
	      System.out.println("Valor: " + s);
	    }
	    
	  }
	//utilizamos um TreeMap, que garante que as chaves estar�o em ordem ascendente..


}
