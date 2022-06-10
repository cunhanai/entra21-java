package lista6lacosrepeticao;

public class Questao06CrescePorAno {

	/*
	 * Quest�o 6 - Chico tem 1,50m e cresce 2 cent�metros por ano, enquanto Juca tem 1,10m e cresce 
	 * 3 cent�metros por ano. Construir um programa que calcule e imprima quantos anos ser�o 
	 * necess�rios para que Juca seja maior que Chico
	 */
	
	public static void main(String[] args) {
		float alturaChico, alturaJuca, crescAnualChico, crescAnualJuca;
		int anos = 0;
		
		alturaChico = 1.5f;
		alturaJuca = 1.1f;
		crescAnualChico = 0.02f;
		crescAnualJuca = 0.03f;
		
		while (alturaJuca <= alturaChico) {
			alturaJuca += crescAnualJuca;
			alturaChico += crescAnualChico;
			++anos;
		}
		
		System.out.printf("Ser�o necess�rios %d para que Juca seja maior que Chico, quando ambos ter�o, "
				+ "respectivamente, %.2fm e %.2fm.", anos, alturaJuca, alturaChico);
	}

}
