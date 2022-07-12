
public class ExemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] valores = new double[6]; // Ap�s executada essa instru��o, terei essa 
										 //estrutura criada na mem�ria, por�m vazia. 
		
		//Preenchendo o array individual:
		valores[0] = 5.0;
		valores[1] = 4.8;
		valores[2] = 7.9;
		valores[3] = 4.2;
		valores[4] = 6.4;
		valores[5] = 3.5;
		//outra forma  seria pedir ao usu�rio para entrar com os dados e ir
		//preenchendo as posi��es do array. Ou ainda usar um la�o for para preencher.
		
		//Acessando elementos do array. Acessando seu quinto elemento (numero de posi��o 4)
		System.out.println("Elemento 5 do array: " + valores[4]);
		
		//verificando o tamanho do array
		System.out.println("tamanho do array: " + valores.length);
		
		
		//Alterando o valor de sua posi��es no array
		valores[0] = 6.8;
		valores[4] = 1.1;
		
		//Acessando os  elementos alterados. Acessando seu quinto elemento (numero de posi��o 4)
		System.out.println("Posicao 0 alterada para: " + valores[0]);
		System.out.println("Posicao 4 alterada para: " + valores[4]);
		
		//Mostrar todos os elementos do array
		for( int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		
		//Somar os elementos do array
		double total = 0;
		for( int i = 0; i < valores.length; i++) {
			total += valores[i];
		}
		System.out.println("O total � " + total);

	}

}

/*	// Mostra todos os elementos do array com
		//for each  o para cada. Adicionado ao java na versao 5
		for(double elemento: valores) { // double mesmo tipo do array
			System.out.println(elemento);
		}*/
