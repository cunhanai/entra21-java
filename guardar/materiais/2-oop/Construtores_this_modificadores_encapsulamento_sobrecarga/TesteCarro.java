package com.entra21.cursojavamanha.oop.exerciciospratica.encapsulamento;



public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		
		System.out.println();
		
		Carro fusca = new Carro("Volkswagem", "fusca", 100.0, 0.2); 
		System.out.println(fusca.getMarca());
		System.out.println(fusca.getModelo());
		System.out.println(fusca.getNumeroPassageiros());
		
		System.out.println();
		
		Carro Camaro = new Carro(4); 
		Camaro.setMarca("Chevrolet");
		Camaro.setModelo("Camaro");
		System.out.println(Camaro.getMarca());
		System.out.println(Camaro.getModelo());
		System.out.println(Camaro.getNumeroPassageiros());
		
		

	}

}
