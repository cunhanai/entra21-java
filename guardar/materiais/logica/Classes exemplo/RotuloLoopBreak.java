
public class RotuloLoopBreak {	
	public static void main(String[] args) { 
		
		/*
		 *Neste exemplo, demos um nome para o loop for externo como loop1
		 * e loop for interno como loop2. Quando a condi��o if do loop for interno retorna true, 
		 * ele sai do loop for externo e toda a execu��o do loop for para. 
		 * � por isso que a itera��o restante com i = 2,  i = 1 e i= 0  n�o s�o executadas.
		 */
	
		loop1:	    
			for(int i=3;i>=0;i--) {		
					loop2:	
					for(int j=1;j<=3;j++) {			
						System.out.println("i " + i + " J " + j);		
						if(i==2 && j ==2) {
							break loop1;
						    //continue loop1;
						}	
					}
			}
	}
}