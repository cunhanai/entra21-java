import java.util.Scanner;

public class ExemploMatrizIrregularPesquisaFilhos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numeroPessoas = 0;
		int qtdFilhos = 0;
		
		System.out.println("Entre com o numero de pessoas que ser�o entrevistadas:");
		numeroPessoas = scan.nextInt();
		String[][] nomesFilhos = new String[numeroPessoas] [];
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			
			System.out.println("Entre com a quantidade de filho(s) da pessoa " + i );
			qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.print("Digite o nome do " + (j+1)+ "� filho:");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem  " + nomesFilhos[i].length  + " filhos");
			for(int j = 0; j <nomesFilhos[i].length;j++ )
				System.out.println(nomesFilhos[i][j]);
		}
	}

}
