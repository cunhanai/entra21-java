package com.entra21.cursojavamanha.oop.exerciciospratica.metodos;

public class Carro {

		// TODO Auto-generated method stub
		String marca;
		String modelo;
		int numeroPassageiros;  // numero de passageiros	
		double capCombustivel; // capacidade do tanque de combustível	
		double consumoCombustivel; // consumo de combustível por km
		
		
		void exibirAutonomia(){ // METODO SEM RETORNO
			System.out.println(" A autonomia do carro é: "  +capCombustivel * consumoCombustivel + " km " );
			}
		
		double obterAutonomia(){ // MÉTODO COM RETORNO
			System.out.println(" Método obterAutonomia do carro foi chamado "  );
			return capCombustivel * consumoCombustivel;
			}
		
		double calcularCombustivel(double km){
			return km/consumoCombustivel ;
		}

}
