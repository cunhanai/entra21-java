
public class RotuloLoopContinue {
public static void main(String[] args) { 
		
		/*
		 *No exemplo abaixo, podemos ver que as iterações com valores i = 2, j = 2 & i = 2, j = 3 
		 *não são executadas. Isso ocorre porque, quando i = 2 e j = 2, 
		 *temos continuar loop1, o que significa que ele para a execução do loop for interno 
		 *e atualiza diretamente o valor i (neste caso i-– o que significa i = 1) e inicia 
		 *a execução com o valor i = 1 e continua
		 */
	
			loop1:	    
			for(int i=3;i>=0;i--) {	
					loop2:	
					for(int j=1;j<=3;j++) {	
						if(i==2 && j ==2) 
							continue loop1;
							System.out.println("i " +i + " j "
									+ "" + j);		
					}
			}
	}

}
