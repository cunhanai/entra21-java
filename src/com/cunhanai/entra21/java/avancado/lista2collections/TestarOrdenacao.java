package com.cunhanai.entra21.java.avancado.lista2collections;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestarOrdenacao {

	public static void main(String[] args) {
		
		Random random = new Random();

		// CRIANDO CONTAS
		
		ContaPoupanca a = new ContaPoupanca();
		a.setNumero(2145);
		a.setNome("Ana");

		ContaPoupanca b = new ContaPoupanca();
		b.setNumero(544);
		b.setNome("Heloisa");

		ContaPoupanca c = new ContaPoupanca();
		c.setNumero(566);
		c.setNome("Joao");

		ContaPoupanca d = new ContaPoupanca();
		d.setNumero(265);
		d.setNome("Emanuel");
		
		// ADICIONANDO COM ARRAYLIST
//		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
//		contas.add(a);
//		contas.add(b);
//		contas.add(c);
//		contas.add(d);

		// ADICIONANDO COM LINKEDLIST
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		contas.add(a);
		contas.add(b);
		contas.add(c);
		contas.add(d);
		
		// ADICIONA SALDO ALEATORIO
		for (ContaPoupanca linha : contas) {
			linha.setSaldo(random.nextDouble() * 2000);
		}
		
		System.out.println("-----<SALDO ALETORIO>-----");
		for (ContaPoupanca item : contas) {
			System.out.println(item);
		}

		// ORDENANDO EM ORDEM ALFABETICA E PRINTANDO
		System.out.println("------<ORDEM>------");
		Collections.sort(contas);

		for (ContaPoupanca item : contas) {
			System.out.println(item);
		}

		// REVERTENDO A ORDEM E PRINTANDO
		System.out.println();
		System.out.println("----<ORDEM INVERTIDA>----");
		Collections.reverse(contas);

		for (ContaPoupanca item : contas) {
			System.out.println(item);
		}

	}

}
