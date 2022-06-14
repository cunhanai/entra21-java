package com.cunhanai.entra21.java.oop.exemplo;

public class TesteCarro {
	
	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
	 	System.out.println("Marca: " + van.marca);
	 	System.out.println("Modelo: " + van.modelo);
	 	
	 	System.out.println("Marca: " + fusca.marca);
	 	System.out.println("Modelo: " + fusca.modelo);
	}

}
