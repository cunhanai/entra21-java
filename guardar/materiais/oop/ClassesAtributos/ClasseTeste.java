package com.entra21.cursojavamanha.oop.listaexercicios.classesatributos;

import java.util.Date;

public class ClasseTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 12;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "pequena";
		lampada.tipos = new String[4];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Pendentes";
		lampada.tipos[2] = "Lampiao";
		lampada.tipos[3] = "Florecente";
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.tensao);
		System.out.println(lampada.potencia);
		System.out.println(lampada.cor);
		System.out.println(lampada.tipoLuz);
		System.out.println(lampada.garantiaMeses);
		System.out.println(lampada.tipos[2]);

		//CONTA
		/ContaCorrente conta = new ContaCorrente();
		conta.numero = "12345";
		conta.agencia = "3087";
		conta.limiteEspecial = 2000;
		conta.valorEspecialUsado = 0;
		conta.saldo = -20;
		conta.especial = true;
		conta.situacaoConta[0] = "ativa";
		conta.situacaoConta[1] = "inativa";
		
		System.out.println("Saldo da conta: "  + conta.numero + " e " +conta.saldo);
		System.out.println("Limite da Conta: " + conta.numero + "e " +conta.limiteEspecial);
		System.out.println("Conta EspeciaL: " + conta.especial);
		System.out.println("Situacao Conta: " + conta.situacaoConta[0]);
		
		//AGENDA CELULAR
		AgendaCelular agenda = new AgendaCelular();
		agenda.nome = "Maria";
		agenda.email = "maria@teste.com.br";
		agenda.endereco = "Rua das Flores, n 230";
		agenda.telefones[0] = "47978888888";
		agenda.telefones[1] = "4732222222";
		agenda.telefones[2] = "47226666666";
		
		System.out.println("Nome do Contato: " + agenda.nome);
		System.out.println(" Email: " + agenda.email);
		System.out.println(" Endereco: " + agenda.endereco);
		System.out.println(" Telefone celular: " + agenda.telefones[0] );
		System.out.println(" Telefone Residencia: " + agenda.telefones[1]);
		System.out.println(" Telefone trab.: " + agenda.telefones[2]);*/
		
		// LIVRO
		/*Livro livro = new Livro();
		livro.nome= "Java programam";
		livro.autor = "Deitel";
		livro.anoLancamento = 1997;
		livro.qtdPaginas = 387;
		livro.isbn="123456";
		
		System.out.println(livro.nome);
		System.out.println(livro.anoLancamento);
		System.out.println(livro.autor);
		System.out.println(livro.isbn);
		System.out.println(livro.qtdPaginas);
		*/
		
		// LIVRO DE BIBLIOTECA
		LivroDeBiblioteca livroBiblioteca = new LivroDeBiblioteca();
		livroBiblioteca.nome= "Java para iniciantes";
		livroBiblioteca.autor = "Deitel";
		livroBiblioteca.anoLancamento = 2000;
		livroBiblioteca.qtdPaginas = 253;
		livroBiblioteca.isbn="123456";
		livroBiblioteca.dataSaida= new Date();
		livroBiblioteca.emprestadoCliente = "Zequinha";	
		
		System.out.println(livroBiblioteca.nome);
		System.out.println(livroBiblioteca.anoLancamento);
		System.out.println(livroBiblioteca.autor);
		System.out.println(livroBiblioteca.isbn);
		System.out.println(livroBiblioteca.qtdPaginas);
		System.out.println(livroBiblioteca.emprestado);
		System.out.println(livroBiblioteca.emprestadoCliente);
		System.out.println(livroBiblioteca.dataSaida);
		
		// LIVRO DE LIVRARIA
		/*LivroDeLivraria livroLivraria = new LivroDeLivraria();
		livroLivraria.nome= "Como programar";
		livroLivraria.autor = "Deitel";
		livroLivraria.anoLancamento = 1997;
		livroLivraria.qtdPaginas = 207;
		livroLivraria.isbn="123456";
		livroLivraria.preco = 70.00;
		
		System.out.println(livroLivraria.nome);
		System.out.println(livroLivraria.anoLancamento);
		System.out.println(livroLivraria.autor);
		System.out.println(livroLivraria.isbn);
		System.out.println(livroLivraria.qtdPaginas);
		System.out.println(livroLivraria.preco);*/
		
		
	}

}
