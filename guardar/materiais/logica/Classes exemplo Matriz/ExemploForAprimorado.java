import java.util.Scanner;

public class ExemploForAprimorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 int[] array = { 87,68,94,100,83,78,85,91,76,87 };
		 int total = 0;
		 
		 //adiciona o valor de cada elemento ao total
		 for(int numero : array) {
			 total += numero;
		 	System.out.println( " total de elementos do array= " + total);
		 	System.out.println();
		 }
		 
		 // outro exemplo com matriz
		 int[][] matriz1 = { {1,2,3}, {4,5,6}, {7,8,9},{10,11,12} };
		 
		//MOSTRANDO OS ELEMEMNTOS DA MATRIZ
		 // faz um loop pelas linhas do array
		 for(int[] linha : matriz1) {
			 //faz o loop pelas colunas da linha atual
			 for(int coluna : linha) {
				 System.out.print(coluna + ", ");
			 }
			 System.out.println();
		 }

	}

}
 