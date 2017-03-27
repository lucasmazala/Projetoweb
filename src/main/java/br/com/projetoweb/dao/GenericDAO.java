package br.com.projetoweb.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.projetoweb.util.HibernateUtil;

public class GenericDAO<Entity> {
	// <Entity> será substituído pelas entidades criadas no pacote entity

	public void salvar(Entity entidade) {
		/* captura uma sessão aberta. Receberá uma sessão do nosso hibernate
		 util*/
		// get pega nossa fábrica de sessão
		Session sessao = HibernateUtil.getFabricadesessoes().openSession();
		// transaction do org.Hibernat
		/* controla transações, ou completa a transação ou cancela se não
		 finalizar*/
		Transaction transacao = null;
		try {
			// transacao começa aqui.
			transacao = sessao.beginTransaction();
			/*
			 * salva a entidade, como a nossa criada é generica, então
			 * passaremos o objeto Entity entidade criado lá em cima
			 */
			sessao.save(entidade);
			// cofirmar transacao com commit,transação acaba aqui.
			transacao.commit();
		} catch (RuntimeException erro) {
			/* usa excessões não checadas(em tempo de execução)=
			 RuntimeException */

			// if != null a transacao começou mas nao terminou entao faz o if
			if (transacao != null) {
				transacao.rollback(); // desfaz a transação aberta
			}
			throw erro;/* obrigatório pois ele lança para as camadas superiores
						 a mensagem de erro */
		} finally { // finally é executado se deu certo ou errado
			/* obrigatório fechar a sessao, para nao gastar recurso do servidor
			 atoa*/
			sessao.close();
		}
	}
}
