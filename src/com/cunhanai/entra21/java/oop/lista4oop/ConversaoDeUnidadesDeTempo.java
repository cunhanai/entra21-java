/**
 * Conversao De Unidades De Tempo
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * 3. Escreva a classe ConversaoDeUnidadesDeTempo com metodos estaticos para conversao aproximada das unidades de velocidade segundo a lista abaixo.
 * 
 * 		• 1 minuto = 60 segundos 
 * 		• 1 hora = 60 minutos
 * 		• 1 dia = 24 horas
 * 		• 1 semana = 7 dias
 * 		• 1 mês = 30 dias
 * 		• 1 ano = 365.25 dias
 */

package com.cunhanai.entra21.java.oop.lista4oop;

public class ConversaoDeUnidadesDeTempo {

	public ConversaoDeUnidadesDeTempo() {

	}

	public static double converterMinutoParaSegundo(double minuto) {
		return minuto * 60;
	}

	public static double converterSegundoParaMinuto(double segundo) {
		return segundo / 60;
	}

	public static double converterHoraParaMinuto(double hora) {
		return hora * 60;
	}

	public static double converterMinutoParaHora(double minuto) {
		return minuto / 60;
	}

	public static double converterDiaParaHora(double dia) {
		return dia * 24;
	}

	public static double converterHoraParaDia(double hora) {
		return hora / 24;
	}

	public static double converterSemanaParaDia(double semana) {
		return semana * 7;
	}

	public static double converterDiaParaSemana(double dia) {
		return dia / 7;
	}

	public static double converterMesParaDia(double mes) {
		return mes * 30;
	}

	public static double converterDiaParaMes(double dia) {
		return dia / 30;
	}

	public static double conversaoAnoParaDia(double ano) {
		return ano * 365.25;
	}

	public static double conversaoDiaParaAno(double ano) {
		return ano / 365.25;
	}
}
