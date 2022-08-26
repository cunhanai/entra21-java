package com.entra21.cursojavamanha.oop.exerciciospratica.variaveis.instanciaclassemetodosestaticos;

import java.util.Scanner;


public class TesteFutebolAtribInstanciaClasse {

	public static void main(String[] args) {
	
		String time;
		String selecao;
		FutebolAtribInstanciaClasse torcida =new FutebolAtribInstanciaClasse();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Para qual time você torce? ");
		time = scan.next();
		System.out.println(" Para qual Seleção você torce? ");
		selecao = scan.next();
		
		torcida.setNomeTime(time);
		torcida.setNomeSelecao(selecao);
		torcida.mostrarTime();
		torcida.mostrarSelecao();
		
		FutebolAtribInstanciaClasse torcida2 = new FutebolAtribInstanciaClasse();
		torcida2.mostrarTime();
		torcida2.mostrarSelecao();
		
	
		
		
		
		
		
		
		
		
		torcida2.setNomeSelecao("Italiana");
		torcida.mostrarSelecao();
		//selecao = FutebolAtribInstanciaClasse.nomeSelecao;
	
	}

}
