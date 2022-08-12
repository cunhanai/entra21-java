package com.cunhanai.entra21.java.oop.lista6interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProjetoPesquisa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int opcao;
		List<ProjetoPesquisa> projetos = new ArrayList<ProjetoPesquisa>();

		System.out.println("Escolha a opcao:" + "\n 1 - " + OpcoesMenu.CADASTRAR_PROJETOS + "\n 2 - "
				+ OpcoesMenu.INSERIR_PROFESSORES + "\n 3 - " + OpcoesMenu.INSERIR_ALUNOS + "\n 4 - " + OpcoesMenu.SAIR);
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
//			String codigo, String titulo, LocalDate dataInicio, LocalDate dataFim, Professor profResponsavel
			System.out.println("Codigo do projeto:");
			String codigo = sc.next();

			System.out.println("Titulo:");
			String titulo = sc.next();

			System.out.println("Data de início [dd-mm-aaaa]:");
			LocalDate dataInicio = converterData(sc.next());

			System.out.println("Data de fim [dd-mm-aaaa]:");
			LocalDate dataFim = converterData(sc.next());

			System.out.println("Professor responsavel:");
			String nomeProf = sc.next();

			Professor prof = new Professor();
			for (String professor : prof.getNomProf()) {
				if (nomeProf == professor) {
					prof.setNome(nomeProf);
					break;
				} else {
					System.out.println("Professor nao cadastrado no sistema.");
				}

			}
			ProjetoPesquisa projeto = new ProjetoPesquisa(codigo, titulo, dataInicio, dataFim, prof);

		}
	}

	public static LocalDate converterData(String dataString) {
		int dia, mes, ano;

		dia = Integer.parseInt(dataString.substring(0, 1));
		mes = Integer.parseInt(dataString.substring(3, 4));
		ano = Integer.parseInt(dataString.substring(6, 9));

		return LocalDate.of(ano, mes, dia);
	}

}
