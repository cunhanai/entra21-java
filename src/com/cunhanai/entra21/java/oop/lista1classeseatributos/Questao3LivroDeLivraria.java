/*
 * Questao 3 Livro De Livraria
 * @date 2022-06-21
 * @author Ana Julia da Cunha - Entra21
 * 
 * 3. Usando o resultado do exercício anterior como base, crie uma classe 
 * “LivroDeLivraria” que represente os dados básicos de um livro que está à 
 * venda em uma livraria.
 */

package com.cunhanai.entra21.java.oop.lista1classeseatributos;

public class Questao3LivroDeLivraria {
	
	int ISBN13; // ISBN-13 do livro
	int ISBN10; // ISBN-10 do livro
	String titulo; // titulo e subtitulo do livro
	String autor; // autor(a) do livro	
	String genero; // genero do livro (ficcao, romance, aventura, terro etc.)
	float preco; // preco do livro na livraria
	int estoque; // quantidade de livros em estoque
	String sobreAutor; // informacoes e apresentacao do autor do livro
	String sinopse; // sinopse do livro
	String editora; // editora que publicou o livro
	int edicao; // edicao do livro
	int ano; // ano de publicacao desta edicao
	String idioma; // idioma ao qual o exemplar do livro esta disponivel
	String capa; // capa dura, brochura, etc.
	int qtdePaginas; // quantidade de paginas do livro
	int faixaEtaria; // faixa etaria indicada de leitura
	float[] dimensoes = new float[3]; // dimensoes do livro, largura x grossura x altura
}
