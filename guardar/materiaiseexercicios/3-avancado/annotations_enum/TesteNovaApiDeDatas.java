package com.entra21.cursojavamanha.javaavancado.exerciciospratica.Datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;
import java.time.Instant;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TesteNovaApiDeDatas {
	
	public static void main(String[] args) {
		
		//Usando as classes LocalDate, LocalTime e LocalDateTime
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora: " + horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora: " + dataHoraAtual);
		
		
		// cria��o de datas com a nova classe LocalDate
	     LocalDate localDate = LocalDate.now();
	     System.out.println(localDate);
	     System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
	     System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
	     System.out.println("Mes: " + localDate.getMonthValue());
	     System.out.println("Mes: " + localDate.getMonth().name());
	     System.out.println("Ano: " + localDate.getYear());

	     // USANDO A CLASSE INSTANT compara��o entre diferentes instantes de tempo
//	     Instant iInicial = Instant.now();
//	     try {
//	            Thread.sleep(1000);
//	     } catch (InterruptedException e) {
//	            e.printStackTrace();
//	     }
//	     Instant iFinal = Instant.now();
//
//	     Duration duracao = Duration.between(iInicial, iFinal);
//	     System.out.println("Dura��o em nanos segundos: " + duracao.toNanos());
//	     System.out.println("Dura��o em minutos: " + duracao.toMinutes());
//	     System.out.println("Dura��o em horas: " + duracao.toHours());
//	     System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
//	     System.out.println("Dura��o em dias: " + duracao.toDays());


	     // compara��o de datas (antes, depois, per�odo entre duas datas)
//	     LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
//	     LocalDate localDateNovo = LocalDate.of(2015, 3, 5);
//
//	     System.out.println(localDateAntigo.isAfter(localDateNovo));
//	     System.out.println(localDateAntigo.isBefore(localDateNovo));
//	     System.out.println(localDateAntigo.isEqual(localDateNovo));
//
//	     Period periodo = Period.between(localDateAntigo, localDateNovo);
//	     System.out.println(periodo.getYears() + " Anos " + periodo.getMonths()
//	     + " Meses " + periodo.getDays() + " Dias");
//	     System.out.println("Apenas meses: " + periodo.toTotalMonths());


	     // opera��es em datas como adi��o e subtra��o de dias, meses e anos
//	     LocalDate dataManipulacao = LocalDate.now();
//	     System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
//	     System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
//	     System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
//	     System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
//	     System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
//	     System.out.println("Menos 1 m�s: " + dataManipulacao.minusMonths(1));
//	     System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));
//
//	     //classe LocalDate � imut�vel
//	     System.out.println("Data Original: " + dataManipulacao);

	      //compara��o de datas utilizando o fuso hor�rio
	      //mostra a execu��o do c�digo, onde foram criados dois objetos: 
	      //um com a hora de S�o Paulo e outro com a hora de Paris, e depois 
	     //foi feita a compara��o entre essas duas datas. Nessa compara��o foi poss�vel 
	     //ver que a diferen�a do fuso hor�rio � de cinco horas.
//	     LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);
//
//	     ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
//	     ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
//	     System.out.println(horaSaoPaulo);
//
//	     ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
//	     ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
//	     System.out.println(horaParis);
//
//	     Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
//	     System.out.println("Diferen�a de fuso hor�rio: " + diferencaDeHoras.getSeconds() / 60 / 60);

	     // formata��o de datas com a nova API
//	     LocalDate hoje = LocalDate.now();
//	     DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//	     DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//	     System.out.println("Data com /: " + hoje.format(formatadorBarra));
//	     System.out.println("Data com -: " + hoje.format(formatadorTraco));


	     // m�todos interessantes
	     // mostra alguns m�todos interessantes como, por exemplo, o que verifica se o ano da data � bissexto, 
	     // o n�mero de dias do m�s e do ano, e tamb�m a maior e menor data poss�vel na API.
//	     LocalDate data = LocalDate.now();
//
//	     System.out.println("Ano bissexto: " + data.isLeapYear());
//	     System.out.println("N�mero de dias do m�s: " + data.lengthOfMonth());
//	     System.out.println("N�mero de dias do ano: " + data.lengthOfYear());
//	     System.out.println("Menor data: " + LocalDate.MIN);
//	     System.out.println("Maior data: " + LocalDate.MAX);
		
	}

}
