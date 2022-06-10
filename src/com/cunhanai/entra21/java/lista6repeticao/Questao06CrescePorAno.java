package lista6lacosrepeticao;

public class Questao06CrescePorAno {

	/*
	 * Questão 6 - Chico tem 1,50m e cresce 2 centímetros por ano, enquanto Juca tem 1,10m e cresce 
	 * 3 centímetros por ano. Construir um programa que calcule e imprima quantos anos serão 
	 * necessários para que Juca seja maior que Chico
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
		
		System.out.printf("Serão necessários %d para que Juca seja maior que Chico, quando ambos terão, "
				+ "respectivamente, %.2fm e %.2fm.", anos, alturaJuca, alturaChico);
	}

}
