/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshopcaramelo.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Silvio
 */
public class GeraTabela {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.
                           createEntityManagerFactory("petshop_caramelo_pu");        
        emf.close();
    }
}
