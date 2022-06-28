package com.cunhanai.entra21.java.oop.lista2metodos.testes;

import com.cunhanai.entra21.java.oop.lista2metodos.GestoraContaLuz;

public class GestoraContaLuzTeste {

	public static void main(String[] args) {
		GestoraContaLuz planilha = new GestoraContaLuz();
		
		// PRIMEIRO MES
		planilha.dataLeitura[0] = "04/07/2005";
		planilha.numeroLeitura[0] = 4166;
		planilha.gastoKw[0] = 460;
		planilha.valorAPagar[0] = 206.43f;
		planilha.dataPagamento[0] = "15/07/2005";
		planilha.mediaConsumo[0] = 15.33f;
		
		// SEGUNDO MES
		planilha.dataLeitura[1] = "02/08/2005";
		planilha.numeroLeitura[1] = 4201;
		planilha.gastoKw[1] = 350;
		planilha.valorAPagar[1] = 157.07f;
		planilha.dataPagamento[1] = "15/08/2005";
		planilha.mediaConsumo[1] = 12.06f;
		
		System.out.println("Maior consumo: " + planilha.verificarMaiorConsumo());
		System.out.println("Menor consumo: " + planilha.verificarMenorConsumo());
	}

}
