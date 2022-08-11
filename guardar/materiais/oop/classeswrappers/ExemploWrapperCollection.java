package com.entra21.cursojavamanha.oop.exerciciospratica.classeswrappers;

import java.util.ArrayList;
import java.util.HashMap;

public class ExemploWrapperCollection {

	public static void main(String[] args) {
		
		boolean b1 = true;
		//Boolean b2 = new Boolean(b1);
		Boolean b2 = Boolean.valueOf(b1);
		ArrayList list = new ArrayList();
		list.add(b1);
		list.add(b2);
		System.out.println(list.get(0));

		int num1 = 5;
		//Integer num2 = new Integer(num1);
		Integer num2 = Integer.valueOf(num1);
		ArrayList list2 = new ArrayList();
		list2.add(5);
		list2.add(num2);
		System.out.println(list2.get(0));
		
	}

}
