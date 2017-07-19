package br.com.projetoweb.bean;

import org.junit.Ignore;
import org.junit.Test;

public class SetorPublicoMinicipalBEANTest {
	
	@Test
	//@Ignore
	public void listar(){
	SetorPublicoMunicipalBEAN setorPublicoMunicipalDAO = new SetorPublicoMunicipalBEAN();
	setorPublicoMunicipalDAO.listar();
	}
}
	
