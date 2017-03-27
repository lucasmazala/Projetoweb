package br.com.projetoweb.dao;

import org.junit.Test;

import br.com.projetoweb.entity.Municipio;

public class MunicipioDAOTeste {
	@Test
	public void salvar(){
		Municipio mun = new Municipio();
		mun.setCod_Municipio(87654321);
		mun.setMunicipio("TesteInsert");
		
		MunicipioDAO munDAO = new MunicipioDAO();
		munDAO.salvar(mun);
	}
}
