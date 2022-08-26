package materiais.oop.tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTrataMultiplosCatch {

	public static void main(String[] args) {

		  String frase = null;
		  String novaFrase = null;
		  String[] frutas = new String[3];
		  String fruta;
		  frutas[0] = "maça";
		  frutas[1] = "banana";
		  frutas[2] = "Pera";
		  boolean continueLoop = true;
		  
		  Scanner scan = new Scanner(System.in);
		  
		  do {
			  fruta = "";
			  try
			  {
			     System.out.println("Entre com o numerador");
			     int numerador = scan.nextInt();
			     System.out.println("Entre com o denominador");
			     int denominador =scan.nextInt();  
			     
			     int resultDivisao = numerador/denominador;// arithmetic 
			     System.out.println("Resultado divisão: " + resultDivisao + "\n");
				  
				  novaFrase = frase.toUpperCase(); // nullpointer
				  
				  System.out.println("Entre com uma fruta para Troca");
				  fruta = scan.next(); 
				  frutas[3] = fruta;//IndexArrayOut
				 
			  }
			  catch(NullPointerException e) //CAPTURA DA POSSÍVEL EXCEÇÃO.
			  {
			    //TRATAMENTO DA EXCEÇÃO
			    System.out.println("A frase inicial está nula," +
			    			"para solucionar tal problema, foi lhe atribuito um valor default.");
			    frase = "Frase vazia";
			    novaFrase = frase.toUpperCase();
				System.out.println("Frase antiga: "+frase);
				System.out.println("Frase nova: "+novaFrase);
				System.out.println();
			  } 
			  catch(ArithmeticException e)
			  {	 //TRATAMENTO DA EXCEÇÃO
				 System.out.println(" Divisao por ZERO tente novamente"); 
			  }
			  catch(InputMismatchException e)
			  {	  //TRATAMENTO DA EXCEÇÃO
				  System.out.println("Você deve entrar com inteiro. Tente novamente");
				  scan.nextLine();
				 
			  }  
			  catch(ArrayIndexOutOfBoundsException e)
			  {	   //TRATAMENTO DA EXCEÇÃO
				  System.out.println(" Fruta antes " + frutas[2]);
				  frutas[2] = fruta;
				  System.out.println(" Fruta trocada com sucesso " + frutas[2]);
				  continueLoop = false;
			  }
			  
			  
		  }while(continueLoop);
	
	}

}
