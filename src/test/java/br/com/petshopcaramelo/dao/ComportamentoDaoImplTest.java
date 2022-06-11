package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Animal;
import br.com.petshopcaramelo.entidade.Comportamento;
import static br.com.petshopcaramelo.util.GeradorUtilPetShop.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeferson
 */
public class ComportamentoDaoImplTest {

    private Comportamento comportamento;
    private ComportamentoDao comportamentoDao;
    private Session sessao;

    public ComportamentoDaoImplTest() {
        comportamentoDao = new ComportamentoDaoImpl();
    }

    //@Test
    public void testSalvarComportamento() {
        System.out.println("salvar Comportamento");
        AnimalDaoImplTest adit = new AnimalDaoImplTest();
        comportamento = new Comportamento(gerarComportamentos(), "Animal costuma ser amigável no início, mas nunca confie", false);
        comportamento.setAnimal(adit.buscarAnimalBd());
        sessao = HibernateUtil.abrirConexao();
        comportamentoDao.salvarOuAlterar(comportamento, sessao);
        assertNotNull(comportamento.getId());

    }
    
    //@Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");

    }

}
