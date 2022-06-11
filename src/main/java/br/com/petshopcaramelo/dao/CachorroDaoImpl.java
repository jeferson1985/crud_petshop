
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Cachorro;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jeferson
 */
public class CachorroDaoImpl extends BaseDaoImpl<Cachorro, Long> implements CachorroDao, Serializable{

    @Override
    public Cachorro pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Cachorro.class, id);
    }
    
}
