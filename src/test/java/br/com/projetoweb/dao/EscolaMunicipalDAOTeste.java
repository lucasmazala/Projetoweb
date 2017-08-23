package br.com.projetoweb.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.projetoweb.entity.EscolaMunicipal;

public class EscolaMunicipalDAOTeste {

	@Test
	@Ignore
	public void salvar() {
		EscolaMunicipalDAO escolaMunicipalDAO = new EscolaMunicipalDAO();
		EscolaMunicipal escola = new EscolaMunicipal();
		escola.setMunicipio("municipioteste");
		escola.setAno("2015");
		escola.setAnalfabeto(2);
		escola.setAte_5_incompleto(34);
		escola.setFundamental_completo_5(94);
		escola.setDe_6a9_fundamental(512);
		escola.setFundamental_completo(616);
		escola.setMedio_incompleto(9143);
		escola.setMedio_completo(91222);
		escola.setSuperior_incompleto(821);
		escola.setSuperior_completo(7712);

		escolaMunicipalDAO.salvar(escola);
	}

	@Test
	@Ignore
	public void listar() {

		EscolaMunicipalDAO escolaMunicipalDAO = new EscolaMunicipalDAO();
		List<EscolaMunicipal> lista = escolaMunicipalDAO.listar();
		for (EscolaMunicipal escMunicipal : lista) {
			System.out.println("\n Município= " + escMunicipal.getMunicipio()+ "\n ano= "
					+ escMunicipal.getAno() + "\n Analfabeto= " + escMunicipal.getAnalfabeto() + "\n Ate_5º_incompleto "
					+ escMunicipal.getAte_5_incompleto() + "\n Fundamental_completo_5º "
					+ escMunicipal.getFundamental_completo_5() + "\n De_6ªa9º_fundamental "
					+ escMunicipal.getDe_6a9_fundamental() + "\n Fundamental_completo "
					+ escMunicipal.getFundamental_completo() + "\n Medio_incompleto "
					+ escMunicipal.getMedio_incompleto() + "\n Medio_completo " + escMunicipal.getMedio_completo()
					+ "\n Superior_incompleto " + escMunicipal.getSuperior_incompleto() + "\n Superior_completo "
					+ escMunicipal.getSuperior_completo() + "\n codigo" + escMunicipal.getCodigo() );
		}
	}

	@Test
	@Ignore
	public void listarByAno() {

		EscolaMunicipalDAO escolaMunicipalDAO = new EscolaMunicipalDAO();
		List<EscolaMunicipal> lista = escolaMunicipalDAO.listarByAno("2015");
		for (EscolaMunicipal escMunicipal : lista) {
			System.out.println("\n Município= " + escMunicipal.getMunicipio()+ "\n ano= "
					+ escMunicipal.getAno() + "\n Analfabeto= " + escMunicipal.getAnalfabeto() + "\n Ate_5º_incompleto "
					+ escMunicipal.getAte_5_incompleto() + "\n Fundamental_completo_5º "
					+ escMunicipal.getFundamental_completo_5() + "\n De_6ªa9º_fundamental "
					+ escMunicipal.getDe_6a9_fundamental() + "\n Fundamental_completo "
					+ escMunicipal.getFundamental_completo() + "\n Medio_incompleto "
					+ escMunicipal.getMedio_incompleto() + "\n Medio_completo " + escMunicipal.getMedio_completo()
					+ "\n Superior_incompleto " + escMunicipal.getSuperior_incompleto() + "\n Superior_completo "
					+ escMunicipal.getSuperior_completo() + "\n codigo" + escMunicipal.getCodigo() );
		}
	}

//	@Test
//	public void bucar() {
//		int ano = 2015;
//		EscolaMunicipalDAO escolaMunicipalDAO = new EscolaMunicipalDAO();
//		List<EscolaMunicipal> lista = escolaMunicipalDAO.listarAno(ano);
//		for (EscolaMunicipal escMunicipal : lista) {
//			System.out.println("\n Município= " + escMunicipal.getMunicipio().getMunicipio() + "\n ano= "
//					+ escMunicipal.getAno() + "\n Analfabeto= " + escMunicipal.getAnalfabeto() + "\n Ate_5º_incompleto "
//					+ escMunicipal.getAte_5º_incompleto() + "\n Fundamental_completo_5º "
//					+ escMunicipal.getFundamental_completo_5º() + "\n De_6ªa9º_fundamental "
//					+ escMunicipal.getDe_6ªa9º_fundamental() + "\n Fundamental_completo "
//					+ escMunicipal.getFundamental_completo() + "\n Medio_incompleto "
//					+ escMunicipal.getMedio_incompleto() + "\n Medio_completo " + escMunicipal.getMedio_completo()
//					+ "\n Superior_incompleto " + escMunicipal.getSuperior_incompleto() + "\n Superior_completo "
//					+ escMunicipal.getSuperior_completo());
//		}
//	}

}
