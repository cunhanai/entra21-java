package com.entra21.cursojavamanha.oop.exerciciospratica.classeswrappers;

	public class ExemplosWrappers {
		public static void main(String[] args){

		    int z= Integer.parseInt("dois");
		    System.out.println(z);
		    /* codigo compila sem problemas mais uma excecao vai acontecer
		     * nao há nada de errado na sintaxe
		     * porem a jvm nao consegue converter uma string literal
		     * em um numero inteiro
		     */
		 //Exception in thread "main" java.lang.NumberFormatException: For input string: "dois"
			
//			int z= Integer.parseInt("2"); //O CORRETO
//			System.out.println(z);


		//Por outro lado, o codigo abaixo irá compilar e executar normalmente
		//Parse
//		     double d = Double.parseDouble("10");
//		     System.out.println(d);
		     

		//O codigo abaixo também apresentará erro
//		    Long l = new Long(8);
//		    int lh = l.longValue(); // EXEMPLO AQUI RETIRAR COMENTARIO
		    /* nao compila tentando colocar um long
		     * dentro de um int nao é valido isso
		     */


		//Esta funcionará normalmente
	    //String --> OBJETO
//		    Float f = Float.valueOf("10");
//		    System.out.println(f);
		//Primitivo -=-> OBJETO
		//	Integer i = Integer.valueOf(100); // SEM USAR O CONSTRUTOR. Metodo transforma o tipo int em
//			System.out.println(i); 		   // uma instacia INTEGER;			 
		//OBJETO --> Primitivo
//			Integer i = Integer.valueOf(100); // sem CONSTRUTOR
//		    int p = i.intValue();
//      	System.out.println(p);
			
		    

		 //Veja um exemplo de teste de referência e primitivo
//		      Integer z = new Integer (10);
//		      Integer pri = new Integer(10);
//		      System.out.println(z==pri);//false
//		      System.out.println(z.equals(pri));//true
		       /* aqui dois objetos diferentes
		        * porem com mesmo valor
		        * == testa a referencia e nao valores dos
		        * objetos. Para ser verdadeiro utilizar EQUALS */
		      
//		      int z= Integer.parseInt("10");
//		      Integer i = Integer.valueOf(10);
//		      int pri = i.intValue();
//		      System.out.println(z==pri);//true
		      /* aqui são dois primitivos com mesmo valor
		        * == testa os valores dos
		        * primitivos que são iguais e verdadeiro retorna */
		      
		      
		      
			//Byte usando vaLueOf
//		      Byte b = Byte.valueOf((byte)1);
//		      System.out.println(b);
//		     
//		      Long l = Long.valueOf(100);
//		      Double d = Double.valueOf(10.0);
//		      System.out.println(i);



	}
}
