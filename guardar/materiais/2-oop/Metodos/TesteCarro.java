package com.entra21.cursojavamanha.oop.exerciciospratica.metodos;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.marca = "Fiat";			
		van.modelo = "Ducato";			
		van.numeroPassageiros = 10;			 
		van.capCombustivel = 100;		 
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.exibirAutonomia(); //CHAMADA OU INVOCA��O DO METODO SEM RETORNO
		
		double autonomia = van.obterAutonomia(); //CHAMADA OU INVOCA��O DO METODO COM RETORNO A UM TIPO DOUBLE
		
		System.out.println(" autonomia vindo do metodo com retorno atribuido ao atributo " + autonomia); // ou
		System.out.println(" autonomia vindo da chamado do metodo com retorno " + van.obterAutonomia()); 
		
		/*Carro fusca = new Carro();		
		fusca.marca = "Volkswagen";			
		fusca.modelo = "Fusca";			 
		fusca.numeroPassageiros = 4;			 
		fusca.capCombustivel = 30;			 
		fusca.consumoCombustivel = 0.15;
		
		System.out.println();
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		fusca.exibirAutonomia();*/

	}

}
