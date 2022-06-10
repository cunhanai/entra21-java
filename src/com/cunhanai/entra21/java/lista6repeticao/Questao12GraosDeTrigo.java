package lista6lacosrepeticao;

public class Questao12GraosDeTrigo {
	
	/*
	 * Questão 12 - Uma rainha requisitou os serviços de um monge, o qual exigiu o pagamento em 
	 * grãos de trigo da seguinte maneira: os grãos de trigo seriam dispostos em um tabuleiro de xadrez
	 * (que possui 64 casas), de tal forma que a primeira casa do tabuleiro tivesse um grão, e as casas 
	 * seguintes o dobro da anterior. Construa um programa que calcule quantos grãos de trigo a 
	 * Rainha deverá pagar ao monge.
	 * A sequencia de grãos no tabuleiro será: 1, 2, 4, 8, 16, 32, ......
	 */

	public static void main(String[] args) {
		long graos = 0;
		
		for (int i = 0; i < 64; i++) {
			if (graos == 0) {
				graos = 1;
				continue;
			}
			graos *= 2;
		}
		
		System.out.printf("A Rainha deverá pagar ao monge %,d grãos de trigo.", graos);
	}

}
