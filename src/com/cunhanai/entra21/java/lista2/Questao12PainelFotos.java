/*
 * Questao 12 Painel Fotos
 * @date Maio 2022
 * @author Ana Júlia da Cunha - Entra21
 * 
 * Questão_12: Maria Clara também pensou em outra opção: montar um painel com fotos.
 * Pesquisando na internet, ela viu um site com a seguinte promoção:
 * 
 * 		- cada pacote de revelação de 100 fotos custa R$ 44.
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
		
		// PEDE A QUANTIDADE DE FOTOS QUE O USUÁRIO DESEJA REVELAR
		System.out.print("Quantidade de fotos que deseja revelar: ");
		qtdeFotos = sc.nextInt();
		
		// CALCULA O VALOR DE TODAS AS FOTOS FORA DO PACOTE DO SITE
		totalAvulso = qtdeFotos * valorAvulso;
		System.out.println("Valor das fotos avulsas: R$ " + totalAvulso);
		
		// CALCULA OS VALORES DENTO DO PACOTE DO SITE
		if (qtdeFotos < 100) {
			// SE NÃO TIVER NO MÍNIMO 100 FOTOS, NÃO HÁ PACOTE DISPONÍVEL
			System.out.println("Não há opções disponíveis para a quantidade desejada.");
		}
		else if ((qtdeFotos % 100) == 0) {
			// SE A QUANTIDADE DE FOTOS FOR IGUAL A UM MÚLTIMO DE 100, CALCULA O VALOR DOS PACOTES
			qtdePacote = (int) qtdeFotos / 100;
			totalPacote = qtdePacote * valorPacote;
			System.out.println("Valor das fotos em " + qtdePacote + " pacote(s): R$ " + totalPacote);
		}
		else {
			// SE A QUANTIDADE NÃO FOR UM MULTIPLO DE 100, CALCULA O VALOR MISTURANDO PACOTES E FOTOS AVULSAS
			qtdePacote = (int) (qtdeFotos - qtdeFotos % 100)/100;
			totalPacote = qtdePacote * valorPacote;
			qtdeAvulso = (int) qtdeFotos % 100;
			avulsoComPacote = qtdeAvulso * valorAvulso + totalPacote;
			
			System.out.println("Valor com " + qtdePacote + " pacote(s) e " + qtdeAvulso + " fotos avulsas: R$ " + avulsoComPacote);
		}
		
		sc.close();
	}
}
