package br.com.projetoweb.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricadesessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricadesessoes().close();
	}
}
