package br.com.projetoweb.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.projetoweb.util.HibernateUtil;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDAO<Entity> {
	// <Entity> será substituído pelas entidades criadas no pacote entity

	private Class<Entity> classe;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		/*construtor
		 * criado para que na hora da pesquisa com o hibernate, saber qual
		 * entidade(entity) ele estará buscando, pq quando está no genericDAO
		 * essa informação não é possível
		 */
		this.classe = (Class<Entity>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
		/*
		 * api reflection= serve para ler irformações sobre classes e atributos
		 * e métodos em tempo de execução
		 */

		/*
		 * get class pega a classe atual,getGenericSuperclass()) pega o tipo
		 * genérico, getActualTypeArguments pega o tipo dele e passa para a
		 * classe EX: GenericDAO<Municipio> pegaria o Município da classe
		 * municipioDAO
		 */
	}

	public void salvar(Entity entidade) {
		/*
		 * captura uma sessão aberta. Receberá uma sessão do nosso hibernate
		 * util
		 */
		// get pega nossa fábrica de sessão
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		// transaction do org.Hibernat
		/*
		 * controla transações, ou completa a transação ou cancela se não
		 * finalizar
		 */
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
			/*
			 * usa excessões não checadas(em tempo de execução)=
			 * RuntimeException
			 */

			// if != null a transacao começou mas nao terminou entao faz o if
			if (transacao != null) {
				transacao.rollback(); // desfaz a transação aberta
			}
			throw erro;/*
						 * obrigatório pois ele lança para as camadas superiores
						 * a mensagem de erro
						 */
		} finally { // finally é executado se deu certo ou errado
			/*
			 * obrigatório fechar a sessao, para nao gastar recurso do servidor
			 * atoa
			 */
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	/* <Entity> é o tipo genérico, o list trabalha com tipo genérico */
	public List<Entity> listar() {
		// precisa abrir uma sessao
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		// não precisa de transação pq aqui só consulta, não altera nem edita
		try {
			// criteria que vai realizar a consulta
			Criteria consulta = sessao.createCriteria(classe);
			/*
			 * O classe recebera a ClasseDAO instanciada. Se não fosse usado
			 * genericDAO onde está (classe), seria o nome da classeDAO EX:
			 * ...createCriteria(MunicipioDAO); Teria que ser feito para cada
			 * classe DAO. Por isso precisou fazer o construtor com o API
			 * reflection
			 */

			// variável criada para guardar o resultado
			List<Entity> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}
	
	public List<Entity> listarByAno(String ano) {
		// precisa abrir uma sessao
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		// não precisa de transação pq aqui só consulta, não altera nem edita
		try {
			// criteria que vai realizar a consulta
			Criteria consulta = sessao.createCriteria(classe)
					.add(Restrictions.like("ano", ano, MatchMode.START));
			/*
			 * O classe recebera a ClasseDAO instanciada. Se não fosse usado
			 * genericDAO onde está (classe), seria o nome da classeDAO EX:
			 * ...createCriteria(MunicipioDAO); Teria que ser feito para cada
			 * classe DAO. Por isso precisou fazer o construtor com o API
			 * reflection
			 */

			// variável criada para guardar o resultado
			List<Entity> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	}

	@SuppressWarnings("unchecked")
	/* Buscar é usado para mexer com operações de excluir ou editar */
	public Entity buscar(int codigo) {
		// precisa abrir uma sessao
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		// não precisa de transação pq aqui só buscar, não altera nem edita
		try {
			Criteria consulta = sessao.createCriteria(classe);
			/* idEq pega o valor do codigo passado ali em cima e compara com a
			 * chave primária da sua entidade
			 */
			consulta.add(Restrictions.idEq(codigo));
			/* restrições no critéria(igual a cláusula where) */

			/* variável criada é uma entidade. O uniqueResult serve para pegar
			 * apenas um resultado, e é preciso fazer um casting, conversão para
			 * o tipo unidade
			 *  se for para pegar mais resultados usar um list.
			 */
			Entity resultado = (Entity) consulta.uniqueResult();
			return resultado;
		} catch (RuntimeException erro) {
			throw erro;
		} finally {
			sessao.close();
		}
	} //good
		
	public void excluir(Entity entidade) {
		//muito parecido com o metódo de adicionar
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {

			if (transacao != null) {
			}
			throw erro;
		} finally { 
			sessao.close();
		}
	}
	
	public void editar(Entity entidade) {
		//muito parecido com o metódo de adicionar e excluir
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
			transacao.commit();
		} catch (RuntimeException erro) {

			if (transacao != null) {
			}
			throw erro;
		} finally { 
			sessao.close();
		}
	}

}
