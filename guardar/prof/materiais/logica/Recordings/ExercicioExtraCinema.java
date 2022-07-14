package prof.materiais.logica.Recordings;

import java.util.Scanner;

public class ExercicioExtraCinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int capacidadeMax = 2;
		int idade = 0;
		int opiniao = 0;
		int qtdOtimos = 0;
		int qtdBom = 0;
		int qtdRegular = 0;
		int qtdRuim = 0;
		int qtdPessimo = 0;
		int qtdBomRegular = 0;
		float percentBomReg = 0;
		float mediaIdadeRuim = 0;
		float percentRespPessimo = 0;
		int DifIdadeMaiorOtimoRuim = 0;
		int maiorIdadePessimo = 0;
		int maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0;
		
			for(int i = 1; i <=capacidadeMax; i++ ) {
				
				System.out.println ("INFORME SUA IDADE VÃ�LIDA (SEMPRE MAIOR QUE ZERO)");
				idade = scan.nextInt();
				
				while(idade <= 0 ) {
	            	System.out.println ("IDADE INVÃ�LIDA. INFORME NOVAMENTE SUA IDADE (SEMPRE MAIOR QUE ZERO)");
	            	idade = scan.nextInt();
	            }
				
				System.out.println("Selecione sua opiniÃ£o!");
	            System.out.println("5 - ***** Ã“timo!");
	            System.out.println("4 - **** Bom!");
	            System.out.println("3 - *** Regular!");
	            System.out.println("2 - ** Ruim!");
	            System.out.println("1 - * PÃ©ssimo!");
	            opiniao = scan.nextInt();
	            while( opiniao < 1 || opiniao > 5 ) {
	            	System.out.println ("INFORME UMA OPINIAO VÃ�LIDA. ");
	            	System.out.println("Selecione sua opiniÃ£o!");
		            System.out.println("5 - ***** Ã“timo!");
		            System.out.println("4 - **** Bom!");
		            System.out.println("3 - *** Regular!");
		            System.out.println("2 - ** Ruim!");
		            System.out.println("1 - * PÃ©ssimo!");
	            	opiniao = scan.nextInt();
	            }
	            
	            switch(opiniao) {
	            case 5:
	            	qtdOtimos++;
	            	if(idade > maiorIdadeOtimo) {
	            		maiorIdadeOtimo = idade;
	            	}	
	            	//System.out.println (qtdOtimos);
	            	break;
	            case 4:
	            	qtdBom++;
	            	qtdBomRegular++;
	            	//System.out.println (qtdBom);
	            	break;
	            case 3:
	            	qtdRegular++;
	            	qtdBomRegular++;
	            	//System.out.println (qtdRegular);
	            	break;
	            case 2:
	            	qtdRuim++;
	            	mediaIdadeRuim += idade;
	            	if(idade > maiorIdadeRuim) {
	            		maiorIdadeRuim = idade;
	            	}	
	            	//System.out.println (qtdRuim);
	            	break;
	            case 1:
	            	qtdPessimo++;
	            	//System.out.println (qtdPessimo);
	            	if(idade > maiorIdadePessimo) {
	            		maiorIdadePessimo = idade;
	            	}	
	            	break;
	            default:
	            }
	
			}
			
			 percentBomReg = qtdBomRegular/(qtdBom - qtdRegular);
			 mediaIdadeRuim /= qtdRuim;
			 //mediaIdadeRuim = mediaIdadeRuim/qtdRuim;
			 percentRespPessimo =  (qtdPessimo*100)/capacidadeMax;
			 DifIdadeMaiorOtimoRuim = maiorIdadeOtimo - maiorIdadeRuim; 
			 System.out.println ("A quantidade de respostas Ã³timo" + qtdOtimos);
         	 System.out.println("a diferenÃ§a percentual entre respostas bom e regular" +percentBomReg);
	         System.out.println("a mÃ©dia de idade das pessoas que responderam ruim"+ mediaIdadeRuim);
	         System.out.println("a percentagem de respostas pÃ©ssimo e a maior idade que utilizou esta opÃ§Ã£o" + percentRespPessimo + maiorIdadePessimo );
	         System.out.println("a diferenÃ§a de idade entre a maior idade que respondeu Ã³timo e a maior idade que respondeu ruim." + DifIdadeMaiorOtimoRuim );

			scan.close();
		
	}

}
