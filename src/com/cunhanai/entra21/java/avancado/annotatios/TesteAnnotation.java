package com.cunhanai.entra21.java.avancado.annotatios;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TesteAnnotation {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("Bruno", "23489761456", LocalDate.of(2005, Month.JANUARY, 13));
		System.out.println(validador(usuario1));
		
		Usuario usuario2 = new Usuario("Ana", "54564654654", LocalDate.of(2004, Month.APRIL, 23));
		System.out.println(validador(usuario2));
	}

	public static <T> boolean validador(T objeto) {
		Class<?> classe = objeto.getClass();
		for (Field field : classe.getDeclaredFields()) {
			if (field.isAnnotationPresent(IdadeMinima.class)) {
				IdadeMinima idadeMinima = field.getAnnotation(IdadeMinima.class);
				try {
					field.setAccessible(true);
					LocalDate dataNascimento = (LocalDate) field.get(objeto);
					return Period.between(dataNascimento, LocalDate.now()).getYears() >= idadeMinima.valor();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}
}
