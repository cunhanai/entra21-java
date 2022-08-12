
public class ExemploMatrizTridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [ ][ ][ ] matrizTridimensional =  new int[3][3][3];
		
		//ATRIBUINDO VALORES A MATRIZ 3D SOMA DOS INDICES
		for(int i = 0; i < matrizTridimensional.length; i++) {
			
			for(int j = 0; j < matrizTridimensional[i].length; j++) {
				
				for(int k = 0; k < matrizTridimensional[i][j].length; k++) {
					//System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matrizTridimensional[i][j][k] = i + j + k;
					
				}
			}	
		}
		
		//IMPRIMINDO OS ELEMENTOS DA MATRIZ 3D
		for(int i = 0; i < matrizTridimensional.length; i++) {
			
			for(int j = 0; j < matrizTridimensional[i].length; j++) {
				
				for(int k = 0; k < matrizTridimensional[i][j].length; k++) {
					
					System.out.print(" " + matrizTridimensional[i][j][k]);
	
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		 //FAZENDO A SOMA TOTAL, SOMA DE PARES E IMPARES
		for(int i = 0; i < matrizTridimensional.length; i++) {
			
			for(int j = 0; j < matrizTridimensional[i].length; j++) {
				
				for(int k = 0; k < matrizTridimensional[i][j].length; k++) {
					soma += matrizTridimensional[i][j][k];
					
					if(matrizTridimensional[i][j][k] % 2 == 0) {
						somaPares += matrizTridimensional[i][j][k];
					}
					else {
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}
			}	
		}
		
		//IMPRIMINDO RESULTADOS
		System.out.println(" Soma: " + soma);
		System.out.println(" SomaPares: " + somaPares);
		System.out.println(" SomaImpares: " + somaImpares);

	}

}
