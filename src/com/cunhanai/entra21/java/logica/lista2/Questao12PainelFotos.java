/*
 * Questao 12 Painel Fotos
 * @date Maio 2022
 * @author Ana Julia da Cunha - Entra21
 * 
 * Questao_12: Maria Clara tambem pensou em outra opcao: montar um painel com fotos.
 * Pesquisando na internet, ela viu um site com a seguinte promocao:
 * 
 * 		- cada pacote de revelacao de 100 fotos custa R$ 44.
 * 		- fotos avulsas (fora de pacote) custam R$ 0,70 cada.
 * 
 * OBS.: Acentuacao foi retirada para nao gerar erro em outros dispositivos
 */

package com.cunhanai.entra21.java.logica.lista2;
import java.util.Scanner;

public class Questao12PainelFotos {
	
	public static void main(String[] args) {
		float valorPacote, valorAvulso;
		double totalPacote, totalAvulso, avulsoComPacote;
		int qtdeFotos, qtdePacote, qtdeAvulso;
		Scanner sc = new Scanner(System.in);
		
		valorPacote = 44;
		valorAvulso = 0.7f;
		
		// PEDE A QUANTIDADE DE FOTOS QUE O USUARIO DESEJA REVELAR
		System.out.print("Quantidade de fotos que deseja revelar: ");
		qtdeFotos = sc.nextInt();
		
		// CALCULA O VALOR DE TODAS AS FOTOS FORA DO PACOTE DO SITE
		totalAvulso = qtdeFotos * valorAvulso;
		System.out.println("Valor das fotos avulsas: R$ " + totalAvulso);
		
		// CALCULA OS VALORES DENTO DO PACOTE DO SITE
		if (qtdeFotos < 100) {
			// SE NAO TIVER NO MINIMO 100 FOTOS, NAO HA PACOTE DISPONIVEL
			System.out.println("Nao ha opções disponiveis para a quantidade desejada.");
		}
		else if ((qtdeFotos % 100) == 0) {
			// SE A QUANTIDADE DE FOTOS FOR IGUAL A UM MULTIMO DE 100, CALCULA O VALOR DOS PACOTES
			qtdePacote = (int) qtdeFotos / 100;
			totalPacote = qtdePacote * valorPacote;
			System.out.println("Valor das fotos em " + qtdePacote + " pacote(s): R$ " + totalPacote);
		}
		else {
			// SE A QUANTIDADE NAO FOR UM MULTIPLO DE 100, CALCULA O VALOR MISTURANDO PACOTES E FOTOS AVULSAS
			qtdePacote = (int) (qtdeFotos - qtdeFotos % 100)/100;
			totalPacote = qtdePacote * valorPacote;
			qtdeAvulso = (int) qtdeFotos % 100;
			avulsoComPacote = qtdeAvulso * valorAvulso + totalPacote;
			
			System.out.println("Valor com " + qtdePacote + " pacote(s) e " + qtdeAvulso + " fotos avulsas: R$ " + avulsoComPacote);
		}
		
		sc.close();
	}
}
