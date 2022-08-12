package com.cunhanai.entra21.java.oop.lista6interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {

	private String codigo;
	private String titulo;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Professor profResponsavel;
	private List<Pesquisador> equipe = new ArrayList<Pesquisador>();

	public ProjetoPesquisa() {

	}

	/**
	 * @param codigo
	 * @param titulo
	 * @param dataInicio
	 * @param dataFim
	 * @param profResponsavel
	 */
	public ProjetoPesquisa(String codigo, String titulo, LocalDate dataInicio, LocalDate dataFim,
			Professor profResponsavel) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.profResponsavel = profResponsavel;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the dataInicio
	 */
	public LocalDate getDataInicio() {
		return dataInicio;
	}

	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	/**
	 * @return the dataFim
	 */
	public LocalDate getDataFim() {
		return dataFim;
	}

	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	/**
	 * @return the profResponsavel
	 */
	public Professor getProfResponsavel() {
		return profResponsavel;
	}

	/**
	 * @param profResponsavel the profResponsavel to set
	 */
	public void setProfResponsavel(Professor profResponsavel) {
		this.profResponsavel = profResponsavel;
	}

	/**
	 * @return the equipe
	 */
	public List<Pesquisador> getEquipe() {
		return equipe;
	}

	/**
	 * @param equipe the equipe to set
	 */
	public void setEquipe(List<Pesquisador> equipe) {
		this.equipe = equipe;
	}

}
