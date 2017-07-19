package br.com.projetoweb.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoweb.entity.SetorPublicoMunicipal;

public class SetorPublicoMunicipalDAOTeste {

	@Test
	@Ignore
	public void salvar(){
		SetorPublicoMunicipalDAO spmDAO = new SetorPublicoMunicipalDAO();
		SetorPublicoMunicipal spm = new SetorPublicoMunicipal();
		spm.setMunicipio("municipioTESte");
		spm.setAno("2015");
		spm.setSetor_publico_estadual(98721);
		spm.setSetor_publico_federal(98722);
		spm.setSetor_publico_municipal(98783);
		spm.setSetor_publico_outros(78744);
		spmDAO.salvar(spm);
	}
	
	@Test
	@Ignore
	public void listar(){
		SetorPublicoMunicipalDAO spmDAO = new SetorPublicoMunicipalDAO();
		for(SetorPublicoMunicipal spm: spmDAO.listar()){
			System.out.println("\n Ano: " +spm.getAno() +
					"\n Municipio: " + spm.getMunicipio() +
					"\n Setor_publico_municipal: " + spm.getSetor_publico_municipal()+
					"\n Setor_publico_estadual: " + spm.getSetor_publico_estadual()+
					"\n Setor_publico_federal: " + spm.getSetor_publico_federal()+
					"\n Setor_publico_outros: " + spm.getSetor_publico_outros()+
					"\n Codigo: " + spm.getCodigo());
		}
	}
	
	@Test
	@Ignore
	public void listarByAno(){
		SetorPublicoMunicipalDAO spmDAO = new SetorPublicoMunicipalDAO();
		for(SetorPublicoMunicipal spm: spmDAO.listarByAno("2013")){
			System.out.println("\n Ano: " +spm.getAno() +
					"\n Municipio: " + spm.getMunicipio() +
					"\n Setor_publico_municipal: " + spm.getSetor_publico_municipal()+
					"\n Setor_publico_estadual: " + spm.getSetor_publico_estadual()+
					"\n Setor_publico_federal: " + spm.getSetor_publico_federal()+
					"\n Setor_publico_outros: " + spm.getSetor_publico_outros()+
					"\n Codigo: " + spm.getCodigo());
		}
	}
}
