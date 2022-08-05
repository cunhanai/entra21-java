package com.entra21.cursojavamanha.javaavancado.listaexercicios.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteParExercico1 {

	public static void main(String[] args) {
		
		 ParExercico1<String, Double> par1 = new ParExercico1<>("Jose",10.0); //(nome e nota de um aluno)
		 System.out.println("Aluno e nota Final: "+ par1);
		 
		 ParExercico1<Integer,String>par2= new ParExercico1<>(456,"Carlos");// (código e nome de um funcionário)
		 System.out.println("Matricula e nome do Funcionario: "+par2);
		 
		 ParExercico1<Float,Float> par3 = new ParExercico1<>(2.3f,4.5f);// (coordenadas x e y)
		 System.out.println("Coordenadas do grafico: " +par3);
		 
		 String[] f = new String[3];
		 f[0] = "Moango";
		 f[1] = "Uva";
		 f[2]= "Laranja";
		
		 ParExercico1<String,String[]> par4 = new ParExercico1<>("Frutas na Caixa",f);// (coordenadas x e y)
		 System.out.println(par4);
		 
		List temperaturas = new ArrayList();
		temperaturas.add("35º");
		temperaturas.add("28º");
		temperaturas.add("9º");
		
		 ParExercico1<Boolean,List> par5 = new ParExercico1<>(true,temperaturas);
		 System.out.println("Temperaturas: " +par5);
	}

}
