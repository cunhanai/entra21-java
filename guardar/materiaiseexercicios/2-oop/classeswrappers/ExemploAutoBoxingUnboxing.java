package com.entra21.cursojavamanha.oop.exerciciospratica.classeswrappers;

public class ExemploAutoBoxingUnboxing {

	public static void main(String[] args) {
		
		//Primitivos
		byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10F;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;
	
		
		//AUTOBOXING
        Byte bAutoboxing = 1;
        Short sAutoboxing = 2;
        Integer iAutoboxing = 10;
        Long lAutoboxing = 50l;
        Float fAutoboxing = 10f;
        Double dAutoboxing = 20.0;
        Character cAutoboxing = 'A';
        Boolean boAutoboxing = true;
        
        System.out.println("bAutoboxing " + bAutoboxing);
        System.out.println("sAutoboxing " +sAutoboxing);
        System.out.println("iAutoboxing " + iAutoboxing);
        System.out.println("lAutoboxing "+ lAutoboxing);
        System.out.println("fAutoboxing "+ fAutoboxing);
        System.out.println("dAutoboxing " +dAutoboxing);
        System.out.println("cAutoboxing "+ cAutoboxing);
        System.out.println("boAutoboxing "+boAutoboxing);

	}

}
