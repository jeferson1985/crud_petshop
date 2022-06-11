
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Animal;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jeferson
 */
public interface AnimalDao extends BaseDao<Animal, Long>{
   List<Animal> pesquisarPorNome(String nome, Session sessao) throws HibernateException;
}
