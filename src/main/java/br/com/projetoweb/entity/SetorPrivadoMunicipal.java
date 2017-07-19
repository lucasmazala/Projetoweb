package br.com.projetoweb.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class SetorPrivadoMunicipal extends GenericEntity implements Serializable {

	private String municipio;
	private String ano;
	private int entidade_empresa_estatal;
	private int entidade_empresa_privada;
	private int entidade_sem_fins_lucrativos;
	private int pessoa_fisica_outras_organizaçoes_legais;

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
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
