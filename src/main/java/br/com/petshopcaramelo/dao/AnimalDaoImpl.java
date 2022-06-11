
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Animal;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;



/**
 *
 * @author jeferson
 */
public class AnimalDaoImpl  extends BaseDaoImpl<Animal, Long> implements AnimalDao, Serializable{

    @Override
    public Animal pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Animal.class, id);
    }

//    @Override
//    public List<Animal> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
//        Query<Animal> query = sessao.createQuery("from Animal a where a.nome = :nome");
//        query.setParameter("nome", "%" + nome + "%");
//        return query.getResultList();
//    }

    @Override
    public List<Animal> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
