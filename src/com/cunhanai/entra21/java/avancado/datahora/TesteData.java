package com.cunhanai.entra21.java.avancado.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteData {
	
	public static void main(String[] args) {
//		LocalDate dataAtual = LocalDate.now();
//		System.out.println(dataAtual);
//		
//		LocalTime horaAtual = LocalTime.now();
//		System.out.println(horaAtual);
//
//		LocalDateTime dataHoraArtual = LocalDateTime.now();
//		System.out.println(dataHoraArtual);
//		
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
//		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
//		System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
//		System.out.println("Mes: " + localDate.getMonthValue());
//		System.out.println("Mes: " + localDate.getMonth());
//		System.out.println("Ano: " + localDate.getYear());

		// CRIANDO A LISTA DE DATAS
		List<LocalDate> datas = new ArrayList<LocalDate>();
		
		// CRIANDO DATAS
		LocalDate data1 = LocalDate.of(2018, 7, 30);
		LocalDate data2 = LocalDate.of(2019, 7, 30);
		LocalDate data3 = LocalDate.of(2018, 7, 3);
		LocalDate data4 = LocalDate.of(2018, 5, 21);
		
		// ADICIONADO AS DATAS NA LISTA
		datas.add(data1);
		datas.add(data2);
		datas.add(data3);
		datas.add(data4);
		
		// ORDENANDO E PRINTANDO AS DATAS
		Collections.sort(datas);
		System.out.println(datas);
		
		// REVERTENDO A ORDEM E PRINTANDO AS DATAS
		Collections.reverse(datas);
		System.out.println(datas);
		
		
	}

}
