package br.com.projetoweb.entity;

public class SetorPrivadoMunicipal {

	private Municipio municipio;
	private int ano;
	private int entidade_empresa_estatal;
	private int entidade_empresa_privada;
	private int entidade_sem_fins_lucrativos;
	private int pessoa_fisica_outras_organizaçoes_legais;

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

	public int getEntidade_empresa_estatal() {
		return entidade_empresa_estatal;
	}

	public void setEntidade_empresa_estatal(int entidade_empresa_estatal) {
		this.entidade_empresa_estatal = entidade_empresa_estatal;
	}

	public int getEntidade_empresa_privada() {
		return entidade_empresa_privada;
	}

	public void setEntidade_empresa_privada(int entidade_empresa_privada) {
		this.entidade_empresa_privada = entidade_empresa_privada;
	}

	public int getEntidade_sem_fins_lucrativos() {
		return entidade_sem_fins_lucrativos;
	}

	public void setEntidade_sem_fins_lucrativos(int entidade_sem_fins_lucrativos) {
		this.entidade_sem_fins_lucrativos = entidade_sem_fins_lucrativos;
	}

	public int getPessoa_fisica_outras_organizaçoes_legais() {
		return pessoa_fisica_outras_organizaçoes_legais;
	}

	public void setPessoa_fisica_outras_organizaçoes_legais(int pessoa_fisica_outras_organizaçoes_legais) {
		this.pessoa_fisica_outras_organizaçoes_legais = pessoa_fisica_outras_organizaçoes_legais;
	}

}
