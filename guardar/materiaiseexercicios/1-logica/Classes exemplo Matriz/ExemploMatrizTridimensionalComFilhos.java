import java.util.Scanner;

public class ExemploMatrizTridimensionalComFilhos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numeroPessoas = 0;
		int qtdFilhos = 0;
		int idade = 0;
		
		System.out.println("Entre com o numero de pessoas que ser�o entrevistadas:");
		numeroPessoas = scan.nextInt();
		String[][][] numFilhos = new String[numeroPessoas][][];
		
		for(int i = 0; i < numFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filho(s) da pessoa " + i );
			qtdFilhos = scan.nextInt();
			numFilhos[i] = new String[qtdFilhos][];
			
			for(int j = 0; j < numFilhos[i].length; j++) {
				numFilhos[i][j] = new String[2];// Posição 2 pois é o nome e a idade
				
				for(int k = 0; k < numFilhos[i][j].length; k++) {
										
					if(k == 0) {
						System.out.print("Digite o nome do " + (j+1)+ "� filho:");
						numFilhos[i][j][k] = scan.next();
					}
					else {
					System.out.print("Digite a idade do " + (j+1)+ "� filho:");
					numFilhos[i][j][k] = scan.next();
					}
					
				}
			}
		}	
		
		for(int i = 0; i < numFilhos.length; i++) {
			
			for(int j = 0; j < numFilhos[i].length; j++) {
									
				for(int k = 0; k < numFilhos[i][j].length; k++) {
					
					System.out.println(numFilhos[i][j][k]);
				}
				
			}
		}

	}

}
