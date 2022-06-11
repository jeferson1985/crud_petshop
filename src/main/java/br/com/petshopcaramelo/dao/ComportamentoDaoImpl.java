
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Comportamento;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;


/**
 *
 * @author jefersson
 */
public class ComportamentoDaoImpl extends BaseDaoImpl<Comportamento, Long> implements ComportamentoDao, Serializable{

    @Override
    public Comportamento pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Comportamento.class, id);
    }

    @Override
    public List<Comportamento> pesquisarComportamentos(String comportamento, Session sessao) throws HibernateException {
        Query<Comportamento> query = sessao.createQuery("from Comportamento *");
        return query.getResultList();
    }

    @Override
    public Comportamento pesquisarComportamentoPorId(String id, Session sessao) throws HibernateException {
       Query<Comportamento> query = sessao.createQuery("from Comportamento c where c.id = :idComportamento");
       query.setParameter("dComportamento", id);
       return query.getSingleResult();
    }
    
}
