import java.util.Scanner;

public class ExemploVetorAVetorB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os 
		 * os mesmos elementos do vetor A, ou  seja B[i] = A[i]. 
		 */
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[6];
		//int[] vetorB = new int[vetorA.length];
		int[] vetorB = new int[7];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao" + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
			
		}
		//vetorB = vetorA;
		
		System.out.println("vetorA ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println("vetorB ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		
	}

}
