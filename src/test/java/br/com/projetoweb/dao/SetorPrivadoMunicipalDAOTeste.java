package br.com.projetoweb.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoweb.entity.SetorPrivadoMunicipal;

public class SetorPrivadoMunicipalDAOTeste {

	@Test
	@Ignore
	public void salvar(){
		SetorPrivadoMunicipalDAO spmDAO = new SetorPrivadoMunicipalDAO();
		SetorPrivadoMunicipal spm = new SetorPrivadoMunicipal();
		spm.setMunicipio("municipioTESte");
		spm.setAno("2012");
		spm.setEntidade_empresa_estatal(7221);
		spm.setEntidade_empresa_privada(7922);
		spm.setEntidade_sem_fins_lucrativos(7833);
		spm.setPessoa_fisica_outras_organizaçoes_legais(77744);
		spmDAO.salvar(spm);
	};
	@Test
	@Ignore
	public void listar(){
		SetorPrivadoMunicipalDAO spmDAO = new SetorPrivadoMunicipalDAO();
		
		for(SetorPrivadoMunicipal spm:spmDAO.listar()){
		
			System.out.println("\n Ano: " +spm.getAno() +
					"\n Municipio: " +spm.getMunicipio() +
					"\n Entidade_empresa_estatal: " +spm.getEntidade_empresa_estatal() +
					"\n Entidade_empresa_privada: " +spm.getEntidade_empresa_privada() +
					"\n Entidade_sem_fins_lucrativos: " +spm.getEntidade_sem_fins_lucrativos() +
					"\n Pessoa_fisica_outras_organizaçoes_legais: " +spm.getPessoa_fisica_outras_organizaçoes_legais() +
					"\n Codigo: " +spm.getCodigo());
		}
		
	}
	
	@Test
	@Ignore
	public void listarByAno(){
		SetorPrivadoMunicipalDAO spmDAO = new SetorPrivadoMunicipalDAO();
		
		for(SetorPrivadoMunicipal smp:spmDAO.listarByAno("2012")){
		
			System.out.println("\n Ano: " +smp.getAno() +
					"\n Municipio: " +smp.getMunicipio() +
					"\n Entidade_empresa_estatal: " +smp.getEntidade_empresa_estatal() +
					"\n Entidade_empresa_privada: " +smp.getEntidade_empresa_privada() +
					"\n Entidade_sem_fins_lucrativos: " +smp.getEntidade_sem_fins_lucrativos() +
					"\n Pessoa_fisica_outras_organizaçoes_legais: " +smp.getPessoa_fisica_outras_organizaçoes_legais() +
					"\n Codigo: " +smp.getCodigo());
		}
		
	}
}
