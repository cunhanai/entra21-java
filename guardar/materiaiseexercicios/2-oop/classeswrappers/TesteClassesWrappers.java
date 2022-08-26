package com.entra21.cursojavamanha.oop.exerciciospratica.classeswrappers;

public class TesteClassesWrappers {

	public static void main(String[] args) {
		
		byte bytePrimitivo = 1;
        short shortPrimitivo = 2;
        int intPrimitivo = 10;
        long longPrimitivo = 20;
        float floatPrimitivo = 30;
        double doublePrimitivo = 40F;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;
        
        System.out.println("bytePrimitivo " + bytePrimitivo);
        System.out.println("shortPrimitivo " +shortPrimitivo);
        System.out.println("intPrimitivo " + intPrimitivo);
        System.out.println("longPrimitivo "+ longPrimitivo);
        System.out.println("floatPrimitivo "+ floatPrimitivo);
        System.out.println("doublePrimitivo " +doublePrimitivo);
        System.out.println("charPrimitivo "+ charPrimitivo);
        System.out.println("booleanPrimitivo "+booleanPrimitivo);
        
       System.out.println();

		 //Representação em String do tipo que está sendo criado
         Byte byteWrapperString = new Byte("5"); 
         Short shortWrapperString = new Short("41");
         Integer integerWrapperString = new Integer("10");
         Long longWrapperString = new Long("20");
         Float floatWrapperString = new Float("25");
		 Double doubleWrapperString = new Double("512.22");
	     Float f2 = new Float("1.0"); //Se a String passada como argumento
			//não for um número ou não pertencer ao //intervalo correspondente ao float, 
			//então a //exceção NumberFormatException é //lançada
	     Character characterWrapperString = new Character('A');
	     Boolean booleanWrapperString = new Boolean("True");
	     
	     	System.out.println("byteWrapperString " + byteWrapperString);
	        System.out.println("shortWrapperString " +shortWrapperString);
	        System.out.println("integerWrapperString " + integerWrapperString);
	        System.out.println("longWrapperString "+ longWrapperString);
	        System.out.println("floatWrapperString "+ floatWrapperString);
	        System.out.println("doubleWrapperString " +doubleWrapperString);
	        System.out.println("characterWrapperString "+ characterWrapperString);
	        System.out.println("booleanWrapperString "+booleanWrapperString);
	        
	        System.out.println();

		 //o argumento somente aceita do tipo char, por isso que é usado aspas simples
		 Character characterWrapper = new Character('a');

		 //Criação do tipo primitivo natural
		 Byte byteWrapper = new Byte((byte)1);
		 Integer integerWrapper = new Integer(2800);
		 Long longWrapper = new Long(10);
		 Float floatWrapper = new Float(500.50);
		 Double doubleWrapper = new Double(1.0);
		 short s1 = 41;
		 Short shortWrapper = new Short(s1); //Não dá para passar 41 direto,
		 Short s3 = new Short((short)41); //porque esse valor é considerado int
		 boolean b1 = true;
		 Boolean booleanWrapper = new Boolean(b1);
		 Boolean booleanWrapper2 = new Boolean(false);
  
	        System.out.println("byteWrapper " + byteWrapper);
	        System.out.println("shortWrapper " +shortWrapper);
	        System.out.println("integerWrapper " + integerWrapper);
	        System.out.println("longWrapper "+ longWrapper);
	        System.out.println("floatWrapper "+ floatWrapper);
	        System.out.println("doubleWrapper " +doubleWrapper);
	        System.out.println("characterWrapper "+ characterWrapper);
	        System.out.println("booleanWrapper "+booleanWrapper);
	        System.out.println("booleanWrapper2 "+booleanWrapper2);

	        System.out.println();
	        
	        System.out.println(Character.isDigit('9'));
	        System.out.println(Character.isLetter('1'));
	        System.out.println(Character.isLetterOrDigit('#'));
	        System.out.println(Character.isUpperCase('A'));
	        System.out.println(Character.isLowerCase('A'));
	        System.out.println(Character.toUpperCase('9'));

	}

}
