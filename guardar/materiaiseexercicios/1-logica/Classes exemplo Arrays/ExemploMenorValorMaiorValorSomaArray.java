
import java.util.Scanner;

public class ExemploMenorValorMaiorValorSomaArray {

  public static void main(String[] args) {
	/* CRIAR UM VETOR INTEIRO COM TAMANHO 10 IMPRIMIR O MENOR VALOR E O MAIOR VALOR E FAZER
	 * A SOMA NO FINAL. 
	 */
    Scanner ler = new Scanner(System.in);
    
 
    int n = 4
    		; // tamanho do vetor
    int vetorA[] = new int[4]; // declaracao do vetor "v"
    //int vetorA[] = new int[n]; // declaracao do vetor "v"
    int i; // ïndice ou posicao

    
// Entrada de Dados
   /* for (i=0; i<n; i++) {
      System.out.printf("Entre com o valor da posicao "+ i);
      vetorA[i] = ler.nextInt();
    }*/
    
    for (i=0; i<vetorA.length; i++) {
        System.out.printf("Entre com o valor da posicao "+ i + ": ");
        vetorA[i] = ler.nextInt();
      }

// Processamento: somar todos os valores, definir o maior e o menor valor
    int soma = 0;
    int menor = vetorA[0]; //vetorA[0] = 1o. valor armazenado no vetor "vetorA"
    int maior = vetorA[0];
    
    for (i=0; i<n; i++) {
      soma = soma + vetorA[i];

      if (vetorA[i] < menor)
         menor = vetorA[i];

      if (vetorA[i] > maior)
         maior = vetorA[i];
    }

// Saïda (resultados)
    System.out.printf("\n");
    for (i=0; i<vetorA.length; i++) {
      if (vetorA[i] == menor)
       //System.out.printf("v[%d] = %2d <--- menor valor\n", i, vetorA[i]);
        System.out.printf("v["+i+"] = "+ vetorA[i] + " <--- menor valor\n");
      else if (vetorA[i] == maior)
              //System.out.printf("v[%d] = %2d <--- maior valor\n", i, vetorA[i]);
      		  System.out.printf("v["+i+"] = "+ vetorA[i] + " <--- maior valor\n");
           else //System.out.printf("v[%d] = %2d\n", i, vetorA[i]);
      			System.out.printf("v["+i+"] = "+ vetorA[i] + "\n" );
    }

    System.out.printf(" Soma = "+ soma);
  }

}