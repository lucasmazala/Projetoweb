package br.com.projetoweb.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static final SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();
	
	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}

	private static SessionFactory criarFabricaDeSessoes() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			 Configuration configuracao = new Configuration().configure();
			 
			 ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			 SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			 
			 return fabrica;
		
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("A fábrica de sessões não pode ser criada. Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}


}
