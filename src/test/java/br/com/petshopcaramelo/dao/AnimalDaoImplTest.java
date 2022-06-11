package br.com.petshopcaramelo.dao;

import br.com.petshopcaramelo.entidade.Animal;
import static br.com.petshopcaramelo.util.GeradorUtilPetShop.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeferson
 */
public class AnimalDaoImplTest {

    private Animal animal;
    private AnimalDao animalDao;
    private Session sessao;

    public AnimalDaoImplTest() {
        animalDao = new AnimalDaoImpl();
    }

    //@Test
    public void testSalvar() {
        System.out.println("salvar animal");
        animal = new Animal(gerarNome(), new Date(), new Double(33.6), "Masculino", "Animal extremamente perigoso");
        sessao = HibernateUtil.abrirConexao();
        animalDao.salvarOuAlterar(animal, sessao);
        sessao.close();
        assertNotNull(animal.getId());

    }

    //@Test
    public void testPesquisarPorId() {

    }

    public Animal buscarAnimalBd() {
        sessao = HibernateUtil.abrirConexao();
        Query<Animal> consulta = sessao.createQuery("from Animal");
        List<Animal> animais = consulta.getResultList();
        sessao.close();

        if (animais.isEmpty()) {
            testSalvar();
        } else {
            animal = animais.get(0);
        }
        return animal;
    }

}
