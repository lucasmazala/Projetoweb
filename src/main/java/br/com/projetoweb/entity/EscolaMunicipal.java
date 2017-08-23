package br.com.projetoweb.entity;

import java.io.Serializable;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class EscolaMunicipal extends GenericEntity implements Serializable {
	private String municipio;
	private String ano;
	private int analfabeto;
	private int ate_5_incompleto; 
	private int fundamental_completo_5;
	private int de_6a9_fundamental;
	private int fundamental_completo;
	private int medio_incompleto;
	private int medio_completo;
	private int superior_incompleto;
	private int superior_completo;
	
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

	public int getAnalfabeto() {
		return analfabeto;
	}

	public void setAnalfabeto(int analfabeto) {
		this.analfabeto = analfabeto;
	}

	public int getAte_5_incompleto() {
		return ate_5_incompleto;
	}

	public void setAte_5_incompleto(int ate_5_incompleto) {
		this.ate_5_incompleto = ate_5_incompleto;
	}

	public int getFundamental_completo_5() {
		return fundamental_completo_5;
	}

	public void setFundamental_completo_5(int fundamental_completo_5) {
		this.fundamental_completo_5 = fundamental_completo_5;
	}

	public int getDe_6a9_fundamental() {
		return de_6a9_fundamental;
	}

	public void setDe_6a9_fundamental(int de_6a9_fundamental) {
		this.de_6a9_fundamental = de_6a9_fundamental;
	}

	public int getFundamental_completo() {
		return fundamental_completo;
	}

	public void setFundamental_completo(int fundamental_completo) {
		this.fundamental_completo = fundamental_completo;
	}

	public int getMedio_incompleto() {
		return medio_incompleto;
	}

	public void setMedio_incompleto(int medio_incompleto) {
		this.medio_incompleto = medio_incompleto;
	}

	public int getMedio_completo() {
		return medio_completo;
	}

	public void setMedio_completo(int medio_completo) {
		this.medio_completo = medio_completo;
	}

	public int getSuperior_incompleto() {
		return superior_incompleto;
	}

	public void setSuperior_incompleto(int superior_incompleto) {
		this.superior_incompleto = superior_incompleto;
	}

	public int getSuperior_completo() {
		return superior_completo;
	}

	public void setSuperior_completo(int superior_completo) {
		this.superior_completo = superior_completo;
	}

}
