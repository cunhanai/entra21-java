package com.cunhanai.entra21.java.avancado.lambda;

import java.util.function.BinaryOperator;

public class Calculadora {
	
//	public static double calcular(double x, double y, OperacaoMatematica operacao) {
//		return operacao.operar(x, y);
//	}
	
	public static double calcular(double x, double y, BinaryOperator<Double> operacao) {
		return operacao.apply(x, y);
	}
	
}
