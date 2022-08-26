import java.util.Scanner;

public class ExemploVetorCVetorD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um vetor C com 8 elementos inteiros. Construir um vetor D de
		mesmo tipo e tamanho e com os elementos do vetor C multiplicados
		por 2, ou seja: D[i] = C[i] * 2*/

		Scanner scan = new Scanner(System.in);
		int[] vetorC = new int[8];
		int[] vetorD = new int[vetorC.length];
		
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println("Entre com o valor da posicao " + i);
			vetorC[i] = scan.nextInt();
			vetorD[i] = vetorC[i] * 2;
		}
		
		System.out.println("vetorC ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i] + " ");
		}
		System.out.println("vetorD ");
		for(int i = 0; i < vetorD.length; i++) {
			System.out.print(vetorD[i] + " ");
		}

		        
	}

}