/*
 * Questao 12 Painel Fotos
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Quest�o_12: Maria Clara tamb�m pensou em outra op��o: montar um painel com fotos.
 * Pesquisando na internet, ela viu um site com a seguinte promo��o:
 * 
 * 		- cada pacote de revela��o de 100 fotos custa R$ 44.
 * 		- fotos avulsas (fora de pacote) custam R$ 0,70 cada.
 */

package com.cunhanai.entra21.java.lista2;
import java.util.Scanner;

public class Questao12PainelFotos {
	
	public static void main(String[] args) {
		float valorPacote, valorAvulso;
		double totalPacote, totalAvulso, avulsoComPacote;
		int qtdeFotos, qtdePacote, qtdeAvulso;
		Scanner sc = new Scanner(System.in);
		
		valorPacote = 44;
		valorAvulso = 0.7f;
		
		// PEDE A QUANTIDADE DE FOTOS QUE O USU�RIO DESEJA REVELAR
		System.out.print("Quantidade de fotos que deseja revelar: ");
		qtdeFotos = sc.nextInt();
		
		// CALCULA O VALOR DE TODAS AS FOTOS FORA DO PACOTE DO SITE
		totalAvulso = qtdeFotos * valorAvulso;
		System.out.println("Valor das fotos avulsas: R$ " + totalAvulso);
		
		// CALCULA OS VALORES DENTO DO PACOTE DO SITE
		if (qtdeFotos < 100) {
			// SE N�O TIVER NO M�NIMO 100 FOTOS, N�O H� PACOTE DISPON�VEL
			System.out.println("N�o h� op��es dispon�veis para a quantidade desejada.");
		}
		else if ((qtdeFotos % 100) == 0) {
			// SE A QUANTIDADE DE FOTOS FOR IGUAL A UM M�LTIMO DE 100, CALCULA O VALOR DOS PACOTES
			qtdePacote = (int) qtdeFotos / 100;
			totalPacote = qtdePacote * valorPacote;
			System.out.println("Valor das fotos em " + qtdePacote + " pacote(s): R$ " + totalPacote);
		}
		else {
			// SE A QUANTIDADE N�O FOR UM MULTIPLO DE 100, CALCULA O VALOR MISTURANDO PACOTES E FOTOS AVULSAS
			qtdePacote = (int) (qtdeFotos - qtdeFotos % 100)/100;
			totalPacote = qtdePacote * valorPacote;
			qtdeAvulso = (int) qtdeFotos % 100;
			avulsoComPacote = qtdeAvulso * valorAvulso + totalPacote;
			
			System.out.println("Valor com " + qtdePacote + " pacote(s) e " + qtdeAvulso + " fotos avulsas: R$ " + avulsoComPacote);
		}
		
		sc.close();
	}
}
