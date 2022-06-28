/*
 * Planilha Gastos Luz
 * @date 2022-06-24
 * @author Ana Julia da Cunha - Entra21
 * 
 * As informações a seguir se referem á planilha Excel de Mateus, que 
 * controla os gastos mensais com sua conta de luz. Para cada conta de 
 * luz cadastra-se: data em que a leitura do relógio de luz foi realizada, 
 * número da leitura, quantidade de Kw gasto no mês, valor a pagar pela
 * conta, data do pagamento e média de consumo. Mensalmente, são 
 * realizadas as seguintes pesquisas:
 * 
 * 		- verificação do mês de menor consumo;
 * 		- verificação do mês de maior consumo
 * 
 * Identifique as classes, atributos e métodos do cenário
 * 
 * OBS.: PROF HELOISA, COMO COLOQUEI OS TESTES EM OUTRO PACKAGE, ESTAVA DANDO ERRO COM
 * A VISIBILIDADE DAS VARIAVEIS, ENTAO O ECLIPSE DISSE PARA EU MUDAR TODOS OS ATRIBUTOS
 * E METODOS PARA PUBLIC
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class GestoraContaLuz {

	int qtdeMeses = 2;
	public String[] dataLeitura = new String[qtdeMeses]; // data em que a leitura do relógio de luz foi realizada
	public int[] numeroLeitura = new int[qtdeMeses]; // numero da leitura realizada
	public float[] gastoKw = new float[qtdeMeses]; // quantidade de Kw gasto no mês
	public float[] valorAPagar = new float[qtdeMeses]; // quantidade de Kw gasto no mês
	public String[] dataPagamento = new String[qtdeMeses]; // data do pagamento 
	public float[] mediaConsumo = new float[qtdeMeses]; // media de consumo
	
	/*
	 * Verifica o mes de menor consumo de luz.
	 * @return String com o mes e o ano de menor consumo.
	 */
	public String verificarMenorConsumo() {
		float menorConsumo = Float.MAX_VALUE;
		int mesMenorConsumo = 0;
		for (int i = 0; i < qtdeMeses; i++) {
			if (mediaConsumo[i] < menorConsumo) {
				menorConsumo = mediaConsumo[i];
				mesMenorConsumo = i;
			}
		}
		String str = new String(dataLeitura[mesMenorConsumo]);
		return str.substring(3);
	}
	
	/*
	 * Verifica o mes de maior consumo de luz.
	 * @return String com o mes e o ano de maior consumo.
	 */
	public String verificarMaiorConsumo() {
		float maiorConsumo = Float.MIN_VALUE;
		int mesMaiorConsumo = 0;
		for (int i = 0; i < qtdeMeses; i++) {
			if (mediaConsumo[i] > maiorConsumo) {
				maiorConsumo = mediaConsumo[i];
				mesMaiorConsumo = i;
			}
		}
		String str = new String(dataLeitura[mesMaiorConsumo]);
		return str.substring(3);
	}
}
