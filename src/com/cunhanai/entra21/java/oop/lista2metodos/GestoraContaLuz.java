/*
 * Planilha Gastos Luz
 * @date 2022-06-24
 * @author Ana Julia da Cunha - Entra21
 * 
 * As informa��es a seguir se referem � planilha Excel de Mateus, que 
 * controla os gastos mensais com sua conta de luz. Para cada conta de 
 * luz cadastra-se: data em que a leitura do rel�gio de luz foi realizada, 
 * n�mero da leitura, quantidade de Kw gasto no m�s, valor a pagar pela
 * conta, data do pagamento e m�dia de consumo. Mensalmente, s�o 
 * realizadas as seguintes pesquisas:
 * 
 * 		- verifica��o do m�s de menor consumo;
 * 		- verifica��o do m�s de maior consumo
 * 
 * Identifique as classes, atributos e m�todos do cen�rio
 * 
 * OBS.: PROF HELOISA, COMO COLOQUEI OS TESTES EM OUTRO PACKAGE, ESTAVA DANDO ERRO COM
 * A VISIBILIDADE DAS VARIAVEIS, ENTAO O ECLIPSE DISSE PARA EU MUDAR TODOS OS ATRIBUTOS
 * E METODOS PARA PUBLIC
 */

package com.cunhanai.entra21.java.oop.lista2metodos;

public class GestoraContaLuz {

	int qtdeMeses = 2;
	public String[] dataLeitura = new String[qtdeMeses]; // data em que a leitura do rel�gio de luz foi realizada
	public int[] numeroLeitura = new int[qtdeMeses]; // numero da leitura realizada
	public float[] gastoKw = new float[qtdeMeses]; // quantidade de Kw gasto no m�s
	public float[] valorAPagar = new float[qtdeMeses]; // quantidade de Kw gasto no m�s
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
