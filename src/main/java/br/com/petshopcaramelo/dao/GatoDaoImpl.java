
package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Gato;
import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author jeferson
 */
public class GatoDaoImpl extends BaseDaoImpl<Gato, Long> implements GatoDao, Serializable{

    @Override
    public Gato pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Gato.class, id);
    }
    
}
