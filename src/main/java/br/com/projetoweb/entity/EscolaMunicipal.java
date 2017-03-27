package br.com.projetoweb.entity;

public class EscolaMunicipal {

	private Municipio municipio;
	private int ano;
	private int analfabeto;
	private int ate_5º_incompleto;
	private int fundamental_completo_5º;
	private int de_6ªa9º_fundamental;
	private int fundamental_completo;
	private int medio_incompleto;
	private int medio_completo;
	private int superior_incompleto;
	private int superior_completo;

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

	public int getAnalfabeto() {
		return analfabeto;
	}

	public void setAnalfabeto(int analfabeto) {
		this.analfabeto = analfabeto;
	}

	public int getAte_5º_incompleto() {
		return ate_5º_incompleto;
	}

	public void setAte_5º_incompleto(int ate_5º_incompleto) {
		this.ate_5º_incompleto = ate_5º_incompleto;
	}

	public int getFundamental_completo_5º() {
		return fundamental_completo_5º;
	}

	public void setFundamental_completo_5º(int fundamental_completo_5º) {
		this.fundamental_completo_5º = fundamental_completo_5º;
	}

	public int getDe_6ªa9º_fundamental() {
		return de_6ªa9º_fundamental;
	}

	public void setDe_6ªa9º_fundamental(int de_6ªa9º_fundamental) {
		this.de_6ªa9º_fundamental = de_6ªa9º_fundamental;
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