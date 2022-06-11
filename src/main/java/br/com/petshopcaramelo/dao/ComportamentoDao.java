
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Comportamento;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jeferson
 */
public interface ComportamentoDao extends BaseDao<Comportamento, Long>{
   List<Comportamento> pesquisarComportamentos(String comportamento, Session sessao) throws HibernateException;
   
   Comportamento pesquisarComportamentoPorId(String comportamentoId, Session sessao) throws HibernateException;
}
