package br.com.projetoweb.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Municipio implements Serializable{
	@Id // tem que especificar qual é a chave primária, mesmo já tendo no bd
	private int cod_municipio;
	private String municipio;

	public int getCod_Municipio() {
		return cod_municipio;
	}

	public void setCod_Municipio(int cod_municipio) {
		this.cod_municipio = cod_municipio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
