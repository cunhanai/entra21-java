package lista7arrays;

public class Questao18NumerosPrimosAcimaDe100 {

	/*
	 * Questão 18 - Faça um programa que gere os 10 primeiros números primos acima de 100 e 
	 * armazene-os em um vetor X[10]. Ao final do programa, mostre então o vetor X
	 */
	public static void main(String[] args) {
		int[] vetorX = new int[10];
		boolean primo = false;
		int num = 101;
		
		for (int i = 0; i < vetorX.length; i++) {
			primo = false;
			while (!primo){
				for (int j = 2; j < num; j++) {
					if ((num % j) == 0) {
						primo = false;
						break;
					}
					else {
						vetorX[i] = num;
						primo = true;
					}
				}
				num++;
			}
		}
		
		for (int i = 0; i < vetorX.length; i++) {
			System.out.println(vetorX[i]);
		}
	}

}
