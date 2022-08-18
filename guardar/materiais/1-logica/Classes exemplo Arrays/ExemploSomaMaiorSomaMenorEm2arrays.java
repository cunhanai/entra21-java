import java.util.Scanner;

public class ExemploSomaMaiorSomaMenorEm2arrays {
	public static void main(String[] args) {
		/* CRIAR DOIS VETORES INTEIROS COM TAMANHO 10, FAZER A SOMA TOTAL DOS ELEMENTOS DE CADA UM. 
		 * VERIFICAR QUAL VETOR TEM SOMA MAIOR E QUAL TEM SOMA MENOR.
		 * IMPRIMIR O MENOR VALOR E O MAIOR VALOR 
		 */
	    Scanner scan = new Scanner(System.in);
	    
	 
	    int n = 4; // tamanho do vetor
	    int vetorA[] = new int[n]; // declara��o do vetor "A"
	    int vetorB[] = new int[vetorA.length]; // declara��o do vetor "B"
	    int i; // �ndice ou posi��o
	    int somaA = 0;
	    int somaB = 0;
 
	// Entrada de Dados e soma de todos os valores.
	    for (i=0; i<n; i++) {
	      System.out.println("Entre com o valor da posicao do VetorA" + i);
	      vetorA[i] = scan.nextInt();
	      somaA += vetorA[i];
	    }
	    for (i=0; i<n; i++) {
		      System.out.println("Entre com o valor da posicao do vetorB" + i);
		      vetorB[i] = scan.nextInt();
		      somaB+= vetorB[i];
		    }

	// definir o maior e o menor valor

	      if (somaA > somaB)
	    	  System.out.println("vetorA e MAIOR. Soma igual: " + somaA );
	      else {
	    	  System.out.println("vetorB e MAIOR Soma igual: " + somaB );
	      }
	      if (somaA < somaB)
	    	  System.out.println("vetorA e MENOR. Soma igual: " + somaA );
	      else {
	    	  System.out.println("vetorB e MENOR. Soma igual: " + somaB );
	      }
	      
	  }


}
