/*
 * Questao 01 Calculo Idade
 * @date Maio 2022
 * @author Ana J�lia da Cunha - Entra21
 * 
 * Questao_1: Escreva um c�digo que calcule a idade de uma pessoa com
 * base no ano atual e no seu ano de nascimento, informados pelo usu�rio.
 */

package com.cunhanai.entra21.java.lista1;
import java.util.*;

public class Questao01CalculoIdade {
	public static void main(String[] args) {
        int anoAtual, anoNasc, idade;
        Scanner sc = new Scanner(System.in);
        
        // PEDE O ANO ATUAL E O ANO DE NASCIMENTO DA PESSOA AO USU�RIO
        System.out.print("Ano atual: ");
        anoAtual = sc.nextInt();
        System.out.print("Ano de nacimento: ");
        anoNasc = sc.nextInt();
        
        // CALCULA A IDADE E A IMPRIME
        idade = anoAtual - anoNasc;
        System.out.println("Sua idade �: " + idade);
        
        sc.close();
    }
}
