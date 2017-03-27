package br.com.projetoweb.entity;

public class SetorPublicoMunicipal {

	private Municipio municipio;
	private int ano;
	private int setor_publico_federal;
	private int setor_publico_estadual;
	private int setor_publico_municipal;
	private int setor_publico_outros;

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSetor_publico_federal() {
		return setor_publico_federal;
	}

	public void setSetor_publico_federal(int setor_publico_federal) {
		this.setor_publico_federal = setor_publico_federal;
	}

	public int getSetor_publico_estadual() {
		return setor_publico_estadual;
	}

	public void setSetor_publico_estadual(int setor_publico_estadual) {
		this.setor_publico_estadual = setor_publico_estadual;
	}

	public int getSetor_publico_municipal() {
		return setor_publico_municipal;
	}

	public void setSetor_publico_municipal(int setor_publico_municipal) {
		this.setor_publico_municipal = setor_publico_municipal;
	}

	public int getSetor_publico_outros() {
		return setor_publico_outros;
	}

	public void setSetor_publico_outros(int setor_publico_outros) {
		this.setor_publico_outros = setor_publico_outros;
	}

}