package com.entra21.cursojavamanha.oop.exerciciospratica.metodos;

public class Carro {

		// TODO Auto-generated method stub
		String marca;
		String modelo;
		int numeroPassageiros;  // numero de passageiros	
		double capCombustivel; // capacidade do tanque de combust�vel	
		double consumoCombustivel; // consumo de combust�vel por km
		
		
		void exibirAutonomia(){ // METODO SEM RETORNO
			System.out.println(" A autonomia do carro �: "  +capCombustivel * consumoCombustivel + " km " );
			}
		
		double obterAutonomia(){ // M�TODO COM RETORNO
			System.out.println(" M�todo obterAutonomia do carro foi chamado "  );
			return capCombustivel * consumoCombustivel;
			}
		
		double calcularCombustivel(double km){
			return km/consumoCombustivel ;
		}

}
