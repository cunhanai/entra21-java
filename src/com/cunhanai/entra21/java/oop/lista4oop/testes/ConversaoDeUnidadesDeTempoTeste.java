/**
 * Conversao De Unidades De Tempo Teste
 * @date 2022-07-12
 * @author Ana Julia da Cunha - Entra21
 * 
 * Classe de teste para a classe ConversaoDeUnidadesDeTempo do exercicio 3.
 */

package com.cunhanai.entra21.java.oop.lista4oop.testes;

import com.cunhanai.entra21.java.oop.lista4oop.ConversaoDeUnidadesDeTempo;

public class ConversaoDeUnidadesDeTempoTeste {

	public static void main(String[] args) {

		// 1 minuto = 60 segundos
		System.out.println(ConversaoDeUnidadesDeTempo.converterMinutoParaSegundo(1) + " segundos");
		System.out.println(ConversaoDeUnidadesDeTempo.converterSegundoParaMinuto(60) + " minutos");
		System.out.println();
		
		// 1 hora = 60 minutos
		System.out.println(ConversaoDeUnidadesDeTempo.converterHoraParaMinuto(1) + " minutos");
		System.out.println(ConversaoDeUnidadesDeTempo.converterMinutoParaHora(60) + " horas");
		System.out.println();
		
		// 1 dia = 24 horas
		System.out.println(ConversaoDeUnidadesDeTempo.converterDiaParaHora(1) + " horas");
		System.out.println(ConversaoDeUnidadesDeTempo.converterHoraParaDia(24) + " dias");
		System.out.println();
		
		// 1 semana = 7 dias
		System.out.println(ConversaoDeUnidadesDeTempo.converterSemanaParaDia(1) + " dias");
		System.out.println(ConversaoDeUnidadesDeTempo.converterDiaParaSemana(7) + " semanas");
		System.out.println();
		
		// 1 mês = 30 dias
		System.out.println(ConversaoDeUnidadesDeTempo.converterMesParaDia(1) + " dias");
		System.out.println(ConversaoDeUnidadesDeTempo.converterDiaParaMes(30) + " meses");
		System.out.println();
		
		// 1 ano = 365.25 dias
		System.out.println(ConversaoDeUnidadesDeTempo.conversaoAnoParaDia(1) + " dias");
		System.out.println(ConversaoDeUnidadesDeTempo.conversaoDiaParaAno(365.25) + " anos");
	}

}
