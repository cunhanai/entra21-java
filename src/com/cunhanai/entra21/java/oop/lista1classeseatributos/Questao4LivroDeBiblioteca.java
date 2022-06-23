/*
 * Questao 4 Livro De Biblioteca
 * @date 2022-06-21
 * @author Ana Julia da Cunha - Entra21
 * 
 * 4. Usando o resultado do modelo “Livro” como base, crie uma classe 
 * “LivroDeBiblioteca” que represente os dados básicos de um livro de uma 
 * biblioteca, que pode ser emprestado a leitores
 */

package com.cunhanai.entra21.java.oop.lista1classeseatributos;

public class Questao4LivroDeBiblioteca {
	
	int ISBN10; // ISBN-10 do livro
	int ISBN13; // ISBN-13 do livro
	String titulo; // titulo e subtitulo do livro
	String autor; // autor(a) do livro
	String genero; // genero do livro (ficcao, romance, aventura, terro etc.)
	String assuntos; // assuntos ao qual o livro trata
	String sinopse; // sinopse do livro
	String editora; // editora que publicou o livro
	int edicao; // edicao do livro
	int ano; // ano de publicacao desta edicao
	String idioma; // idioma ao qual o exemplar do livro esta disponivel
	String capa; // capa dura, brochura, etc.
	int qtdePaginas; // quantidade de paginas do livro
	int faixaEtaria; // faixa etaria indicada de leitura
	float[] dimensoes = new float[3]; // dimensoes do livro, largura x grossura x altura
	String numeroAcesso; // numero de acesso
	boolean emprestado; // true caso o livro esteja emprestado para alguem
	String clienteEmprestado; // cliente ao qual o livro foi emprestado
}
