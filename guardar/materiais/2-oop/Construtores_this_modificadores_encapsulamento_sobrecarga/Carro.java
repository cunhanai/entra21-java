package com.entra21.cursojavamanha.oop.exerciciospratica.encapsulamento;

public class Carro {

		// TODO Auto-generated method stub
		private String marca;
		private String modelo;
		private int numeroPassageiros;  // numero de passageiros	
		private double capCombustivel; // capacidade do tanque de combustível	
		private double consumoCombustivel; // consumo de combustível por km
		
		Carro(){ }//Boa pratica de programação. Sempre ter um construtor vazio */
			 
		 
		Carro( int numeroPassageiros) {
			this.numeroPassageiros  = numeroPassageiros;
			
			
		}
		
		Carro( String marca, String modelo, double capCombustivel, double consumoCombustivel) {		 
			this.marca = marca;	
			this.modelo = modelo;	
			this.capCombustivel = capCombustivel;
			this.consumoCombustivel = consumoCombustivel; 
		}
			
		public int getNumeroPassageiros() {
			return numeroPassageiros;
		}


		public void setNumeroPassageiros(int numeroPassageiros) {
			this.numeroPassageiros = numeroPassageiros;
		}


		public double getCapCombustivel() {
			return capCombustivel;
		}


		public void setCapCombustivel(double capCombustivel) {
			this.capCombustivel = capCombustivel;
		}


		public double getConsumoCombustivel() {
			return consumoCombustivel;
		}


		public void setConsumoCombustivel(double consumoCombustivel) {
			this.consumoCombustivel = consumoCombustivel;
		}


		public String getMarca() {
				return marca;
		}
	
		public void setMarca(String marca) {
				this.marca = marca;
		}
	
		public String getModelo() {
				return modelo;
		}
	
		public void setModelo(String modelo) {
				this.modelo = modelo;
		}
		
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
