package lista6lacosrepeticao;

public class Questao12GraosDeTrigo {
	
	/*
	 * Quest�o 12 - Uma rainha requisitou os servi�os de um monge, o qual exigiu o pagamento em 
	 * gr�os de trigo da seguinte maneira: os gr�os de trigo seriam dispostos em um tabuleiro de xadrez
	 * (que possui 64 casas), de tal forma que a primeira casa do tabuleiro tivesse um gr�o, e as casas 
	 * seguintes o dobro da anterior. Construa um programa que calcule quantos gr�os de trigo a 
	 * Rainha dever� pagar ao monge.
	 * A sequencia de gr�os no tabuleiro ser�: 1, 2, 4, 8, 16, 32, ......
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
		
		System.out.printf("A Rainha dever� pagar ao monge %,d gr�os de trigo.", graos);
	}

}
