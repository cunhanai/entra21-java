package lista6lacosrepeticao;

import java.util.Scanner;

public class Questao18CrescimentoPopulacional2 {
	
	/*
	 * Quest�o 18 � Altere o programa anterior permitindo ao usu�rio informar as popula��es
	 * e as taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pais1, pais2, auxPais;
		int pop1 = 0, pop2 = 0, auxPop, anos = 0;
		double taxa1 = 0, taxa2 = 0, auxTaxa;
		boolean controle1 = true, controle2 = true;
		char repita;
		
		loop1:
		while (controle1) {
			System.out.println("Digite o nome dos pa�ses para realiza��o do c�lculo.");
			System.out.print("Primeiro pa�s: ");
			pais1 = sc.next().toUpperCase();
			System.out.print("Segundo pa�s: ");
			pais2 = sc.next().toUpperCase();
			
			loop2:
			while (controle2) {
				System.out.println("\nAgora digite as popula��es dos respectivos pa�ses.");
				System.out.printf("%s %s: ", "Popula��o de", pais1);
				pop1 = sc.nextInt();
				System.out.printf("%s %s: ", "Popula��o de", pais2);
				pop2 = sc.nextInt();
				
				if (pop1 <= 0 || pop2 <= 0) {
					System.out.println("\nPopula��o n�o pode ser menor nem igual a zero!");
				}
				else {
					break loop2;
				}
			}
			
			loop2:
			while (controle2) {
				System.out.println("\nPor �ltimo, digite as taxas de crescimento.");
				System.out.printf("%s %s: ", "Taxa de", pais1);
				taxa1 = sc.nextDouble();
				System.out.printf("%s %s: ", "Taxa de", pais2);
				taxa2 = sc.nextDouble();
				
				if (taxa1 <= 0 || taxa2 <= 0) {
					System.out.println("\nTaxa n�o pode ser menor nem igual a zero!");
				}
				else {
					break loop2;
				}
			}
		
			if (pop1 > pop2) {
				auxPais = pais1;
				pais1 = pais2;
				pais2 = auxPais;
				
				auxPop = pop1;
				pop1 = pop2;
				pop2 = auxPop;
				
				auxTaxa = taxa1;
				taxa1 = taxa2;
				taxa2 = auxTaxa;
			}
			
			while (pop1 < pop2) {
				pop1 = (int)(pop1 + (pop1 * taxa1));
				pop2 = (int)(pop2 + (pop2 * taxa2));
				++anos;
			}
			
			System.out.printf("%nSer�o necess�rios %d anos para que a popula��o de %s seja maior que a de %s.", anos, pais1, pais2);
			
			loop2:
			do {
				System.out.print("\n\nDeseja repetir a opera��o? [S/N]: ");
				repita = Character.toLowerCase(sc.next().charAt(0));
				if (repita == 's') {
					System.out.println("Reiniciando programa...");
					System.out.println();
					System.out.println();
					break loop2;
				}else if (repita == 'n'){
					System.out.println("Encerrando programa...");
					break loop1;
				}else {
					System.out.println("Letra inv�lida! Digite S para repetir a opera��o e N para encerrar.");
					System.out.println();
				}
			} while (controle2);
			
		}
		
		sc.close();
	}
}
